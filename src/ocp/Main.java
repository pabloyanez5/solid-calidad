package ocp;
public class Main {
    public static void main(String[] args) {
        double monto = 150.0;
        CalculadoraPrecio calc = new CalculadoraPrecio();
        Descuento[] tipos = {
            new DescuentoNormal(),
            new DescuentoEstudiante(),
            new DescuentoDocente(),
            new DescuentoPromocion()
        };
        System.out.println("Precio base del libro: $" + monto);
        System.out.println();
        for (Descuento d : tipos) {
            System.out.printf("%s -> Total a pagar: $%.2f%n", d.nombre(), calc.calcular(monto, d));
        }
    }
}
