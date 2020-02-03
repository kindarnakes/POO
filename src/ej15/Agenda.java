package ej15;

/**
 *
 * @author Ángel Serrano García
 */
public class Agenda implements IAgenda {

    private Contacto[] _contactos;

    public Agenda(int contactos) {
        this._contactos = new Contacto[contactos];
    }

    public Agenda() {
        this(10);
    }

    @Override
    public boolean annadirContacto(Contacto c) {
        boolean annadido = false;

        if (!this.agendaLlena()) {
            for (int i = 0; i < this._contactos.length && !annadido; i++) {
                if (this._contactos[i] == null) {
                    this._contactos[i] = c;
                    annadido = true;
                }
            }
        }

        return annadido;
    }

    @Override
    public boolean existeContacto(Contacto c) {
        boolean find = false;

        for (int i = 0; i < this._contactos.length && !find; i++) {
            if (this._contactos[i] != null && this._contactos[i].equals(c)) {
                find = true;
            }
        }

        return find;

    }

    @Override
    public void listarContactos() {

        for (Contacto c : this._contactos) {
            if (c != null) {
                System.out.println(c.toString());
            }
        }
    }

    @Override
    public void buscaContacto(String nombre) {
        boolean find = false;

        for (int i = 0; i < this._contactos.length && !find; i++) {
            if (this._contactos[0] != null && this._contactos[i].getNombre().equals(nombre)) {
                System.out.println(this._contactos[i]);
                find = true;
            }
        }
        if (!find) {
            System.out.println("Contacto no encontrado");
        }

    }

    @Override
    public void eliminarContacto(Contacto c) {

        boolean find = false;

        for (int i = 0; i < this._contactos.length && !find; i++) {
            if (this._contactos[i] != null && this._contactos[i].equals(c)) {
                System.out.println(this._contactos[i] + " ha sido eliminado");
                this._contactos[i] = null;
                find = true;
            }
        }
        if (!find) {
            System.out.println("Contacto no encontrado");
        }

    }

    @Override
    public boolean agendaLlena() {
        boolean llena = false;
        
        if (this.huecosLibres() == 0) {
            llena = true;
        }

        return llena;
    }

    @Override
    public int huecosLibres() {

        int find = 0;

        for (Contacto c : this._contactos) {
            if (c == null) {
                find++;
            }
        }

        return find;

    }

}
