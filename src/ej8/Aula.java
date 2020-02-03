package ej8;

/**
 *
 * @author Ángel Serrano García
 */
public class Aula {

    protected int identificador;
    protected int max_alumnos;
    protected Materia asignatura;
    protected Profesor profesor;
    protected Alumno[] alumnos;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getMax_alumnos() {
        return max_alumnos;
    }

    public void setMax_alumnos(int max_alumnos) {
        this.max_alumnos = max_alumnos;
    }

    public Materia getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Materia asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public boolean addAlumno(Alumno a) {
        boolean added = false;

        if (this.alumnos.length < this.max_alumnos) {
            if (!this.dentro(a)) {
                Alumno[] aux = this.alumnos;
                this.alumnos = new Alumno[aux.length + 1];
                for (int i = 0; i < aux.length; i++) {
                    this.alumnos[i] = aux[i];
                }
                this.alumnos[this.alumnos.length - 1] = a;
                added = true;
            }
        }

        return added;
    }

    private boolean dentro(Alumno a) {
        boolean find = false;

        if (this.alumnos != null) {
            for (Alumno aux : this.alumnos) {
                if (aux != null && a != null && a.getNombre().equals(aux.getNombre())) {
                    find = true;
                }
            }

        }
        return find;
    }

}
