package SupplierFunctionalInterface;

import java.util.function.Supplier;

public class P2_OTPGenerator {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> {
            String otp = "";
            for (int i = 0; i < 5; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };

        System.out.println("OTP: " + supplier.get());



    }
}
