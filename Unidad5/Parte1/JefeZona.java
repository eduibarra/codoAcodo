public class JefeZona extends Empleado {

    public JefeZona(String nom, String ape, String dni, String dir, String tel, double sal){
        super(nom, ape, dni, dir, tel, sal);
    }

    public void cambiar_secretario(){

    }

    public void cambiar_coche(){

    }

    public void alta_vendedor(){

    }

    public void baja_vendedor(){

    }

    @Override
    public String toString(){
        return "Jefe de Zona: " + super.toString() 
                                + " Telefono Movil: " + telefono_movil
                                + " Area de venta: " + area_de_venta
                                + " Comision: " + comision + "}";
    }
}