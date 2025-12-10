package LLD.DesignPatterns.Structural.Adaptor;

/**
 * You have an existing class, but its methods don’t match what your client code expects.
 * So you write a wrapper class to convert one interface into another.
 */
public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentAdapter();
        paymentGateway.makePayment();

        PaymentGateway paymentGateway1 = new DebitCardPayment();
        paymentGateway1.makePayment();
    }
}
