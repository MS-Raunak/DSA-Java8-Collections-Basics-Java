package pkg6_java8.lambadExpression;

@FunctionalInterface
public interface P2_Demo2 {
    void m1();

    public static void main(String[] args) {
        P2_Demo2 demo2 = () -> {
            System.out.println("Lambda expression");
        };
        demo2.m1();
    }
}
