import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Department development = new Department("Development");
        Department marketing = new Department("Marketing");
        Department sales = new Department("Sales");

        List<Employee> employees = Arrays.asList(
                new Employee("Ana", 25, 3000, development),
                new Employee("Luis", 30, 4000, marketing),
                new Employee("Carlos", 35, 2500, sales),
                new Employee("Marta", 28, 3200, development),
                new Employee("Sofia", 29, 2800, marketing),
                new Employee("Pedro", 40, 5000, sales));

        List<Employee> over30SortedBySalary = employees.stream()
                .filter(e -> e.getAge() > 30)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("Employees over 30 years old, sorted by salary in descending order:");
        over30SortedBySalary.forEach(System.out::println);

        Map<Department, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("\nAverage salary by department:");
        averageSalaryByDepartment.forEach((dep, avgSalary) -> System.out.println(dep + ": " + avgSalary));

        Employee highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);

        System.out.println("\nEmployee with the highest salary:");
        System.out.println(highestPaidEmployee);

        List<String> developmentNames = employees.stream()
                .filter(e -> "Development".equals(e.getDepartment().getName()))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("\nNames of employees in the Development department:");
        developmentNames.forEach(System.out::println);

        Map<Department, Long> employeeCountByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()));

        System.out.println("\nNumber of employees by department:");
        employeeCountByDepartment.forEach((dep, count) -> System.out.println(dep + ": " + count));
    }
}
