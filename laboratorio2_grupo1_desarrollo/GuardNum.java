package laboratorio2_grupo1_desarrollo;

import java.util.Scanner;
import java.util.Random;

public class GuardNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(30) + 1;

        int guess = 0;
        int attempts = 0;
        boolean playing = true;

        System.out.println("=== ADIVINA EL NUMERO ===");
        System.out.println("Adivina el numero del 1 al 30");
        System.out.println("Tienes 6 intentos. ¡Mucha suerte!");

        while (playing) {
            System.out.print("intento" + (attempts + 1) + "/6: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("¡GANASTE en " + attempts + " intentos!");
                playing = false;
            } else if (guess < randomNumber) {
                System.out.println("Es un numero Mayor");
            } else {
                System.out.println("El numero es Menor");
            }
            if (attempts == 3) {
                System.out.println("Mitad de camino. No te rindas");
            }
            if (attempts == 6 && guess != randomNumber) {
                System.out.println("GAME OVER. El numero era: " + randomNumber);
                playing = false;
            }
        }
        
        System.out.println("¡Gracias por jugar!");
        sc.close();
    }
}
