package JavaBasics.PyamentOrderExample;

import java.math.BigDecimal;

public class OrderService {
    PaymentProcessor paymentProcessor;

    OrderService (PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public boolean makePayment(BigDecimal amount){
        try{
            paymentProcessor.processPayments(amount);
        }catch (Exception e){
            return false;
        }
        return true;
    }

}
