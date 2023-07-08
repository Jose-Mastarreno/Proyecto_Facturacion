package modelo;

/**
 *
 * @author Gemi
 */
public class Facturas {
    //Atributos
    private int id_factura;
    private int id_cliente;
    private double valorPagar;
    private String fecha;
    private int estado;

    public Facturas() {
        this.id_factura = 0;
        this.id_cliente = 0;
        this.valorPagar = 0.0;
        this.fecha = "";
        this.estado = 0;
    }

    public Facturas(int id_factura, int id_cliente, double valorPagar, String fecha, int estado) {
        this.id_factura = id_factura;
        this.id_cliente = id_cliente;
        this.valorPagar = valorPagar;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Facturas{" + "id_factura=" + id_factura + ", id_cliente=" + id_cliente + ", valorPagar=" + valorPagar + ", fecha=" + fecha + ", estado=" + estado + '}';
    }
    
    

}
