package ocp;
public class DescuentoDocente implements Descuento {
    public double aplicar(double monto) { return monto * 0.75; }
    public String nombre() { return "Docente (25%)       "; }
}
