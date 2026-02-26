package laboratorio2_grupo1_desarrollo;

import java.util.Scanner;
import java.util.Random;

public class Battle_Simulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char again;

        do {
            int enemyHealth = 70, enemyDefense = 10, baseAttack = 20;

            System.out.println("\n=== SIMULADOR ===");

            for (int round = 1; round <= 5 && enemyHealth > 0; round++) {
                System.out.println("\nRonda " + round + " | Vida: " + enemyHealth);
                System.out.print("1.Físico 2.Mágico: ");
                int op = sc.nextInt();
                int damage = 0;

                if (op == 1) damage = baseAttack - enemyDefense;
                else if (op == 2) damage = (int)(baseAttack * 1.2) - enemyDefense;
                else { System.out.println("Inválido"); continue; }

                if (damage < 0) damage = 0;
                if (r.nextInt(100) < 20) { damage *= 2; System.out.println("¡Crítico!"); }

                enemyHealth -= damage;
                System.out.println("Daño: " + damage);
            }

            System.out.println(enemyHealth <= 0 ? "\n¡Ganaste!" : "\nPerdiste.");
            System.out.print("¿Otra vez? (s/n): ");
            again = sc.next().charAt(0);

        } while (again == 's' || again == 'S');

        System.out.println("Fin del juego.");
        sc.close();
    }
}

