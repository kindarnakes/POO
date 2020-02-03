package ej8;

/**
 *
 * @author Ángel Serrano García
 */
public abstract class Persona {
    protected int edad;
    protected String nombre;
    protected Sexo sexo;
    protected boolean disponible;

    
    public Persona() {
        this(0,"", Sexo.Hombre);
    }

    public Persona(int edad, String nombre, Sexo sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.disponible = this.disponible();
    }
    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sexo isSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    public abstract boolean disponible();
    
}
