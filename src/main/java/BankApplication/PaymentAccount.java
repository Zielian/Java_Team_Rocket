package BankApplication;

public class PaymentAccount extends BankAccount{

    public PaymentAccount(String customerName, String accountNumber, double accountBalance, Bank bankName) {
        super(customerName, accountNumber, accountBalance, bankName);
    }

}
