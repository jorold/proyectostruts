package models;

public class Enfermo {

    private int inscripcion;
    private String apellido;
    private int nss;

    public Enfermo() {
    }

    public Enfermo(int ins, String ape, int nss) {
        this.inscripcion = ins;
        this.apellido = ape;
        this.nss = nss;
    }

    public int getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(int inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

}
