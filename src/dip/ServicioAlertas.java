package dip;
public class ServicioAlertas {
    private Notificador notificador;
    public ServicioAlertas(Notificador notificador) { this.notificador = notificador; }
    public void alertar(String mensaje) { notificador.enviar(mensaje); }
}
