package model.cuenta;

/**
 *
 * @author Ángel Serrano García
 */
public class Cuenta {
    private String _titul;
    private float _cantidad;

    public Cuenta() {
    }

    
    public Cuenta(String _titular, float _cantidad) {
        this._titul = _titular;
        this._cantidad = _cantidad;
    }
    public String getTitular() {
        return _titul;
    }

    public void setTitular(String _titular) {
        this._titul = _titular;
    }

    public float getCantidad() {
        return _cantidad;
    }

    public void setCantidad(float _cantidad) {
        this._cantidad = _cantidad;
    }
    
    
}
