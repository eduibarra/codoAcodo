public class Vendedor extends Empleado{
    private String telefono_movil;
    private String area_de_venta;
    private float comision;
    private final float aumento = 0.1;
    
    public Vendedor(String tel_movil, String area_venta, float comision){
        super(nom, ape, doc, dir, tel, sal);
        this.telefono_movil = tel_movil;
        this. area_de_venta = area_venta;
        this.comision = comision;
    }

    public void cambiar_coche(){}

}