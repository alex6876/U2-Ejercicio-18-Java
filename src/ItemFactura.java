public class ItemFactura {
    String descripcion;
    double cantidad;
    double precioUnitario;

    public ItemFactura(String descripcion, double cantidad, double precioUnitario) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
