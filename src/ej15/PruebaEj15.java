package ej15;

/**
 *
 * @author Ángel Serrano García
 */
public class PruebaEj15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Agenda a = new Agenda();
        
        Contacto c = new Contacto(92343434, "P");
        Contacto aux = c;
        System.out.println(a.huecosLibres());
        a.annadirContacto(c);
        System.out.println(a.huecosLibres());
        
        for(int i = 0; i<12; i++){
            c = new Contacto(i, "p"+i);
            System.out.println(a.annadirContacto(c));
        }
        
        System.out.println();
        a.listarContactos();
        System.out.println();
        
        System.out.println(a.existeContacto(aux));
        System.out.println(a.existeContacto(c));
        System.out.println();
        
        a.buscaContacto(aux.getNombre());
        a.eliminarContacto(aux);
        System.out.println();
        
        System.out.println(c);
        a.buscaContacto(c.getNombre());
        
    }
    
}
