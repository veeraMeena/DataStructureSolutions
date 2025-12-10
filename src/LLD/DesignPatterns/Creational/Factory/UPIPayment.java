package LLD.DesignPatterns.Creational.Factory;

import java.math.BigDecimal;

public class UPIPayment implements PaymentProcessor {


    @Override
    public void processPayments(BigDecimal amount) {
        System.out.println("Processing UPI Payments " + amount);
    }

}
