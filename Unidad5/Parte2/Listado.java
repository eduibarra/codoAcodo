import java.util.Random;
import java.util.ArrayList;

class Listado{
    
    public ArrayList<Integer> numeros(){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random aleatorio = new Random();
        int tamanio = aleatorio.nextInt(16) + 5;
        for (int i = 0; i < tamanio; i++) {
            numeros.add(aleatorio.nextInt(101));
        }
        return numeros;
    }

    public int sumar(ArrayList<Integer> lista){
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    public float media(int suma, int tamanio){
        return (suma / tamanio);
    }
}