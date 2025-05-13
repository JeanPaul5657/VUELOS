
    public class Usuario {
        private String nombre;

        public Usuario(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
            //Metodo para registrar el usario
        public void registrar() {

            System.out.println("Usuario registrado: " + nombre);
        }

        public boolean iniciarSesion(String nombreIngresado) {
            return this.nombre.equals(nombreIngresado);
        }
    }

