
import java.util.Random;
import java.util.ArrayList;

class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random aleatorio = new Random();
        int tamanio = aleatorio.nextInt(16) + 5; // genera un numero entre 5 y 20
        int suma = 0;
        int maximo = 0, minimo;
        // Agregamos numeros a la lista (la lista va a tener un tamanio entre 5 y 20)
        for (int i = 0; i < tamanio; i++) {
            numeros.add(aleatorio.nextInt(101)); // genera un numero entre 0 y 100
            suma = suma + numeros.get(i);
        }
        // Buscamos el maximo
        for (int i = 0; i < tamanio; i++) {
            if (numeros.get(i) > maximo) {
                maximo = numeros.get(i);
            }
        }
        // Buscamos el minimo
        minimo = maximo;
        for (int i = 0; i < tamanio; i++) {
            if (numeros.get(i) < minimo) {
                minimo = numeros.get(i);
            }
        }
        

        System.out.println(numeros);
        System.out.println("La sema de los elementos del array es: " + suma);
        System.out.println("La media de los elementos del array es: " + (suma / numeros.size()) );
        System.out.println("El valor maximo en el array es: " + maximo);
        System.out.println("El valor minimo en el array es: " + minimo);
    }
}