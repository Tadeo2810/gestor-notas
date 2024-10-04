public static void main(String[] args) {
    cargarNotas();
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("\nGestor de Notas:");
        System.out.println("1. Agregar nota");
        System.out.println("2. Ver notas");
        System.out.println("3. Eliminar nota");
        System.out.println("4. Editar nota");
        System.out.println("5. Buscar nota");
        System.out.println("6. Guardar y salir");
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
            case 4:  // Editar nota
                System.out.print("Número de nota a editar: ");
                numero = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                if (numero > 0 && numero <= notas.size()) {
                    System.out.print("Escribe la nueva nota: ");
                    String nuevaNota = scanner.nextLine();
                    notas.set(numero - 1, nuevaNota);
                    System.out.println("Nota actualizada.");
                } else {
                    System.out.println("Número inválido.");
                }
                break;
            case 5:  // Buscar nota
                System.out.print("Ingresa una palabra clave para buscar: ");
                String keyword = scanner.nextLine();
                System.out.println("Notas que contienen '" + keyword + "':");
                boolean found = false;
                for (int i = 0; i < notas.size(); i++) {
                    if (notas.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                        System.out.println((i + 1) + ". " + notas.get(i));
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No se encontraron notas con esa palabra clave.");
                }
                break;
            case 6:  // Guardar y salir
                guardarNotas();
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    } while (opcion != 6);
}
