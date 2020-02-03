package ej14;

/**
 *
 * @author Ángel Serrano García
 */
public class Almacen {

    private Bebida[][] _bebidas;

    public Almacen(int fil, int col) {
        this._bebidas = new Bebida[fil][col];
    }

    public boolean addBebida(Bebida b) {
        boolean added = false;

        for (int i = 0; i < this._bebidas.length && !added; i++) {
            for (int j = 0; j < this._bebidas[i].length && !added; j++) {
                if (this._bebidas[i][j] == null) {
                    this._bebidas[i][j] = b;
                    added = true;
                }
            }
        }
        return added;
    }

    public Bebida search(String code) {
        Bebida b = null;

        for (int i = 0; i < this._bebidas.length && b == null; i++) {
            for (int j = 0; j < this._bebidas[i].length && b == null; j++) {
                if (this._bebidas[i][j] != null && this._bebidas[i][j].code.equals(code)) {
                    b = this._bebidas[i][j];
                }
            }
        }

        return b;
    }

    public boolean delete(String code) {
        boolean delete = false;

        for (int i = 0; i < this._bebidas.length && !delete; i++) {
            for (int j = 0; j < this._bebidas[i].length && !delete; j++) {
                if (this._bebidas[i][j] != null && this._bebidas[i][j].code.equals(code)) {
                    this._bebidas[i][j] = null;
                    delete = true;
                }
            }
        }

        return delete;
    }

    public float precioColumna(int col) {
        float precio = 0;

        if (this._bebidas.length > 0) {
            if (col >= 0 && col < this._bebidas[0].length) {
                for (int i = 0; i < this._bebidas[0].length; i++) {
                    if (this._bebidas[i][col] != null) {
                        if (this._bebidas[i][col] instanceof Azucarada) {
                            Azucarada aux = (Azucarada) this._bebidas[i][col];
                            precio += ((aux.price * ((100f - aux.getDiscount())) / 100) * aux.vol);
                        } else {
                            precio += (this._bebidas[i][col].price * this._bebidas[i][col].vol);
                        }
                    }
                }
            }
        }

        return precio;
    }

    public float precioMarca(String marca) {
        float precio = 0;

        for (int i = 0; i < this._bebidas.length; i++) {
            for (int j = 0; j < this._bebidas[i].length; j++) {
                if (this._bebidas[i][j] != null && this._bebidas[i][j].company.equals(marca)) {
                    if (this._bebidas[i][j] instanceof Azucarada) {
                        Azucarada aux = (Azucarada) this._bebidas[i][j];
                        precio += (aux.price * ((100f - aux.getDiscount())) / 100) * aux.vol;
                    } else {
                        precio += this._bebidas[i][j].price * this._bebidas[i][j].vol;
                    }
                }
            }
        }

        return precio;
    }

    public float precioTotal() {
        float precio = 0;

        if (this._bebidas.length > 0) {
            for (int i = 0; i < this._bebidas[0].length; i++) {
                precio += this.precioColumna(i);
            }
        }

        return precio;
    }

    public String info() {
        String info = "";

        for (Bebida[] i : this._bebidas) {
            for (Bebida j : i) {
                if (j != null) {
                    info += j.toString() + "\n";
                }
            }
        }

        return info;
    }

}
