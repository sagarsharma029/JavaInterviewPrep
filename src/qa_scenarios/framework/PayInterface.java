//Day 4 - Q5

package qa_scenarios.framework;

interface PaymentMethod {
    void pay();
}

class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Payment done by Credit Card.");
    }
}

class UPIPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Payment done by UPI.");
    }
}

public class PayInterface {
    public static void main(String[] args){

        PaymentMethod payment1 = new CreditCardPayment();
        payment1.pay();

        PaymentMethod payment2 = new UPIPayment();
        payment2.pay();
    }
}