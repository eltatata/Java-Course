import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;

public class PasswordUtils {
    private static final String ALGORITHM = "PBKDF2WithHmacSHA256";
    private static final int SALT_LENGTH = 16;
    private static final int ITERATIONS = 310000;
    private static final int KEY_LENGTH = 256;

    public static String hashPassword(String password) throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] salt = generateSalt();
        byte[] hash = generateHash(password, salt);
        return encodeSaltAndHash(salt, hash);
    }

    public static boolean verifyPassword(String inputPassword, String storedHashAndSalt)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] saltAndHash = Base64.getDecoder().decode(storedHashAndSalt);
        byte[] salt = extractSalt(saltAndHash);
        byte[] storedHash = extractStoredHash(saltAndHash);
        byte[] computedHash = generateHash(inputPassword, salt);
        return MessageDigest.isEqual(computedHash, storedHash);
    }

    private static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[SALT_LENGTH];
        random.nextBytes(salt);
        return salt;
    }

    private static byte[] generateHash(String password, byte[] salt)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, ITERATIONS, KEY_LENGTH);
        SecretKeyFactory factory = SecretKeyFactory.getInstance(ALGORITHM);
        return factory.generateSecret(spec).getEncoded();
    }

    private static String encodeSaltAndHash(byte[] salt, byte[] hash) {
        byte[] saltAndHash = new byte[salt.length + hash.length];
        System.arraycopy(salt, 0, saltAndHash, 0, salt.length);
        System.arraycopy(hash, 0, saltAndHash, salt.length, hash.length);
        return Base64.getEncoder().encodeToString(saltAndHash);
    }

    private static byte[] extractSalt(byte[] saltAndHash) {
        byte[] salt = new byte[SALT_LENGTH];
        System.arraycopy(saltAndHash, 0, salt, 0, SALT_LENGTH);
        return salt;
    }

    private static byte[] extractStoredHash(byte[] saltAndHash) {
        byte[] storedHash = new byte[saltAndHash.length - SALT_LENGTH];
        System.arraycopy(saltAndHash, SALT_LENGTH, storedHash, 0, storedHash.length);
        return storedHash;
    }
}