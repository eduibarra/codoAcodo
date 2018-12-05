import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Ejercicio3
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner entrada = new Scanner(System.in);
        int max = 10;

        for (int i = 0; i < max; i++) {
            System.out.print("Introduce un numero >> ");
            numeros.add(entrada.nextInt());
        }
        Collections.sort(numeros);
        System.out.println("\n********** Listado de numeros ordenados **********\n");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}