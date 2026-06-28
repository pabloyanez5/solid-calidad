# Principios SOLID — Calidad de Software

**Integrante:** Pablo Yánez  
**Lenguaje / Entorno:** Java (OpenJDK) · VS Code / GitHub Codespaces  
**Repositorio:** https://github.com/pabloyanez5/solid-calidad

---

## 1. SRP — Single Responsibility Principle

**Escenario:** Sistema de gestión de libros.

Cada clase tiene una única responsabilidad:
- `Libro` → almacena los datos del libro
- `CalculadorImpuesto` → calcula el IVA (12%)
- `FormateadorReporte` → da formato a la salida en pantalla
- `RepositorioLibro` → simula la persistencia en base de datos

**Problema que resuelve:** Sin SRP, una sola clase haría todo: guardar datos, calcular impuestos y formatear reportes. Cualquier cambio en el cálculo del IVA obligaría a tocar la misma clase que maneja la presentación, aumentando el riesgo de errores. Al separar responsabilidades, cada clase puede modificarse de forma independiente sin afectar a las demás.

---

## 2. OCP — Open/Closed Principle

**Escenario:** Calculadora de precios con descuentos por tipo de usuario.

Se define la interfaz `Descuento` y se implementan cuatro estrategias: `DescuentoNormal`, `DescuentoEstudiante`, `DescuentoDocente` y `DescuentoPromocion`. La clase `CalculadoraPrecio` nunca se modifica al agregar un nuevo tipo de descuento.

**Problema que resuelve:** Sin OCP, agregar un nuevo descuento implicaría modificar `CalculadoraPrecio` con un `if/else` adicional, lo que rompe código ya probado. Con OCP, simplemente se crea una nueva clase que implementa `Descuento` y se inyecta, sin tocar nada existente.

---

## 3. LSP — Liskov Substitution Principle

**Escenario:** Jerarquía de vehículos (Auto, Moto, Camión).

Todos extienden la clase abstracta `Vehiculo` e implementan `velocidadMaxima()` y `consumoCombustible()`. El programa itera sobre un arreglo de `Vehiculo` y llama a ambos métodos sin saber el tipo concreto.

**Problema que resuelve:** Sin LSP, una subclase podría sobrescribir un método de forma que rompa el comportamiento esperado (por ejemplo, lanzar una excepción o devolver valores incorrectos). LSP garantiza que cualquier subtipo puede reemplazar al tipo base sin que el programa falle, lo que hace el polimorfismo seguro y predecible.

---

## 4. ISP — Interface Segregation Principle

**Escenario:** Electrodomésticos con distintas capacidades.

Se definen tres interfaces pequeñas: `Encendible`, `Programable` y `Conectado`. El `LavarropaBasico` solo implementa `Encendible`. El `LavarropaInteligente` implementa las tres.

**Problema que resuelve:** Sin ISP, existiría una sola interfaz grande con todos los métodos, obligando al `LavarropaBasico` a implementar `programar()` y `conectarWifi()` aunque no los use (métodos vacíos o con excepciones). ISP evita que las clases dependan de contratos que no necesitan.

---

## 5. DIP — Dependency Inversion Principle

**Escenario:** Sistema de notificaciones (Email, SMS, Push).

`ServicioAlertas` (módulo de alto nivel) depende de la abstracción `Notificador`, no de implementaciones concretas. La implementación se inyecta por constructor.

**Problema que resuelve:** Sin DIP, `ServicioAlertas` instanciaría directamente `NotificadorEmail`, acoplándose a esa implementación. Para cambiar a SMS habría que modificar la clase. Con DIP, basta inyectar una implementación distinta sin tocar `ServicioAlertas`, lo que facilita el testing y el mantenimiento.

---

## Ejecución

```bash
javac -d target/classes src/srp/*.java
javac -d target/classes src/ocp/*.java
javac -d target/classes src/lsp/*.java
javac -d target/classes src/isp/*.java
javac -d target/classes src/dip/*.java

java -cp target/classes srp.Main
java -cp target/classes ocp.Main
java -cp target/classes lsp.Main
java -cp target/classes isp.Main
java -cp target/classes dip.Main
```
