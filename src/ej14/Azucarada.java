package ej14;

/**
 *
 * @author Ángel Serrano García
 */
public class Azucarada extends Bebida{
    
    private int _discount;
    private int _sugar;

    private Azucarada() {
    }

    public Azucarada(String code, int vol, float price, String company, int sugar, boolean discount) {
        super(code, vol, price, company);
        this._sugar = sugar;
        if(discount){
            this._discount = 10;
        }else{
            this._discount = 0;
        }
    }

    public void setNoDiscount() {
        this._discount = 0;
    }
    
    public void setDiscount() {
        this._discount = 10;
    }

    public int getDiscount() {
        return _discount;
    }

    public int getSugar() {
        return _sugar;
    }

    public void setSugar(int _sugar) {
        this._sugar = _sugar;
    }

    @Override
    public String toString() {
        return "Bebida azucarada " + super.toString()+ " con " + this._sugar +"% de azucar" + ((this._discount==10)?" con descuento del 10%":"");
    }

    
    
}
