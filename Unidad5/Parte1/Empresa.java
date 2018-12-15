public class Empresa {

    public static void main(String[] args) {
        Secretario s1 = new Secretario("Juan", "Perez", "29983773", "Saavedra 2344", "4451-5454", 17500, 7, "4451-3232");
        Auto auto1 = new Auto("Chevrolet", "Corsa", "DNK237");
        Auto auto2 = new Auto("Peugeot", "206", "FZD158");
        Vendedor v1 = new Vendedor(auto1, "Roberto", "Pereyra", "1212434", "Mitre 554", "4322-4233", 18000, "11-6845-3322", "Moreno", 15);
        JefeZona j1 = new JefeZona("Beto", "Ifran", "23333556", "Jujuy 443", "11-5443-6657", 25000, 1, s1, auto2);
 //       System.out.println(s1);
 //       s1.incremetarSalario();
 //       System.out.println("\nSecretario con incremento de salario: \n" + s1);
//        System.out.println(v1);
//        v1.cambiar_auto(auto2);
//        v1.incremetarSalario();
//        System.out.println("\n" + v1);
        System.out.println(j1);
    }    
}