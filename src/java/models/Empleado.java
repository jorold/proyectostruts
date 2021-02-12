package models;

public class Empleado {

    private int idempleado;
    private String apellido;
    private String oficio;
    private int salario;
    private int departamento;

    public Empleado() {
    }

    public Empleado(int id, String ape, String ofi, int sal, int dep) {
        this.idempleado = id;
        this.apellido = ape;
        this.oficio = ofi;
        this.salario = sal;
        this.departamento = dep;

    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

}
