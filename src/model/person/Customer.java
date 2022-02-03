package model.person;

import java.util.Date;

public class Customer extends Person {

    protected String address;
    protected String phoneNumber;

    public Customer(int id, String name, String lastName1, String lastName2, Date dateBirth, float height, String address, String phoneNumber) {
        super(id, name, lastName1, lastName2, dateBirth, height);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\naddress: " + address + ", phoneNumber: " + phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
