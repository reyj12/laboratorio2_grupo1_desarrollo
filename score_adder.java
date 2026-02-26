package laboratorio2_grupo1_desarrollo;

import java.util.Scanner;

public class score_adder {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        int marcador = 0;

        do {
            System.out.println("\n===== MARCADOR DE PUNTOS =====");
            System.out.println("1. Sumar puntos");
            System.out.println("2. Restar puntos");
            System.out.println("3. Ver marcador");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese los puntos a sumar: ");
                    marcador += sc.nextInt();
                    System.out.println("Puntos sumados correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese los puntos a restar: ");
                    marcador -= sc.nextInt();
                    System.out.println("Puntos restados correctamente.");
                    break;

                case 3:
                    System.out.println("Marcador actual: " + marcador);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 4);

        sc.close();
    }
}