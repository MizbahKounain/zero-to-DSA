package OOP_Principle;

class BankAccount {
    private double Balance;

    BankAccount(double Balance) {
        this.Balance = Balance;
    }

    public double getbalance() {
        return Balance;
    }

    public void setbalance(double Balance) {
        if (Balance >= 0) {
            this.Balance = Balance;
        } else {
            System.out.println("balance Cannot be Negative !");
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(5000);
        System.out.println(bank.getbalance());
        bank.setbalance(9000);
        System.out.println(bank.getbalance());

        // Invalid balance
        bank.setbalance(-1000);
        System.out.println(bank.getbalance());
    }
}

// Example: ATM Machine -->
// 1. User directly cannot access money
// 2. User interact through buttons like WithDraw/Check Balance etc.
// 3. ATM primarily validate PIN and balance before transaction