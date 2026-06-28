package dip;
public class NotificadorEmail implements Notificador {
    public void enviar(String mensaje) { System.out.println("Email enviado: " + mensaje); }
}
