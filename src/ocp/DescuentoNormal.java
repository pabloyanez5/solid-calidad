package ocp;
public class DescuentoNormal implements Descuento {
    public double aplicar(double monto) { return monto; }
    public String nombre() { return "Sin descuento (0%)  "; }
}
