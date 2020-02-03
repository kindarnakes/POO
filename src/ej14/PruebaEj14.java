package ej14;

/**
 *
 * @author Ángel Serrano García
 */
public class PruebaEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Almacen almacen = new Almacen(2, 2);

        Azucarada b = new Azucarada("1", 2, 1f, "Coca-cola", 80, false);

        almacen.addBebida(b);
        b = new Azucarada("2", 3, 1f, "Pepsi", 80, true);
        almacen.addBebida(b);

        AguaMineral ag = new AguaMineral("3", 10, 1f, "Lanjaron", "Sierra");
        almacen.addBebida(ag);


        System.out.println(almacen.info());
        System.out.println(almacen.precioColumna(0));
        System.out.println(almacen.precioColumna(1));
        System.out.println(almacen.precioTotal());
        almacen.delete("3");
        System.out.println(almacen.precioTotal());
    }

}
