package JavaBasics.PyamentOrderExample;

import java.math.BigDecimal;

public class UPIPayment implements  PaymentProcessor{


    @Override
    public void processPayments(BigDecimal amount) {
        System.out.println("Processing UPI Payments " + amount);
    }

}
