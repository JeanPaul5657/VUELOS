public class Ticket {
        public String idTicket;
        public Reserva reserva;

        public  Ticket(String idTicket, Reserva reserva) {
            this.idTicket = idTicket;
            this.reserva = reserva;
        }

        public String getIdTicket() {
            return idTicket;
        }

        public Reserva getReserva() {
            return reserva;
        }
        // Metodo para generar el ticket
        public void generarTicket() {
            System.out.println("Ticket generado:");
            System.out.println("ID ticket: " + idTicket);
            System.out.println("Nombre del pasajero: " + reserva.getUsuario().getNombre());
            System.out.println("Vuelo: " + reserva.getVuelo().getnumerodeVuelo());
            System.out.println("Origen: " + reserva.getVuelo().getOrigen());
            System.out.println("Destino: " + reserva.getVuelo().getDestino());
            System.out.println("Hora de salida: " + reserva.getVuelo().getHoraSalida());
            System.out.println("Tarifa: $" + reserva.getVuelo().getTarifa());
        }
    }

