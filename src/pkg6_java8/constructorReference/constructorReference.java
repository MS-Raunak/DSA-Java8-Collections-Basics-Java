package pkg6_java8.constructorReference;

/**
 * Unlike lambda expression and Method Reference we use Constructor Reference to enable or to provide
 * implementation for a functional interface
 * whenever functional interface method return type is non-primitive then we should go for this.
 * EX->
 * interface A{
 *     constructorReference.Bike m1();
 * }
 */

interface MyInterface{
    Bike m1();
}

class Bike {
    String brand;

    public Bike  m1() {
        return new Bike();
    }
}
public class constructorReference {
    public static void main(String[] args) {
        MyInterface myInterface = Bike::new;
        Bike bike = myInterface.m1();
        bike.brand = "TVS";
        System.out.println(bike.brand);
    }

}
