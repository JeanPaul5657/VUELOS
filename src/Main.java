//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            // Creamos un usario para registrar
            Usuario usuario = new Usuario("Juan Pablo Alba");
            usuario.registrar();

            // confirmar que el usario sea correcto
            if (usuario.iniciarSesion("Juan Pablo Alba")) {
                System.out.println("Inicio de sesión exitoso.");
            } else {
                System.out.println("Nombre incorrecto. No se pudo iniciar sesión.");
                return;
            }

            // Creamos el objeto  vuelo
            Vuelo vuelo = new Vuelo("A2025", "Bogotá", "Cartagena", "2025-06-10 08:30", 150000);

            // Mostramos la informacion del vuelo
            vuelo.mostrarInformacion();

            // Creamos un objeto reserva
            Reserva reserva = new Reserva("2024A", usuario, vuelo);
            reserva.confirmarReserva();

            // Generar un Ticket
            Ticket ticket = new Ticket("A2025", reserva);
            ticket.generarTicket();
        }
    }
