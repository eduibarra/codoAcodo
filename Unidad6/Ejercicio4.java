
public class Ejercicio4{

    public static void main(String[] args) {
        try {
            throw new miPropiaExcepcion("Mi propia excepcion :v");
        } catch (miPropiaExcepcion e) {
            System.out.println("Tipo de excepcion: " + e.getCadena());
        }
    }
}

class miPropiaExcepcion extends Exception{
    private String cadena;

    public miPropiaExcepcion(String cadena){
        this.cadena = cadena;
    }

    public String getCadena(){
        return cadena;
    }

}