public class ImpresoraFiscal {

    public void imprimirDocumento(Factura factura) {
        System.out.println("Imprimiendo Documento..");
        System.out.println("Numero de factura: "+ factura.numero);
        System.out.println("Cliente: "+factura.cliente);

        double total = 0;

        for (ItemFactura item : factura.items) {
            System.out.println("Descripción: "+ item.getDescripcion());
            System.out.println("Cantidad: "+item.getCantidad());
            System.out.println("Precio unitario: $"+item.getPrecioUnitario());
            double subtotal = item.getPrecioUnitario()* item.getCantidad();
            System.out.println("Subtotal: $"+subtotal);
            total = total + subtotal;
            System.out.println("Total: $"+total);
        }
    }
}
