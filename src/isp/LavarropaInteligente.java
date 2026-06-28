package isp;
public class LavarropaInteligente implements Encendible, Programable, Conectado {
    public void encender()               { System.out.println("Smart: iniciando lavado."); }
    public void apagar()                 { System.out.println("Smart: ciclo terminado."); }
    public void programar(String hora)   { System.out.println("Smart: programado para las " + hora); }
    public void conectarWifi(String red) { System.out.println("Smart: conectado a red '" + red + "'"); }
}
