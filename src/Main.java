import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaReserva sistema = new SistemaReserva();
        Usuario usuarioActivo = null;

        // Agregamos algunos vuelos con un numero
        sistema.agregarVuelo(new Vuelo("A2025", "Bogotá", "Cali", "2025-06-10 10:00", 200000));
        sistema.agregarVuelo(new Vuelo("A2024", "Medellín", "Cartagena", "2025-06-11 15:00", 300000));
        sistema.agregarVuelo(new Vuelo("A2023", "Barranquilla", "Pereira", "2025-06-12 08:30", 250000));

        int opcion;

        do {
            System.out.println("\n----- MENÚ DEL SISTEMA DE RESERVA DE VUELOS -----");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Mostrar vuelos disponibles");
            System.out.println("4. Buscar vuelo por numero");
            System.out.println("5. Reservar un vuelo");
            System.out.println("6. Generar Ticket");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del nuevo usuario: ");
                    String nombre = scanner.nextLine();
                    Usuario nuevoUsuario = new Usuario(nombre);
                    sistema.registrarUsuario(nuevoUsuario);
                    break;

                case 2:
                    System.out.print("Ingrese su nombre: ");
                    String nombreLogin = scanner.nextLine();
                    usuarioActivo = sistema.iniciarSesion(nombreLogin);
                    break;

                case 3:
                    sistema.mostrarVuelosDisponibles();
                    break;

                case 4:
                    System.out.print("Ingrese el numero del vuelo a buscar: ");
                    String numeroBusqueda = scanner.nextLine();
                    Vuelo vueloEncontrado = sistema.buscarVueloPorId(numeroBusqueda);
                    if (vueloEncontrado != null) {
                        vueloEncontrado.mostrarInformacion();
                    } else {
                        System.out.println("Vuelo no encontrado.");
                    }
                    break;

                case 5:
                    if (usuarioActivo == null) {
                        System.out.println("Debe iniciar sesión primero.");
                        break;
                    }
                    System.out.print("Ingrese el numero del vuelo que desea reservar: ");
                    String idVueloReserva = scanner.nextLine();
                    Vuelo vueloReserva = sistema.buscarVueloPorId(idVueloReserva);
                    if (vueloReserva != null) {
                        System.out.print("Ingrese un numero para la reserva: ");
                        String idReserva = scanner.nextLine();
                        sistema.reservarVuelo(idReserva, usuarioActivo, vueloReserva);
                    } else {
                        System.out.println("Vuelo no encontrado.");
                    }
                    break;

                case 6:
                    if (usuarioActivo == null) {
                        System.out.println("Debe iniciar sesión primero.");
                        break;
                    }
                    System.out.print("Ingrese el ID de la reserva: ");
                    String numeroReservaticket = scanner.nextLine();
                    Reserva reservaExistente = sistema.buscarReservaPorId(numeroReservaticket);
                    if (reservaExistente != null) {
                        System.out.print("Ingrese el ID del billete: ");
                        String numeroTicket = scanner.nextLine();
                        sistema.generarTicket(numeroTicket, reservaExistente);
                    } else {
                        System.out.println("Reserva no encontrada.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

}

