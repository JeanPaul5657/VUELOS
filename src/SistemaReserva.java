import java.util.ArrayList;
import java.util.List;

public class SistemaReserva {
    private List<Usuario> usuarios;
    private List<Vuelo> vuelos;
    private List<Reserva> reservas;
    private List<Ticket> tickets;

    public SistemaReserva() {
        usuarios = new ArrayList<>();
        vuelos = new ArrayList<>();
        reservas = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    // Registro de usuario
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        usuario.registrar();
    }
    // Buscar una reserva
    public Reserva buscarReservapornumero(String numeroReserva) {
        for (Reserva r : reservas) {
            if (r.getIdReserva().equals(numeroReserva)) {
                return r;
            }
        }
        return null;
    }
    // Autenticación simple por nombre
    public Usuario iniciarSesion(String nombre) {
        for (Usuario u : usuarios) {
            if (u.iniciarSesion(nombre)) {
                System.out.println("Inicio de sesión exitoso.");
                return u;
            }
        }
        System.out.println("Usuario no encontrado.");
        return null;
    }

    // Agregar un vuelo al sistema
    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    // Buscar vuelos disponibles (básico: muestra todos)
    public void mostrarVuelosDisponibles() {
        for (Vuelo v : vuelos) {
            v.mostrarInformacion();
        }
    }

    // Reservar un vuelo
    public Reserva reservarVuelo(String idReserva, Usuario usuario, Vuelo vuelo) {
        Reserva reserva = new Reserva(idReserva, usuario, vuelo);
        reservas.add(reserva);
        reserva.confirmarReserva();
        return reserva;
    }

    // Generar un Ticket
    public Ticket generarTicket(String numerotikect, Reserva reserva) {
        Ticket billete = new Ticket(numerotikect, reserva);
        tickets.add(billete);
        tickets.getLast();
        return (Ticket) tickets;
    }

    // Buscar vuelo por numero
    public Vuelo buscarVueloPornummero(String numeroVuelo) {
        for (Vuelo v : vuelos) {
            if (v.getnumerodeVuelo().equals(numeroVuelo)) {
                return v;
            }
        }
        return null;
    }

}
