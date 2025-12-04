package JavaBasics.LLD.Structural.Adaptor;

public class PaymentAdapter implements PaymentGateway{
   PayPalPayment payPalPayment = new PayPalPayment();

    @Override
    public void makePayment() {
        payPalPayment.makeTransaction();
    }
}
