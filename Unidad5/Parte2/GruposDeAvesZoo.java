import java.util.Iterator;

public class GruposDeAvesZoo implements Iterable <AvesEnZoo> {
    private AvesEnZoo[] gruposDeAvesEnZoos;
    
    public  GruposDeAvesZoo(AvesEnZoo[] gruAvesEnZoos){
        this.gruposDeAvesEnZoos = gruposDeAvesEnZoos;
    }

    public Iterator<AvesEnZoo> iterator() {
        Iterator <AvesEnZoo> listado = new IterarGrupo();
        return listado;
    }
}