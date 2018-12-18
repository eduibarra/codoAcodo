
public class Ejercicio3 extends Exception {
    public static void main(String[] args) {
        try {
            throw new Exception("Esto es un argumento String");
        } catch (Exception e) {
            System.out.println("Captura de la excepcion: " + e.getMessage());
        }finally{
            System.out.println("Se paso por finally");
        }
    }
    
}