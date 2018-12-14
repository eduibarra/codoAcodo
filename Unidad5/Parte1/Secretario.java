public class Secretario extends Empleado {
    private int despacho;
    private String fax;
    //private Float;

    public Secretario(String nombre, String apellido, String dni, String direccion, String telefono, double salario, int despacho, String fax){
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    @Override
    public void incremetarSalario() {
        salario = salario * 1.05;
    }
    
    @Override
    public String toString(){
        return "Cargo: Secretario " + super.toString() 
                                    + " Despacho: " + despacho
                                    + " FAX: " + fax;
    }
    
}