package dip;
public class NotificadorPush implements Notificador {
    public void enviar(String mensaje) { System.out.println("Push notification enviada: " + mensaje); }
}
