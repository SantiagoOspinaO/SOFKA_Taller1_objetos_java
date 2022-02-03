import model.person.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(1, "Carlos", "Garcia", "Castro", new Date(), 56, "Vda El Capiro", "123456");
        System.out.println(customer.toString());
    }
}
