public class CajaRegistradora {

    ImpresoraFiscal impresora;
    public CajaRegistradora(ImpresoraFiscal impresora){
        this.impresora = impresora;
    }

    public void cerrarVentaFactura(Factura factura){
        System.out.println("Cerrando venta...");
        impresora.imprimirDocumento(factura);
    }
}
