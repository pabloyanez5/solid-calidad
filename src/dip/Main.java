package dip;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Notificacion por Email ---");
        new ServicioAlertas(new NotificadorEmail()).alertar("Pago recibido correctamente.");
        System.out.println("\n--- Notificacion por SMS ---");
        new ServicioAlertas(new NotificadorSMS()).alertar("Tu pedido esta en camino.");
        System.out.println("\n--- Notificacion Push ---");
        new ServicioAlertas(new NotificadorPush()).alertar("Tienes un nuevo mensaje!");
    }
}
