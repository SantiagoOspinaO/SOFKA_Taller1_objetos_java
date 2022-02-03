package model.person;

import java.util.Date;

/**
 * Se crea la clase abstracta Person, ya que de esta clase heredan Customer y Seller, no sería necesario
 * crear una instancia de Person.
 */
public abstract class Person {

    /**
     * id: atributo de la clase Person.
     */
    private int id;
    /**
     * Name: atributo de la clase Person.
     */
    public String name;
    /**
     * Last name 1: atributo de la clase Person.
     */
    public String lastName1;
    /**
     * Last name 2: atributo de la clase Person.
     */
    public String lastName2;
    /**
     * Date birth: atributo de la clase Person.
     */
    public Date dateBirth;
    /**
     * Height: atributo de la clase Person.
     */
    public float height;


    /**
     * Instancia de un nuevo  Person.
     *
     * @param id        the id
     * @param name      the name
     * @param lastName1 the last name 1
     * @param lastName2 the last name 2
     * @param dateBirth the date birth
     * @param height    the height
     */
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

    /**
     * Metodo Get del atributo id.
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo Set del atributo id.
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo Get del atributo name.
     * @return the name
     */
    public String getName() {
        return name + " " + lastName1 + " " + lastName2;
    }

    /**
     * Metodo Set del atributo name.
     *
     * @param name      the name
     * @param lastName1 the last name 1
     * @param lastName2 the last name 2
     */
    public void setName(String name, String lastName1, String lastName2) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
    }

    /**
     * Metodo Get del atributo date birth.
     * @return the date birth
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Metodo Set del atributo date birth.
     * @param dateBirth the date birth
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Metodo Get del atributo height.
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * Metodo Set del atributo height.
     * @param height the height
     */
    public void setHeight(float height) {
        this.height = height;
    }
}
