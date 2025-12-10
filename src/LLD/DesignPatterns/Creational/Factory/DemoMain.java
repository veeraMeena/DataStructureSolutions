package LLD.DesignPatterns.Creational.Factory;

import java.math.BigDecimal;

public class DemoMain {
    public static void main(String[] args) {
        //Factory design pattern example
        PaymentProcessor paymentProcessor = PaymentFactory.getPaymentInstance("UPI");
        OrderService orderService = new OrderService(paymentProcessor);

        orderService.makePayment(new BigDecimal(100));

    }
}
