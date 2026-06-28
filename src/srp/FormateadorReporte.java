package srp;
public class FormateadorReporte {
    public String formatear(Libro libro, double impuesto) {
        return String.format("  > %-22s | Autor: %-20s | Precio: $%.2f | IVA: $%.2f | Total: $%.2f",
            libro.getTitulo(), libro.getAutor(), libro.getPrecio(), impuesto, libro.getPrecio() + impuesto);
    }
}
