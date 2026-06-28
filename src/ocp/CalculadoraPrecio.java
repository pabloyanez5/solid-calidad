package ocp;
public class CalculadoraPrecio {
    public double calcular(double monto, Descuento descuento) {
        return descuento.aplicar(monto);
    }
}
