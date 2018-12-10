import java.util.Iterator;

public class UsarAve {
    public static void main (String [] args) {
        AvesEnZoo aves1 = new AvesEnZoo ("Aguilas ", 35, 10, 25);
        AvesEnZoo aves2 = new AvesEnZoo ("Buitres", 100, 55, 45);
        AvesEnZoo aves3 = new AvesEnZoo ("Halcones", 80, 25, 55);
        AvesEnZoo [] avesEnZoo = {aves1, aves2, aves3};

        GruposDeAvesZoo grupoDeAvesZoo = new GruposDeAvesZoo (avesEnZoo);
        //Iterator<AvesEnZoo> iterar = grupoDeAvesZoo.iterator();
        System.out.println ("TIPO   TOTAL|MACHOS|HEMBRAS");
        for (AvesEnZoo p: avesEnZoo){
            System.out.println (p.toString());
        }
    }
}   