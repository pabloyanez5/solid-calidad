package dip;
public class NotificadorSMS implements Notificador {
    public void enviar(String mensaje) { System.out.println("SMS enviado: " + mensaje); }
}
