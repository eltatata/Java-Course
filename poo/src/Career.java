public class Career {
    String name;
    String description;
    String[] skills = new String[5];
    boolean isPopular;
    boolean isStudent;

    public Career() {}

    public Career(String name, String description, String[] skills, boolean isPopular, boolean isStudent) {
        this.name = name;
        this.description = description;
        this.skills = skills;
        this.isPopular = isPopular;
        this.isStudent = isStudent;
    }

    public void printCareer() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Is Popular: " + isPopular);
    }

    public void printSkills() {
        System.out.print("Skills: ");
        for (String string : skills) {
            System.out.print(string + ", ");
        }
        System.out.println();
    }
}
