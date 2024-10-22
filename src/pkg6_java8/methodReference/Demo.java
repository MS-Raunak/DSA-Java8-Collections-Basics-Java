package pkg6_java8.methodReference;

/**
 * Unlike lambda expression it is also used to provide implementation to the interface.
 * Method reference is used to provide existing method implementation to the functional interface.
 * we can access method reference by using ::(method reference delemeter ).
 * If existing method is non-static=> obj::methodName;
 * If existing method is static=> className::methodName;
 */

@FunctionalInterface
interface  MyInterface{
    void m1();
}

public class Demo {
    public void m1() {
        System.out.println("m1 implemented");
    }

    public static void main(String[] args) {
        MyInterface myInterface = new Demo()::m1; //providing existing method reference implementation
        myInterface.m1();
    }
}
