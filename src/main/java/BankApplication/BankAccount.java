package BankApplication;

public class BankAccount implements Account{
    private String customerName;
    private String accountNumber;
    private double accountBalance;
    private Bank bankName;

    public BankAccount(String customerName, String accountNumber, double accountBalance, Bank bankName) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.bankName = bankName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Bank getBankName() {
        return bankName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

}
