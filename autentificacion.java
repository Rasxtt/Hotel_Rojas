package Paquete;

public class autentificacion implements CredencialesAdmin, CredencialesRecepcionista {
    public static String login(String usuario, String contrasena) {
        if (usuario.equals(CredencialesAdmin.USUARIO) && contrasena.equals(CredencialesAdmin.CONTRASENA)) {
            return rolAdmin;
        } else if (usuario.equals(CredencialesRecepcionista.USUARIO) && contrasena.equals(CredencialesRecepcionista.CONTRASENA)) {
            return rolRecep;
        }
        return "";      
    }
}
