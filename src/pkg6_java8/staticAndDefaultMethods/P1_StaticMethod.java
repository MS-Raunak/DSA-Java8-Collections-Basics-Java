package pkg6_java8.staticAndDefaultMethods;

/**
 * Static method introduced in java8 to avoid to use class for only static methods
 *
 * We can access static method by using interface name only
 * To declaring static method we have to write static keyword
 * Since, from java8 we can use static method in interface so we can also declare main method
 * inside interface.
 *
 * In Java class is very costly, If class have only static method then there is no use of
 * class features it's just wastage of memory and interface is very lite so to avoid writing
 * only static method in a class Java people allow to write static method in interface
 *
 * Not: we can't override static method because ar runtime object is not available for any static methods.
 */
public interface P1_StaticMethod {
   static void m1() {
       System.out.println("Static Method");
   }

    public static void main(String[] args) {
        P1_StaticMethod.m1();
    }
}

