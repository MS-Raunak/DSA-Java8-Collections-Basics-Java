package pkg6_java8.predicatefunctionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//1.Print the employee whose salary is greater than 5000
//2.Print employees whose salary is greater than 5000
public class P4_PrintEmpInfo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 2000, "M"),
                new Employee("Femini", 7000, "F"),
                new Employee("Jonathon", 4000, "M"),
                new Employee("Kalish", 9000, "F"),
                new Employee("Jonson", 20000, "M"),
                new Employee("Benauri", 1000, "F"));


        printEmpBasedOnSal(employees);
        System.out.println("==========================================");
        pritFemEmpInfoBasedOnSal(employees);

    }


    //Print employees whose salary is greater than 5000
    private static void printEmpBasedOnSal(List<Employee> employees) {
        Predicate<Employee> predicate = employee -> employee.salary > 5000;

        for (Employee employee : employees){
            if (predicate.test(employee))
                System.out.println(employee);
        }
    }

    //Print female employees whose salary is greater than 5000
    private static void pritFemEmpInfoBasedOnSal(List<Employee> employees) {
        Predicate<Employee> predicate = employee -> employee.gender=="F" && employee.salary > 5000;

        for (Employee employee : employees) {
            if (predicate.test(employee))
                System.out.println(employee);
        }
    }
}
