/*
* En el siguiente ejemplo se muestra un ArrayList de números enteros.
*/
//package arraylist011;
import java.util.ArrayList;

public class Arraylist011 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(18); 
        a.add(22); 
        a.add(-30);
        System.out.println("Cantidad de elementos: " + a.size());
        System.out.println("El elemento que hay en la posición 1 es " + a.get(1));
    }
}
    

