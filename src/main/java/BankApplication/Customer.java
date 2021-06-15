package BankApplication;

import java.util.List;

public class Customer {
    private String customerFirstName;
    private String customerLastName;
    private String logInName;
    private String password;
    private String emailAddress;
    private List<String> listOfPaymentBankAccounts;
    private List<String> listOfSavingsBankAccounts;

    // CONSTRUCTOR:
    public Customer(String customerFirstName, String customerLastName, String logInName, String password,
                    String emailAddress, List<String> listOfPaymentBankAccounts, List<String> listOfSavingsBankAccounts) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.logInName = logInName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.listOfPaymentBankAccounts = listOfPaymentBankAccounts;
        this.listOfSavingsBankAccounts = listOfSavingsBankAccounts;
    }

    // GETTERS:
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getLogInName() {
        return logInName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public List<String> getListOfPaymentBankAccounts() {
        return listOfPaymentBankAccounts;
    }

    public List<String> getListOfSavingsBankAccounts() {
        return listOfSavingsBankAccounts;
    }
}
