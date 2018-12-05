/*
* Veamos ahora en otro ejemplo cómo eliminar elementos de un ArrayList. 
*Se utiliza el método remove()y se puede pasar como parámetro el índice del elemento que se quiere eliminar,
*o bien el valor del elemento. O sea, a.remove(2) elimina el elemento que se encuentra en la posición 2 mientras que  
*a.remove("blanco") elimina el valor"blanco". Es importante destacar que el ArrayList se reestructura de forma automática
*después del borrado de cualquiera de sus elementos.

 */
//package arraylist04;
import java.util.ArrayList;

public class Arraylist04 {

   public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("rojo");
        a.add("verde"); a.add("azul");
        a.add("blanco"); 
        a.add("amarillo"); 
        a.add("blanco");
        
        System.out.println("Contenido de la lista: ");
        a.forEach((color) -> {
            System.out.println(color);
        });

        if (a.contains("blanco")) { 
            System.out.println("El blanco está en la lista de colores"); }
            a.remove("blanco");
            System.out.println("Contenido de la lista después de quitar la " + "primera ocurrencia del color blanco: ");
            a.forEach((color) -> {
                System.out.println(color);
            });
            a.remove(2); System.out.println("Contenido de la lista después de quitar el " + "elemento de la posición 2: ");
            a.forEach((color) -> {
                System.out.println(color);
            });
    }
}