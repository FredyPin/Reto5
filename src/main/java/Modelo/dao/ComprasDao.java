package Modelo.dao;

import Modelo.vo.ComprasVo;
import Utilidades.JDBCUtilities;
import java.sql.*;
import java.util.ArrayList;

public class ComprasDao {
     public static ArrayList<ComprasVo> informacionCompra() {
        ArrayList<ComprasVo> listaCompras = new ArrayList<ComprasVo>();
        try {
            var con = JDBCUtilities.getConnection();
            Statement stmt = null;
            ResultSet rs = null;
            String Query = "SELECT c.id_compra, constructora, banco_vinculado FROM Proyecto p INNER JOIN Compra c ON p.id_proyecto=c.id_proyecto WHERE c.Proveedor='Homecenter' AND p.ciudad='Salento';";
            stmt = con.createStatement();
            rs = stmt.executeQuery(Query);
            
            while ((rs.next())) {
                int id = rs.getInt("id_compra");
                String constructora = rs.getString("constructora");               
                String banco_vinculado = rs.getString("banco_vinculado");               
                ComprasVo compras = new ComprasVo(id,constructora,banco_vinculado);
                listaCompras.add(compras);
            }            
            rs.close();
            stmt.close();
            con.close();
            
            return listaCompras;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
