package JavaBasics.PyamentOrderExample;

import java.math.BigDecimal;

public class DemoMain {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new UPIPayment();
        OrderService orderService = new OrderService(paymentProcessor);

        orderService.makePayment(new BigDecimal(100));

    }
}
