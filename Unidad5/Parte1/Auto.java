
public class Auto {
    private String marca;
    private String modelo;
    private String matricula;

    public Auto(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Auto:  Marca: '" + marca + "'" +
            ", Modelo: '" + modelo + "'" +
            ", Matricula: '" + matricula;
    }
}