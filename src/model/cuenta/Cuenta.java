package model.cuenta;

/**
 *
 * @author Ángel Serrano García
 */
public class Cuenta {
    private String _titular;
    private float _cantidad;

    
    public Cuenta(String _titular, float _cantidad) {
        this._titular = _titular;
        this._cantidad = _cantidad;
    }
    public String getTitular() {
        return _titular;
    }

    public void setTitular(String _titular) {
        this._titular = _titular;
    }

    public float getCantidad() {
        return _cantidad;
    }

    public void setCantidad(float _cantidad) {
        this._cantidad = _cantidad;
    }
    
    
}
