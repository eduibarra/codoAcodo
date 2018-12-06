public class Empleado {

    private String nombre, apellido, dni;
	private String direccion;
	private String telefono;
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

    public void mostrar_datos(){

    }

    public void cambiar_supervisor() {
        
    }

    public float incrementar_salario(float porcentaje, float salario){
        return salario + (salario + porcentaje);
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

}