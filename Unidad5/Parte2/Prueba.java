import java.util.ArrayList;

class Prueba{
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();
        alumnos.add("Juan");
        alumnos.add("Pepe");
        alumnos.add("Marta");

        for (String alumno: alumnos) {
            System.out.println(alumno);
        }
    }
}