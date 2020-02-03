package ej15;

/**
 *
 * @author Ángel Serrano García
 */
public class Contacto {

    private int _telefono;
    private String _nombre;

    public Contacto(int _telefono, String _nombre) {
        this._telefono = _telefono;
        this._nombre = _nombre;
    }

    public int getTelefono() {
        return _telefono;
    }

    public void setTelefono(int _telefono) {
        this._telefono = _telefono;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equal = false;

        if (obj != null) {
            if (obj == this) {
                equal = true;
            } else if (obj instanceof Contacto) {
                Contacto aux = (Contacto) obj;
                if (aux._nombre.equals(this._nombre)) {
                    equal = true;
                }
            }
        }
        return equal;
    }

    @Override
    public String toString() {
        return "Nombre: " + _nombre + " Telefono: " + _telefono;
    }

    
    
}
