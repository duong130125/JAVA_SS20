package BT7;

import java.util.List;

public class BT7 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Quý", 26, "IT", 2500),
                new Employee("Lan", 24, "IT", 2100),
                new Employee("Minh", 30, "HR", 3000),
                new Employee("Huyền", 28, "IT", 2000),
                new Employee("Long", 32, "IT", 3100),
                new Employee("Trang", 25, "Marketing", 2200),
                new Employee("Việt", 27, "IT", 2500)
        );

        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getSalary() > 2000 && emp.getAge() >= 25 && emp.getDepartment().equals("IT"))
                .sorted((e1, e2) -> {
                    int salaryCompare = Double.compare(e2.getSalary(), e1.getSalary());
                    if (salaryCompare != 0) return salaryCompare;
                    return e1.getName().compareTo(e2.getName());
                })
                .toList();

        filteredEmployees.forEach(System.out::println);
    }
}
