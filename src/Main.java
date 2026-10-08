import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OrdenandoRamales ordenando = new OrdenandoRamales();

        while (true) {

            int numeroRamales = sc.nextInt();

            if (numeroRamales == 0) {
                break;
            }

            String[] ramales = new String[numeroRamales];

            for (int i = 0; i < numeroRamales; i++) {
                String propietario = sc.next();
                String lado = sc.next();
                int distancia = sc.nextInt();

                ramales[i] = propietario + " " + lado + " " + distancia;
            }

            System.out.println(ordenando.ordenar(ramales));
            System.out.println("---");
        }

        sc.close();
    }
}