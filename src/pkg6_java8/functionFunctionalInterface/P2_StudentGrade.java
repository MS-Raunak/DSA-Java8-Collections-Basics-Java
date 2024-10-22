package functionFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
//Print students info (use Function interface)
//Print students info based on marks condition(use Predicate along with Function interface)
public class P2_StudentGrade {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Bunny", 65),
                new Student("Chunny", 85),
                new Student("Rummy", 54),
                new Student("Gunny", 23),
                new Student("Jonny", 33));

        Function<Student, String> f = student -> {
            int marks= student.marks;
            String grade="";
            if (marks >=75 ) grade = "A[Distinction]";
            else if (marks >=60 && marks<74) grade = "B[First Class]";
            else if (marks >=45 && marks<59) grade = "C[Second Class]";
            else if (marks >=33 && marks<44) grade = "D[Second Class]";
            else grade = "E[Failed]";
            System.out.println();

            return grade;
        };

        Predicate<Student> predicate = s->s.marks > 50;

        for (Student s: studentList) {
            if (predicate.test(s)) {
                System.out.println("Student Name: " + s.name);
                System.out.println("Student Marks: " + s.marks);
                System.out.println("Student Grade: " + f.apply(s));
            }

        }


    }
}
