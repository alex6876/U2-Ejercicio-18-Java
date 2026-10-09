public class Main {
    public static void main(String[] args) {
        ImpresoraFiscal impresora = new ImpresoraFiscal();

        CajaRegistradora caja = new CajaRegistradora(impresora);

        Factura factura = new Factura("Alex Olivares", 1001);

        ItemFactura item = new ItemFactura("Teclado", 2, 15000);
        ItemFactura item2 = new ItemFactura("mouse", 1, 8400);
        ItemFactura item3 = new ItemFactura("Auriculares", 1, 10500);

        factura.agregarItem(item);
        factura.agregarItem(item2);
        factura.agregarItem(item3);

        caja.cerrarVentaFactura(factura);
    }
}