import java.util.*;

public class Ejercicio2 {
    public static float division;
    public static int numerador = 10;
    public static String denominador = "M";
    public static void main(String[] args) throws Exception {
        System.out.println("+++++++++++++++++ Antes de hacer la division +++++++++++++++");
        try {
            int n = Integer.parseInt(denominador);
            division = numerador / n;
            System.out.println("La instruccion se ejecuto sin errores.-");
        } catch (NumberFormatException e) {
            division = 0;
            System.out.println("Tipo de ERROR --> " + e.getMessage());
        } finally{
            System.out.println("Division: " + division);
            System.out.println("+++++++++++++++++ Despues de hacer la division ++++++++++++++");
        }
    }
    
}