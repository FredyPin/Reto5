package Modelo.dao;

import Modelo.vo.ProyectoVo;
import Utilidades.JDBCUtilities;
import java.sql.*;
import java.util.ArrayList;

public class ProyectoDao {
    
    public static ArrayList<ProyectoVo> informacionProyecto() {
        ArrayList<ProyectoVo> listaProyectos = new ArrayList<ProyectoVo>();
        try {
            var con = JDBCUtilities.getConnection();
            Statement stmt = null;
            ResultSet rs = null;
            String Query = "SELECT id_proyecto, constructora, numero_habitaciones, ciudad FROM Proyecto WHERE clasificacion='Casa Campestre' AND (ciudad='Santa Marta' OR ciudad='Cartagena' OR ciudad='Barranquilla');";
            stmt = con.createStatement();
            rs = stmt.executeQuery(Query);            
            while ((rs.next())) {
                int id = rs.getInt("id_proyecto");
                String constructora = rs.getString("constructora");
                int numero_habitaciones = rs.getInt("numero_habitaciones");
                String ciudad = rs.getString("ciudad");               
                ProyectoVo proyecto = new ProyectoVo(id,constructora,numero_habitaciones,ciudad);
                listaProyectos.add(proyecto);
            }            
            rs.close();
            stmt.close();
            con.close();
            
            return listaProyectos;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
