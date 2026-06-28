package ocp;
public class DescuentoPromocion implements Descuento {
    public double aplicar(double monto) { return monto * 0.60; }
    public String nombre() { return "Promocion (40%)     "; }
}
