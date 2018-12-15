import java.util.ArrayList;
import java.util.List;

public class JefeZona extends Empleado {

    private int despacho;
    private Secretario secretario;
    private List vendedores;
    private Auto auto;

    public JefeZona(String nombre, String apellido, String dni, String direccion, String telefono, double salario, int despacho, Secretario secretario, Auto auto){
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = new ArrayList<Vendedor>();
        this.auto = auto;
    }

    public void setSecretario(Secretario secretario){
        this.secretario = secretario;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void agregarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }

    public void eliminarVendedor(Vendedor vendedor){
        vendedores.remove(vendedor);
    }

    @Override
    public void incremetarSalario() {
        salario = salario * 1.20;
    }
    @Override
    public String toString(){
        return "Jefe de Zona: " + super.toString()
                                + " Despacho: " + despacho
                                + " Secretario: " + secretario
                                + " Auto: " + auto;
    }
}