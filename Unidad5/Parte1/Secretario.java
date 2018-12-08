public class Secretario extends Empleado {
    private boolean despacho = true;
    private String fax;
    private final Float aumento = 0.05;

    public Secretario(String nom, String ape, String dni, String dir, String tel, double sal, boolean despacho, String fax){
        super(nom, ape, dni, dir, tel, sal);
        this.despacho = despacho;
        this.fax = fax;
    }

    public void mostrar_datos(){

    }

    public void puesto() {
        
    }

    @Override
    public String toString(){
        return "Secretario: " + super.toString() 
                              + " Despacho: " + despacho
                              + " FAX: " + fax + "}";
    }
    
}