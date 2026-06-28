package lsp;
public abstract class Vehiculo {
    protected String nombre;
    public Vehiculo(String nombre) { this.nombre = nombre; }
    public abstract double velocidadMaxima();
    public abstract double consumoCombustible();
}
