package lsp;
public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = { new Auto(), new Moto(), new Camion() };
        System.out.println("--- Calculando rendimiento de cada vehiculo ---");
        for (Vehiculo v : vehiculos) {
            System.out.printf("%-10s | vel. max: %6.1f km/h | consumo: %5.1f L/100km%n",
                v.nombre, v.velocidadMaxima(), v.consumoCombustible());
        }
    }
}
