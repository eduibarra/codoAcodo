public abstract class Empleado {

    private double salario;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private int antiguedad;
    private Empleado supervisor;

    // Constructor con parametros
    public Empleado(String nombre, String apellido, String dni, String direccion, String telefono, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public abstract void incremetarSalario();

    public void cambiarSupervisor(Empleado sup){
        this.supervisor = sup;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre
                + " Apellido: " + apellido
                + " Documento: " + dni
                + " Direccion: " + direccion
                + " Telefono: " + telefono
                + " Salario: " + salario;
    }

}