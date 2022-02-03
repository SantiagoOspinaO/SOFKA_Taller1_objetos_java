package model.store;

import java.util.ArrayList;

/**
 * Se crea la clase Fruit.
 */
public class Fruit {

    /**
     * Name: atributo de la clase Fruit.
     */
    public String name;
    /**
     * avarageWeight: tributo de la clase Fruit.
     */
    private float averageWeight; //peso promedio
    /**
     * Colors: atributo de la clase Fruit.
     */
    public ArrayList<String> colors;


    /**
     * Instancia de una nueva Fruit.
     *
     * @param name          the name
     * @param averageWeight the average weight
     */
    public Fruit(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
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

    /**
     * Metodo Get del atributo average weight.
     * @return the average weight
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Metodo Set del atributo average weight.
     * @param averageWeight the average weight
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Metodo Get del atributo colors.
     * @return the colors
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Metodo Set del atributo colors.
     * @param colors the colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
