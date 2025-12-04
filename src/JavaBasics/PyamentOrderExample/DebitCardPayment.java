package JavaBasics.PyamentOrderExample;

import java.math.BigDecimal;

public class DebitCardPayment implements PaymentProcessor, RefundProcessor{

    @Override
    public void processPayments(BigDecimal amount) {
        System.out.println("DebitCardPayment "+ amount);
    }

    @Override
    public void processRefunds(BigDecimal amount) {

    }
}
