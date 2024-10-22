package pkg6_java8.consumerFunctionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class P2_PrintStudentInfo {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Bunny", 65),
                new Student("Chunny", 85),
                new Student("Rummy", 54),
                new Student("Gunny", 23),
                new Student("Jonny", 33));

        Function<Student, String> f = student -> {
            int marks = student.marks;
            String grade = "";
            if (marks >= 75) grade = "A[Distinction]";
            else if (marks >= 60 && marks < 74) grade = "B[First Class]";
            else if (marks >= 45 && marks < 59) grade = "C[Second Class]";
            else if (marks >= 33 && marks < 44) grade = "D[Second Class]";
            else grade = "E[Failed]";
            System.out.println();

            return grade;
        };

        Predicate<Student> predicate = student -> student.marks>50;

        Consumer<Student> consumer = student -> {
            System.out.println("Student Name: " + student.name);
            System.out.println("Student Marks: " + student.marks);
            System.out.println("Student Grade: " + f.apply(student));
        };

        for (Student s : studentList) {
           if (predicate.test(s)){
               consumer.accept(s);
           }
        }
    }
}
