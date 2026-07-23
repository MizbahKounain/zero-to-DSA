package OOP_Principle;

abstract class ATM {
    abstract void withDraw(Double amount);

    public void showMessage() {
        System.out.println("Amount withdrawn successfully");
    }
}

class BankAtm extends ATM {
    public void withDraw(Double amount) {
        System.out.println("Checking account balance");
        System.out.println("Verifying transaction");
        System.out.println("Withdrawn " + amount);
    }
}

public class abstraction {
    public static void main(String[] args) {
        ATM atm = new BankAtm();
        atm.withDraw(5000.00);
        atm.showMessage();
    }
}

/*
 * Show what an object can do, but hide how it does it.
 * 
 * Think about an ATM. You press “Withdraw,” enter an amount, and get cash.
 * You don't need to know how the ATM communicates with the bank, checks your
 * balance,
 * verifies the transaction, or controls the cash dispenser.
 */
