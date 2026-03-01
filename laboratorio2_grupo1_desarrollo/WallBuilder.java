package laboratorio2_grupo1_desarrollo;

import java.util.Scanner;

public class WallBuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            int width;
            int height;
            char borderChar = '#';
            char interiorChar = ' ';
            int pattern = 0;
            boolean filled = false;

            // === MENÚ PRINCIPAL ===
            System.out.println("\n========== CONSTRUCTOR DE MURALLAS ==========");
            System.out.println("1. Muralla básica");
            System.out.println("2. Muralla con caracteres personalizados");
            System.out.println("3. Muralla sólida (llena)");
            System.out.println("4. Patrón de ladrillos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            int option = sc.nextInt();

            switch (option) {
                case 1: // Básica
                    borderChar = '#';
                    interiorChar = ' ';
                    break;
                case 2: // Caracteres personalizados
                    System.out.print("Ingrese carácter de borde: ");
                    borderChar = sc.next().charAt(0);
                    System.out.print("Ingrese carácter del interior: ");
                    interiorChar = sc.next().charAt(0);
                    break;
                case 3: // Sólida/llena
                    filled = true;
                    borderChar = '#';
                    interiorChar = '#';
                    break;
                case 4: // Patrón de ladrillos
                    borderChar = '#';
                    interiorChar = '.';
                    pattern = 1;
                    break;
                case 5: // Salir
                    System.out.println("¡Gracias por usar el constructor!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción inválida. Se usará la muralla básica.");
                    borderChar = '#';
                    interiorChar = ' ';
                    break;
            }

            // === INGRESO DE DIMENSIONES ===
            System.out.print("\nIngrese el ancho de la muralla: ");
            width = sc.nextInt();

            System.out.print("Ingrese el alto de la muralla: ");
            height = sc.nextInt();

            // === VALIDACIÓN DE DATOS ===
            if (width < 1 || height < 1) {
                System.out.println("\n❌ Error: Las dimensiones deben ser mayores a 0");
                continue;
            }
            if (width > 50 || height > 50) {
                System.out.println("\n⚠️ Advertencia: Dimensiones grandes pueden verse mal en consola");
            }

            // === CONSTRUCCIÓN DE LA MURALLA ===
            System.out.println("\n🔨 Construyendo muralla...\n");

            for (int row = 1; row <= height; row++) {
                for (int column = 1; column <= width; column++) {
                    
                    // === PATRÓN DE LADRILLOS ===
                    if (pattern == 1) {
                        // Alternar posición de los ladrillos
                        if (row % 2 == 0) {
                            if (column == width) {
                                System.out.print(" ");
                            } else if ((column + 1) % 2 == 0) {
                                System.out.print("#");
                            } else {
                                System.out.print(" ");
                            }
                        } else {
                            if (column == 1 || column == width || column % 2 == 1) {
                                System.out.print("#");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    // === MURALLA NORMAL O SÓLIDA ===
                    else if (row == 1 || row == height || column == 1 || column == width || filled) {
                        System.out.print(borderChar);
                    } else {
                        System.out.print(interiorChar);
                    }
                }
                System.out.println();
            }

            // === ESTADÍSTICAS ===
            int totalChars = width * height;
            int borderChars = (width * 2) + ((height - 2) * 2);
            int interiorChars = totalChars - borderChars;
            
            System.out.println("\n📊 Estadísticas:");
            System.out.println("   - Caracteres totales: " + totalChars);
            System.out.println("   - Caracteres de borde: " + (filled ? totalChars : borderChars));
            System.out.println("   - Caracteres interiores: " + (filled ? 0 : interiorChars));

            // === PREGUNTAR SI CONTINUAR ===
            System.out.print("\n¿Desea construir otra muralla? (s/n): ");
            char answer = sc.next().toLowerCase().charAt(0);
            
            if (answer != 's') {
                keepGoing = false;
            }
        }

        System.out.println("\n¡Gracias por usar el constructor de murallas! 👋");
        sc.close();
    }
}
