package isp;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Lavarropas Basico ---");
        LavarropaBasico basico = new LavarropaBasico();
        basico.encender();
        basico.apagar();
        System.out.println();
        System.out.println("--- Lavarropas Inteligente ---");
        LavarropaInteligente smart = new LavarropaInteligente();
        smart.conectarWifi("CasaWifi");
        smart.programar("06:30");
        smart.encender();
        smart.apagar();
    }
}
