package LLD.DesignPatterns.Creational.Factory;

public class PaymentFactory {
    public static PaymentProcessor getPaymentInstance(String type){
        if(type.equals("UPI")){
            return new UPIPayment();
        }else if(type.equals("Debit Card")){
            return  new DebitCardPayment();
        }
        return  null;
    }
}
