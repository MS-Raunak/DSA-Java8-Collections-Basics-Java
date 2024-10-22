package pkg6_java8.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P3_SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Virat", 23000, "M"),
                new Employee("Mandhana",   12000, "F"),
                new Employee("Harmanprit", 32000, "F"),
                new Employee("Dhoni", 123000, "M"),

                new Employee("Virat", 123000, "M")
        );

        sortEmpByName(employees);
        sortEmpBySalary(employees);
        sortEmpBySalaryInDesc(employees);
        sortEmpByGenderInDesc(employees);
    }

    //Sort Employee Based on Name
    private static void sortEmpByName(List<Employee> employees) {
        System.out.println("Sort Employee Based On Name:\n");

        List<Employee> sortedEmployee = employees.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        sortedEmployee.forEach(System.out::println);

        System.out.println("==============================================\n");

    }

    //Sort Employee Based on Salary
    private static void sortEmpBySalary(List<Employee> employees) {
        System.out.println("Sort Employee Based On Salary:");

        List<Employee> sortedEmployee = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        sortedEmployee.forEach(System.out::println);

        System.out.println("==============================================\n");
    }

    //Sort Employee Based on Salary in Descending order
    private static void sortEmpBySalaryInDesc(List<Employee> employees) {
        System.out.println("Sort Employee Based On Salary in Desc Order:\n");

        List<Employee> sortedEmployee = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        sortedEmployee.forEach(System.out::println);

        System.out.println("==============================================\n");

    }

    //Sort Employee Based on Gender in Desc Order
    private static void sortEmpByGenderInDesc(List<Employee> employees) {
        System.out.println("Sort Employee Based On Gender in Desc:\n");

        List<Employee> sortedEmployee = employees.stream().sorted(Comparator.comparing(Employee::getGender).reversed()).toList();
        sortedEmployee.forEach(System.out::println);

        System.out.println("==============================================\n");

    }

}
