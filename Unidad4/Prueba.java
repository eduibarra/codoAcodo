import java.util.List;
import java.util.ArrayList;
public class Prueba{
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Rojo");
        lista.add("Azul");
        lista.add("Blanco");
        lista.add("Amarillo");
        lista.add("Negro");

        System.out.println("Estos son los " +lista.size()+ " colores que tiene la lista:\n");
        for (String color : lista) {
            System.out.println("\t\t " + color);
            
        }
    }
}