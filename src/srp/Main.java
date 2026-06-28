package srp;
public class Main {
    public static void main(String[] args) {
        Libro[] libros = {
            new Libro("Clean Code", "Robert C. Martin", 45.00),
            new Libro("Design Patterns", "Gang of Four", 55.00),
            new Libro("El Principito", "Antoine de S.-E.", 12.00)
        };
        CalculadorImpuesto calc = new CalculadorImpuesto();
        FormateadorReporte fmt = new FormateadorReporte();
        RepositorioLibro repo = new RepositorioLibro();
        for (Libro l : libros) {
            double iva = calc.calcular(l);
            System.out.println("=== Libro: " + l.getTitulo() + " ===");
            repo.guardar(l);
            System.out.println(fmt.formatear(l, iva));
            System.out.println();
        }
    }
}
