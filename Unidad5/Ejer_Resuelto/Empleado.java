public class Empleado {
    
    private String nombre;
    private String apellido;
    private int edad;
    private  String direccion;
    private String dni;
    private double salario;

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
    }

    public void setDNI(String dni) {
    }

    public double getSalario() {
        return salario;
    }
/**
* Suma un plus al salario del empleado si el empleado tiene mas de 40 años pasa a ser SUPERVISOR
* @param sueldoPlus
* @return <ul>
* <li>true: se suma el plus al sueldo</li>
* <li>false: no se suma el plus al sueldo</li>
* </ul>
*/
    public boolean plus (double sueldoPlus){
        boolean aumento=false;
        if (edad>40 && compruebaNombre()){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }
//Metodos privados
    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
//Constructor
/**
* Constructor por defecto
*/
    public Empleado(){
        this.nombre="";
        this.apellido="";
        this.edad=0;
        this.direccion="";
        this.dni="";
        this.salario=0;
    }
/**
* Constructor con 6 parametros
* @param nombre nombre del empleado
* @param apellido apellido del empleado
* @param edad edad del empleado
* @param dirección dirección del empleado
* @param dni dni del empleado
* @param salario salario del empleado
*/
    public Empleado(String nombre, String apellido, int edad, String direccion, String dni, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.direccion=direccion;
        this.dni=dni;
        this.salario=salario;
    }
}
