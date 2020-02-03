
package ej15;

/**
 *
 * @author Ángel Serrano García
 */
public interface IAgenda {
    public boolean annadirContacto(Contacto c);
    public boolean existeContacto(Contacto c);
    public void listarContactos();
    public void buscaContacto(String nombre);
    public void eliminarContacto(Contacto c);
    public boolean agendaLlena();
    public int huecosLibres();
    
}
