package Function; //referencia de ejemplo "cliente" profesor

public class Estudiante {
    private String nombre;
    private String curso;
    private int semestre;

    public Estudiante(String nombre, String curso, int semestre) {
        this.nombre = nombre;
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
