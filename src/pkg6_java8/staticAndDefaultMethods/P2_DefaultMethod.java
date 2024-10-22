package staticAndDefaultMethods;

/**
 * default method is a non-static method which we can declare inside interface only.
 * It introduced in java8.
 * It is having dummy implementation only the actual implementation is provided by implementation class
 * The purpose to use of default method is - we can add new method in existing interface without effecting
 * any implementation class.
 * It is not mandatory to override.
 * we can declare default method only inside interface
 */
public interface P2_DefaultMethod {
    default void m1(){
        System.out.println("default method");
    }

}

class Implementation implements P2_DefaultMethod {
    @Override
    public void m1() {
        System.out.println("Default method implemented");
    }

    public static void main(String[] args) {
        Implementation i = new Implementation();
        i.m1();
    }
}
