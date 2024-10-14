package impuesto_predial;

import java.util.List;
import java.util.Scanner;

public class Prueba {

   
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        Gestion_Vivienda registro = new Gestion_Vivienda();
        int opcion;

        do {
            System.out.println("--MENU DE OPCIONES--");
            System.out.println("1. Registrar vivienda");
            System.out.println("2. Buscar vivienda por matricula");
            System.out.println("3. Buscar vivienda por apellido");
            System.out.println("4. Listar matriculas");
            System.out.println("5. Ordenar matrículas por burbuja");
            System.out.println("6. Ordenar matrículas por insercion");
            System.out.println("7. Buscar matricula usando busqueda binaria");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese matricula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Ingrese direccion: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ingrese nombre del propietario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese apellido del propietario: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese barrio: ");
                    String barrio = scanner.nextLine();
                    registro.registrarVivienda(matricula, direccion, nombre, apellido, barrio);
                    break;

                case 2:
                    System.out.print("Ingrese matricula a buscar: ");
                    String matriculaBuscar = scanner.nextLine();
                    Vivienda viviendaEncontrada = registro.buscarPorMatricula(matriculaBuscar);
                    if (viviendaEncontrada != null) {
                        System.out.println("Vivienda encontrada: " + viviendaEncontrada);
                    } else {
                        System.out.println("No se encontro la vivienda.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese apellido del propietario a buscar: ");
                    String apellidoBuscar = scanner.nextLine();
                    List<Vivienda> viviendasEncontradas = registro.buscarPorApellido(apellidoBuscar);
                    if (!viviendasEncontradas.isEmpty()) {
                        System.out.println("Viviendas encontradas:");
                        for (Vivienda v : viviendasEncontradas) {
                            System.out.println(v);
                        }
                    } else {
                        System.out.println("No se encontraron viviendas.");
                    }
                    break;

                case 4:
                    String[] matriculas = registro.obtenerMatriculas();
                    System.out.println("Matriculas registradas:");
                    for (String m : matriculas) {
                        System.out.println(m);
                    }
                    break;

                case 5:
                    String[] matriculasBurbuja = registro.obtenerMatriculas();
                    registro.ordenarBurbuja(matriculasBurbuja);
                    System.out.println("Matriculas ordenadas por burbuja:");
                    for (String m : matriculasBurbuja) {
                        System.out.println(m);
                    }
                    break;

                case 6:
                    String[] matriculasInsercion = registro.obtenerMatriculas();
                    registro.ordenarInsercion(matriculasInsercion);
                    System.out.println("Matriculas ordenadas por insercion:");
                    for (String m : matriculasInsercion) {
                        System.out.println(m);
                    }
                    break;

                case 7:
                    System.out.print("Ingrese matricula a buscar: ");
                    String matriculaABuscar = scanner.nextLine();
                    String[] matriculasBinaria = registro.obtenerMatriculas();
                    registro.ordenarBurbuja(matriculasBinaria); // Asegurarse de que esté ordenado
                    boolean encontrado = registro.busquedaBinaria(matriculasBinaria, matriculaABuscar);
                    if (encontrado) {
                        System.out.println("Matricula encontrada.");
                    } else {
                        System.out.println("Matricula no encontrada.");
                    }
                    break;

                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 8);

        scanner.close();
    }
}