package ocp;
public class DescuentoEstudiante implements Descuento {
    public double aplicar(double monto) { return monto * 0.85; }
    public String nombre() { return "Estudiante (15%)    "; }
}
