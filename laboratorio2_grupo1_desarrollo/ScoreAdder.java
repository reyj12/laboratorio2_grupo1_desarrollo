package laboratorio2_grupo1_desarrollo;

import java.util.Scanner;

public class ScoreAdder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;
        int score = 0;

        do {
            System.out.println("\n===== MARCADOR DE PUNTOS =====");
            System.out.println("1. Sumar puntos");
            System.out.println("2. Restar puntos");
            System.out.println("3. Ver marcador");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese los puntos a sumar: ");
                    score += sc.nextInt();
                    System.out.println("Puntos sumados correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese los puntos a restar: ");
                    int points = sc.nextInt();
                    if (score - points < 0) {
                        System.out.println("No se pueden restar más puntos que los disponibles.");
                    } else {
                        score -= points;
                        System.out.println("Puntos restados correctamente.");
                    }
                    break;

                case 3:
                    System.out.println("Marcador actual: " + score);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (option != 4);

        sc.close();
    }
}
