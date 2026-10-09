import java.util.ArrayList;

public class Factura {
    String cliente;
    int numero;

    ArrayList<ItemFactura> items;
    public Factura(String cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemFactura item){
        items.add(item);
    }
}
