
package modelo;

/**
 *
 * @author Gemi
 */
public class detalle_factura {
    private int id_detalle_factura;
    private int id_factura;
    private int id_producto;
    private String nombre;
    private int cantidad;
    private double precio;
    private double subtotal;
    private double descuento;
    private double iva;
    private double totalPagar;
    private int estado;

    public detalle_factura() {
        this.id_detalle_factura = 0;
        this.id_factura = 0;
        this.id_producto =0;
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0.0;
        this.subtotal = 0.0;
        this.descuento = 0.0;
        this.iva = 0.0;
        this.totalPagar = 0.0;
        this.estado = 0;
    }

    public detalle_factura(int id_detalle_factura, int id_factura, int id_producto, String nombre, int cantidad, double precio, double subtotal, double descuento, double iva, double totalPagar, int estado) {
        this.id_detalle_factura = id_detalle_factura;
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.totalPagar = totalPagar;
        this.estado = estado;
    }

    public int getId_detalleFacturas() {
        return id_detalle_factura;
    }

    public void setId_detalleFacturas(int id_detalleFacturas) {
        this.id_detalle_factura = id_detalleFacturas;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "detalle_facturas{" + "id_detalle_factura=" + id_detalle_factura + ", id_factura=" + id_factura + ", id_producto=" + id_producto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", subtotal=" + subtotal + ", descuento=" + descuento + ", iva=" + iva + ", totalPagar=" + totalPagar + ", estado=" + estado + '}';
    }
    
    
    
    
    
}

 