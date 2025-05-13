public class Reserva {

        public String idReserva;
        public Usuario usuario;
        public Vuelo vuelo;


        public Reserva(String idReserva, Usuario usuario, Vuelo vuelo) {
            this.idReserva = idReserva;
            this.usuario = usuario;
            this.vuelo = vuelo;
        }

        public String getIdReserva() {
            return idReserva;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public Vuelo getVuelo() {
            return vuelo;
        }

        public void confirmarReserva() {
            System.out.println("Reserva confirmada:");
            System.out.println("ID Reserva: " + idReserva);
            System.out.println("Pasajero: " + usuario.getNombre());
            System.out.println("Vuelo: " + vuelo.getnumerodeVuelo());
        }
    }

