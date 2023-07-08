package controlador;

import java.sql.*;

import modelo.Facturas;
import modelo.detalle_factura;
/**
 *
 * @author Gemi
 */
public class Ctrl_RegistrarFacturas {
    public static int idCabeceraRegistrada;
    java.math.BigDecimal iDColVar;
    
    public boolean guardar(Facturas objeto) {
        boolean respuesta = false;
        Connection cn = sistema_facturacion.Conexion.conectaBD();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into facturas values(?,?,?,?,?)", 
                    Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getId_cliente());
            consulta.setDouble(3, objeto.getValorPagar());
            consulta.setString(4, objeto.getFecha());
            consulta.setInt(5, objeto.getEstado());
            
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            ResultSet rs = consulta.getGeneratedKeys();
            while(rs.next()){
                iDColVar = rs.getBigDecimal(1);
                idCabeceraRegistrada = iDColVar.intValue();
                
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar factura: " + e);
        }
        return respuesta;
    }
    
     public boolean guardarDetalle(detalle_factura objeto) {
        boolean respuesta = false;
        Connection cn = sistema_facturacion.Conexion.conectaBD();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into detalle_factura values(?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, idCabeceraRegistrada);
            consulta.setInt(3, objeto.getId_producto());
            consulta.setInt(4, objeto.getCantidad());
            consulta.setDouble(5, objeto.getPrecio());
            consulta.setDouble(6, objeto.getSubtotal());
            consulta.setDouble(7, objeto.getDescuento());
            consulta.setDouble(8, objeto.getIva());
            consulta.setDouble(9, objeto.getTotalPagar());
            consulta.setInt(10, objeto.getEstado());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar detalle de la factura: " + e);
        }
        return respuesta;
    }
}
