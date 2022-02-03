package model.person;

import java.util.Date;

/**
 * Se crea la clase Customer que hereda de la clase Person.
 */
public class Customer extends Person {

    /**
     * Address: atributo de la clase Customer.
     */
    protected String address;
    /**
     * Phone number: atributo de la clase Customer.
     */
    protected String phoneNumber;

    /**
     * Instancia de un nuevo Customer.
     *
     * @param id          the id
     * @param name        the name
     * @param lastName1   the last name 1
     * @param lastName2   the last name 2
     * @param dateBirth   the date birth
     * @param height      the height
     * @param address     the address
     * @param phoneNumber the phone number
     */
    public Customer(int id, String name, String lastName1, String lastName2, Date dateBirth, float height, String address, String phoneNumber) {
        super(id, name, lastName1, lastName2, dateBirth, height);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\naddress: " + address + ", phoneNumber: " + phoneNumber;
    }

    /**
     * Metodo Get del atributo address.
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Metodo Set del atributo address.
     * @param address address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Metodo Get del atributo phone number.
     * @return phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Metodo Set del atributo phone number.
     * @param phoneNumber phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
