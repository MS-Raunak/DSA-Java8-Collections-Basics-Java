package pkg6_java8.lambadExpression;

@FunctionalInterface
interface MyInterface3{
    void square(int a);
}
public class P4_Square {
    public static void main(String[] args) {
        MyInterface3 interface3 = (num) -> System.out.println("Square: " + num*num);
        interface3.square(3);
    }
}
