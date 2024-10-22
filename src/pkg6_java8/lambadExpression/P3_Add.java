package pkg6_java8.lambadExpression;

@FunctionalInterface
interface MyInterface2 {
    int add(int a, int b);
}

public class P3_Add {
    public static void main(String[] args) {
        MyInterface2 interface2 = (a,b) -> a+b;

        int sum = interface2.add(10,20);
        System.out.println("Sum: "+sum );
    }
}
