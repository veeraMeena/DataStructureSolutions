package LLD.DesignPatterns.Structural.Adaptor;

public class DebitCardPayment implements PaymentGateway{

    @Override
    public void makePayment() {
        System.out.println("DebitCard Payment");
    }
}
