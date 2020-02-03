package ej14;

/**
 *
 * @author Ángel Serrano García
 */
public class Bebida {
    protected String code;
    protected int vol;
    protected float price;
    protected String company;

    public Bebida() {
    }

    public Bebida(String code, int vol, float price, String company) {
        this.code = code;
        this.vol = vol;
        this.price = price;
        this.company = company;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "con codigo: " + code + ", vol: " + vol + "l,  precio: " + price + "€/l, de la marca: " + company;
    }
    
    
}
