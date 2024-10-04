import java.util.ArrayList;
import java.util.Scanner;

public class Notas{
     private static ArrayList<String> notas = new ArrayList<>();

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nGestor de Notas:");
            System.out.println("1. Agregar nota");
            System.out.println("2. Ver notas");
            System.out.println("3. Eliminar nota");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Escribe la nota: ");
                    String nota = scanner.nextLine();
                    notas.add(nota);
                    System.out.println("Nota agregada.");
                    break;
                case 2:
                    System.out.println("Tus notas:");
                    for (int i = 0; i < notas.size(); i++) {
                        System.out.println((i + 1) + ". " + notas.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Número de nota a eliminar: ");
                    int numero = scanner.nextInt();
                    if (numero > 0 && numero <= notas.size()) {
                        notas.remove(numero - 1);
                        System.out.println("Nota eliminada.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}