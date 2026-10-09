# 🧾 Simulación de Facturación y Caja Registradora (POO en Java)

Este proyecto es una aplicación en Java que modela el proceso comercial de cierre de venta y emisión de facturas. Pone en práctica el uso de colecciones dinámicas (`ArrayList`), la composición de objetos, el cálculo acumulativo de subtotales y totales, y la delegación de responsabilidades entre el punto de venta y la impresora fiscal en memoria.

---

## 🧩 Clases y Estructura del Sistema

El dominio del problema está organizado en 5 clases principales:

*   **`ItemFactura`**: Representa un renglón o producto dentro del comprobante.
    *   **Atributos:** `descripcion`, `cantidad` y `precioUnitario`.
    *   **Métodos:** Métodos consultores (*getters*) para leer la información de cada producto.
*   **`Factura`**: Modela el comprobante comercial.
    *   **Atributos:** `cliente`, `numero` de factura y una lista dinámica `ArrayList<ItemFactura>` para almacenar los renglones asociados.
    *   **Métodos:** `agregarItem(ItemFactura item)`, añade dinámicamente un nuevo ítem a la colección.
*   **`ImpresoraFiscal`**: Representa el dispositivo de salida física/fiscal.
    *   **Métodos:** `imprimirDocumento(Factura factura)`, recorre los renglones de la factura, calcula el subtotal de cada ítem ($cantidad \times precioUnitario$) y acumula el total general.
*   **`CajaRegistradora`**: Actúa como el terminal de punto de venta (POS).
    *   **Atributos:** Mantiene la referencia de la `ImpresoraFiscal`.
    *   **Métodos:** `cerrarVentaFactura(Factura factura)`, procesa el cierre de la transacción enviando el documento a la impresora.
*   **`Main`**: Punto de entrada del programa. Instancia la impresora, la caja registradora y la factura, agrega múltiples ítems y ejecuta el cierre de venta.

---

## ⚙️ Flujo de Operación y Cálculo Acumulado

1. **Construcción del Comprobante:** Se crea un objeto `Factura` y se le añaden objetos `ItemFactura` mediante la colección `ArrayList`.
2. **Delegación del Cierre:** La `CajaRegistradora` recibe la factura y delega el proceso a la `ImpresoraFiscal`.
3. **Procesamiento e Iteración:** La impresora recorre el `ArrayList` utilizando un bucle `for-each`:
   * Calcula el subtotal individual de cada producto.
   * Acumula el valor en la variable `total` (`total = total + subtotal`).
   * Imprime en consola el desglose paso a paso de la transacción.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera la siguiente salida por pantalla:

```text
Cerrando venta...
Imprimiendo Documento..
Numero de factura: 1001
Cliente: Alex Olivares
Descripción: Teclado
Cantidad: 2.0
Precio unitario: $15000.0
Subtotal: $30000.0
Total: $30000.0
Descripción: mouse
Cantidad: 1.0
Precio unitario: $8400.0
Subtotal: $8400.0
Total: $38400.0
Descripción: Auriculares
Cantidad: 1.0
Precio unitario: $10500.0
Subtotal: $10500.0
Total: $48900.0
