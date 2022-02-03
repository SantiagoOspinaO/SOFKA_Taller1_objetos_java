package model.person;


import java.util.Date;

public class Seller extends Person {

    private int idJob;


    public Seller(int id, String name, String lastName1, String lastName2, Date dateBirth, float height, int idJob) {
        super(id, name, lastName1, lastName2, dateBirth, height);
        this.idJob = idJob;
    }

    @Override
    public String toString() {
        return super.toString() + "\nidJob: " + idJob;
    }

    public void sellFruit(){
        System.out.println("Vendi una fruta");
    }

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }
}
