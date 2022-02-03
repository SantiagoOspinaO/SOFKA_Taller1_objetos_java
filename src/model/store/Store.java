package model.store;

/**
 * Se crea la clase Store.
 */
public class Store {

    /**
     * Name: atributo de la clase Store.
     */
    public String name;


    /**
     * Instancia de una nueva Store.
     *
     * @param name the name
     */
    public Store(String name) {
        this.name = name;
    }


    /**
     * Metodo Get del atributo name.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo Set del atributo name.
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}
