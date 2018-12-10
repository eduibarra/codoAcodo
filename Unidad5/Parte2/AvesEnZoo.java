
public class AvesEnZoo {

    private String tipoDeAve;
    private int numeroAves, numeroMachos, numeroHembras;

    public AvesEnZoo(String tipoDeAve, int numeroAves, int numeroMachos, int numeroHembras){
        this.tipoDeAve = tipoDeAve;
        this.numeroAves = numeroAves;
        this.numeroMachos = numeroMachos;
        this.numeroHembras = numeroHembras;
    }

    public String getTipoDeAve(){
        return tipoDeAve;
    }
    public int getNumeroAves(){
        return numeroAves;
    }
    public int getNumeroMachos(){
        return numeroMachos;
    }
    public int getNumeroHembras(){
        return numeroHembras;
    }
    @Override
    public String toString(){
        String ave;
        return ave = tipoDeAve + " " 
                   + numeroAves + " " 
                   + numeroMachos + " "
                   + numeroHembras + " ";
    }
}