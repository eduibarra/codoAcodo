public class Vendedor extends Empleado{
    private Auto auto;
    private String telefono_movil;
    private String area_de_venta;
    private double comision;
    
    public Vendedor(Auto auto, String nombre, String apellido, String dni, String direccion, String telefono, double salario, String telefono_movil, String area_de_venta, double comision){
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.telefono_movil = telefono_movil;
        this. area_de_venta = area_de_venta;
        this.comision = comision;
        this.auto = auto;
    }

    public void cambiar_auto(Auto auto){
        this.auto = auto;
    }

    @Override
    public void incremetarSalario() {
        salario = salario * 1.10;
    }

    @Override
    public String toString(){
        return "Vendedor: " + super.toString() 
                            + " Auto: " + auto
                            + " Telefono Movil: " + telefono_movil
                            + " Area de venta: " + area_de_venta
                            + " Comision: " + comision;
    }
}