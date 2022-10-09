package org.edwarchamale.modelo;
/**
 *
 * @author Edwar
 */
public class Estudiante extends Persona{
    String grado;
    int carnet;

    public Estudiante(String nombre, String apellido, int edad, String grado, int carnet) {
        super(nombre, apellido, edad);
        this.grado = grado;
        this.carnet = carnet;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    
    
}
