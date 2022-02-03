import model.person.Customer;

import java.util.Date;

/**
 * Se crea la clase Main.
 */
public class Main {

    /**
     * El punto de entrada de la aplicación.
     * @param args the input arguments
     */
    public static void main(String[] args) {

        /**
         * Se instancia un customer de tipo Customer.
         */
        Customer customer = new Customer(1, "Carlos", "Garcia", "Castro", new Date(), 56, "Vda El Capiro", "123456");
        /**
         * Se imprime por consola los datos del customer.
         */
        System.out.println(customer.toString());
    }
}
