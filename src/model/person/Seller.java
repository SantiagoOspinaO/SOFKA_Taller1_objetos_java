package model.person;

import java.util.Date;

/**
 * Se crea la clase Seller que hereda de la clase Person.
 */
public class Seller extends Person {

    /**
     * id: atributo de la clase Seller.
     */
    private int idJob;

    /**
     * Instancia de un nuevo Seller.
     *
     * @param id        the id
     * @param name      the name
     * @param lastName1 the last name 1
     * @param lastName2 the last name 2
     * @param dateBirth the date birth
     * @param height    the height
     * @param idJob     the id job
     */
    public Seller(int id, String name, String lastName1, String lastName2, Date dateBirth, float height, int idJob) {
        super(id, name, lastName1, lastName2, dateBirth, height);
        this.idJob = idJob;
    }

    @Override
    public String toString() {
        return super.toString() + "\nidJob: " + idJob;
    }

    /**
     * Metodo Sell fruit.
     */
    public void sellFruit(){
        System.out.println("Vendi una fruta");
    }

    /**
     * Metodo Get del atributo id job.
     * @return the id job
     */
    public int getIdJob() {
        return idJob;
    }

    /**
     * Metodo Set del atributo id job.
     * @param idJob the id job
     */
    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }
}
