package model.person;

import java.util.Date;

public abstract class Person {

    private int id;
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;


    public Person(int id, String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.id = id;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }


    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", lastName1: " + lastName1 + ", lastName2: " + lastName2
                + "\ndateBirth: " + dateBirth + "\nheight: " + height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name + " " + lastName1 + " " + lastName2;
    }

    public void setName(String name, String lastName1, String lastName2) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
