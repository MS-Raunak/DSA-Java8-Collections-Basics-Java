package functionFunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class P4_Print {
    public static void printName(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Joya", "Raju", "Chhaya");

        //names.forEach(name -> System.out.println(name)); //using lambda
        names.forEach(P4_Print::printName); //using method reference
    }
}
