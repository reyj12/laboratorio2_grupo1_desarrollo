package laboratorio2_grupo1_desarrollo;

import java.util.Scanner;
import java.util.Random;

public class Guard_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(30) + 1;

        int intento = 0;
        int intentos = 0;
        boolean jugando = true;
        System.out.println("=== ADIVINA EL NUMERO ===");
        System.out.println("Adivina el numero del 1 al 30");
        System.out.println("Tienes 6 intentos. ¡Mucha suerte!");

        while (jugando) {
           System.out.print("intento" + (intentos + 1) + "/6: ");
           intento = sc.nextInt();
           intentos++;
        

        if (intento == randomNumber) {
            System.out.println("¡GANASTE en " + intentos + " intentos!");
            jugando = false;
        }
        else if (intento < randomNumber) {
            System.out.println("Es un numero Mayor");
        }
        else {
            System.out.println("El numero es Menor");
        }
        if (intentos == 3){
            System.out.println("Mitad de camino. No te rindas");
        }
        if (intentos == 6 && intento != randomNumber) {
            System.out.println("GAME OVER. El numero era: " + randomNumber);
            jugando = false; 
        }  
    }
        System.out.println("¡Gracias por jugar!");
        sc.close();
    } 
}


