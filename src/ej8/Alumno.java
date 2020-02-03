package ej8;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Ángel Serrano García
 */
public class Alumno extends Persona{
    
    protected float calificacion;

    public Alumno() {
    }

    public Alumno(float calificacion, int edad, String nombre, Sexo sexo) {
        super(edad, nombre, sexo);
        this.calificacion = calificacion;
    }



    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public boolean disponible() {
        super.disponible = false;
        
        if(ThreadLocalRandom.current().nextBoolean())
            super.disponible = true;
        
        return super.disponible;
    }
    
    
    
}
