public class Reserva {

        private String numeroReserva;
        private Usuario usuario;
        private Vuelo vuelo;


        public Reserva(String idReserva, Usuario usuario, Vuelo vuelo) {
            this.numeroReserva = idReserva;
            this.usuario = usuario;
            this.vuelo = vuelo;
        }

        public String getIdReserva() {
            return numeroReserva;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public Vuelo getVuelo() {
            return vuelo;
        }

        public void confirmarReserva() {
            System.out.println("Reserva confirmada:");
            System.out.println("ID Reserva: " + numeroReserva);
            System.out.println("Pasajero: " + usuario.getNombre());
            System.out.println("Vuelo: " + vuelo.getnumerodeVuelo());
        }
    }

