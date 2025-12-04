package JavaBasics.LLD.Structural.Adaptor;

public class DebitCardPayment implements PaymentGateway{

    @Override
    public void makePayment() {
        System.out.println("DebitCard Payment");
    }
}
