public class Secretario extends Empleado {
    private boolean despacho = true;
    private String fax;
    private final Float aumento = 0.05;

    public Secretario(boolean despacho, String fax){
        super(nom, ape, dni, dir, tel, sal);
        this.despacho = despacho;
        this.fax = fax;
    }

    public void mostrar_datos(){

    }

    public void puesto() {
        
    }
    
}