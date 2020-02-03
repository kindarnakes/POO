package ej14;

/**
 *
 * @author Ángel Serrano García
 */
public class AguaMineral extends Bebida{
    private String _origen;

    public AguaMineral(String code, int vol, float price, String company, String _origen) {
        super(code, vol, price, company);
        this._origen = _origen;
    }

    public AguaMineral() {
    }

    public String getOrigen() {
        return _origen;
    }

    public void setOrigen(String _origen) {
        this._origen = _origen;
    }

    @Override
    public String toString() {
        return "Agua Mineral" + super.toString() + " de origen: " + _origen;
    }
    
    
    
}
