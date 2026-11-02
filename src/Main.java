public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro("Rocky", 4);
        Gato gato = new Gato("Michi", 2);
        Pajaro pajaro = new Pajaro("Piolín", 1);

        System.out.println("=== PERRO ===");
        perro.mostrarInformacion();
        perro.hacerSonido();

        System.out.println("\n=== GATO ===");
        gato.mostrarInformacion();
        gato.hacerSonido();

        System.out.println("\n=== PÁJARO ===");
        pajaro.mostrarInformacion();
        pajaro.hacerSonido();
    }
}
