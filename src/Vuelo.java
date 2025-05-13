public class Vuelo {
    public String numeroVuelo;
    public String origen;
    public String destino;
    public double tarifa;
    public String horaSalida;
    public Vuelo (String numeroVuelo, String origen, String destino, String horaSalida, double tarifa) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.tarifa = tarifa;
    }
    //Metodo para el id del vuelo
    public String getnumerodeVuelo() {

        return numeroVuelo;
    }
    // Metodo para el origen

    public String getOrigen() {
        return origen;
    }
    // Metodo para el destino
    public String getDestino() {
        return destino;
    }
    // Metodo para la hora de salida
    public String getHoraSalida() {
        return horaSalida;
    }
     //Metodo para la tarifa del vuelo
    public double getTarifa() {
        return tarifa;
    }
    //Metodo para mostrar cada atributo
    public void mostrarHorario() {
        System.out.println("Hora de salida del vuelo " + numeroVuelo + ": " + horaSalida);
    }

    public void mostrarTarifa() {
        System.out.println("Tarifa del vuelo " + numeroVuelo + ": $" + tarifa);
    }

    public void mostrarInformacion() {
        System.out.println("Vuelo " + numeroVuelo + ": " + origen + " -> " + destino + " a las " + horaSalida + " ($" + tarifa + ")");
    }
}

