import java.util.Iterator;

class IterarGrupo implements Iterator <AvesEnZoo> { 
    private int posicion;
    public IterarGrupo() {
        this.posicion = 0;
    }

    public boolean hasNext() {
        boolean resultado;
        if (posicion < gruposDeAvesEnZoos.length){
            resultado = true;
        }
        else {
            resultado = false;
        }
        return resultado;
    }

    public AvesEnZoo next() {          
        posicion++;
        return gruposDeAvesZoo[posicion-1];
    }
    
    public void remove() {
        throw new UnsupportedOperationException ("No soportado.");
    }

}