package pkg6_java8.lambadExpression;

/**
 * The function which doesn't have name or anonymous function is called as lambda expression.
 * It is used to enable lambda expression.
 * Interface reference variable contain the lambda expression.
 * It does not have return type as well.
 * We can write lambda only with functional interface
 *
 * Rule:-
 * IF only one statement then curly braces are not required.
 * IF only one statement then curly braces and return keyword not required to write.
 * Not compulsory to write argument datatype.
 *
 */
@FunctionalInterface
interface  MyInterface {
    void m1();
}

public class P1_Demo {
    public static void main(String[] args) {
        MyInterface myInterface = () -> {
            System.out.println("Lambda expression");
        };

        myInterface.m1();
}




}
