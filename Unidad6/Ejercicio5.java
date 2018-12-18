import java.io.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        boolean continuar = true;
        while(continuar) {
            try {               
                System.out.print("Ingrese un numero >> ");
                InputStreamReader ingreso = new InputStreamReader(System.in);
                BufferedReader lectura = new BufferedReader(ingreso);
                String cadena = lectura.readLine();
                int numero = Integer.parseInt(cadena);
                System.out.println("El numero ingresado es >>  " + numero);
                continuar = false;
            } catch(Exception e) {
                System.out.println(e.getMessage());               
            }           
       }         
    }
}
