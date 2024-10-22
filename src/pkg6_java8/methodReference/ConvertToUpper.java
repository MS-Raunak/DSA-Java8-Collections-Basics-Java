package pkg6_java8.methodReference;
@FunctionalInterface
interface MyInterface2 {
    String toUpper(String s);
}

public class ConvertToUpper {
    public static void main(String[] args) {
        MyInterface2 interface2 = String::toUpperCase; //implemented existing string class method reference

        String convertedInUpper =  interface2.toUpper("Chhaya");
        System.out.println(convertedInUpper);


        //Using Lambda
        System.out.println("\nInside Lambda:");
        MyInterface2 interface21 = str -> str.toUpperCase();
        System.out.println(interface21.toUpper("Chhaya"));
    }
}
