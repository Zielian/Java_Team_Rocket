package BankApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankApplication {
    public static void main(String[] args) {

        // Set of customers who make use of the app
        Customer customer1 = new Customer("Johan", "Ziel", "JZiel",
                "Password123", "johan.ziel@rabobank.nl",
                Arrays.asList("NL12RABO0123456789"), Arrays.asList("NL21RABO987654321", "NL21SNSBO987654321"));
        Customer customer2 = new Customer("Jop", "Steen, van der", "JvdSteen",
                "Password123", "jop.van.der.Steen@rabobank.nl",
                Arrays.asList("NL34RABO0123456789"), Arrays.asList(("NL43RAB987654321")));
        Customer customer3 = new Customer("Ruomei", "Liu", "RLiu",
                "Password123", "roumei.liu@rabobank.nl",
                Arrays.asList("NL56ABNA0123456789", "NL56INGB0123456789"), Arrays.asList("NL65ABNA987654321", "NL65INGB987654321"));

        // List of customers
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        // Set of banks which can be configured in the app
        Bank bank1 = new Bank("Rabobank");
        Bank bank2 = new Bank("ABN Amro");
        Bank bank3 = new Bank("ING");
        Bank bank4 = new Bank("SNS Bank");

        // List of banks
        List<Bank> banks = new ArrayList<>();
        banks.add(bank1);
        banks.add(bank2);
        banks.add(bank3);
        banks.add(bank4);

        ApplicationController applicationController = new ApplicationController(customers, banks);
    }
}
