package OOP_Principle;

class PaymentSystem {
    public void pay() {
        System.out.println("Payment is processing.....");
    }
}

class UPI extends PaymentSystem {
    public void pay() {
        System.out.println("Payment is processing using UPI......");
    }

}

class NetBanking extends PaymentSystem {
    public void pay() {
        System.out.println("Payment is processing using Net-Banking.....");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        PaymentSystem payment;
        payment = new UPI();
        payment.pay();

        payment = new NetBanking();
        payment.pay();

    }

}

/*
 * Exmample:
 * 1. Payment Processing -> Any online shopping app has different payment
 * processing methods.
 * 2. In the above example the same variable of type PaymentSystem behaves
 * differently
 */