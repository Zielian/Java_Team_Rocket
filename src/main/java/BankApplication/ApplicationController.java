package BankApplication;

import java.util.List;

public class ApplicationController {

    List<Customer> customers;
    List<Bank> banks;

    public ApplicationController(List<Customer> customers, List<Bank> banks) {
        this.customers = customers;
        this.banks = banks;
    }

}
