
package ej8;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Ángel Serrano García
 */
public class Profesor extends Persona{
    protected Materia asignatura;

    public Profesor(Materia asignatura, int edad, String nombre, Sexo sexo) {
        super(edad, nombre, sexo);
        this.asignatura = asignatura;
    }

    public Profesor(Materia asignatura) {
        this.asignatura = asignatura;
    }
    
  public Profesor() {
        this(Materia.Matematicas);
    }

    public Materia getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Materia asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public boolean disponible() {
        super.disponible = true;
        
        if(ThreadLocalRandom.current().nextInt(0, 100) <= 20)
            super.disponible = false;
        
        return super.disponible;
    }
    
    
}
