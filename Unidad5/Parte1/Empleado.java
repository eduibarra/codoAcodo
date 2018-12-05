public class Empleado {

    private String nombre, apellido, dni, direccion, telefono;
    private double salario;
    private int antiguedad;

    public Empleado(String nom, String ape, String dni, String dir, String tel, double sal){
        this.nombre = nom;
        this.apellido = ape;
        this.dni = dni;
        this.direccion = dir;
        this.telefono = tel;
        this.salario = sal;
    }

    public int getAntiguedad() {
        return antiguedad;
    }


    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}