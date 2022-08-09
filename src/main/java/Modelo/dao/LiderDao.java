package Modelo.dao;

import Modelo.vo.LiderVo;
import java.sql.*;
import Utilidades.JDBCUtilities;
import java.util.ArrayList;

public class LiderDao {

    public static  ArrayList<LiderVo> informacionLider() {
        ArrayList<LiderVo> listaLideres = new ArrayList<LiderVo>();
        try {
            var con = JDBCUtilities.getConnection();
            Statement stmt = null;
            ResultSet rs = null;
            String Query = "SELECT id_lider,nombre,primer_apellido, ciudad_residencia FROM Lider ORDER BY ciudad_residencia;";
            stmt = con.createStatement();
            rs = stmt.executeQuery(Query);            
            while ((rs.next())) {
                int id = rs.getInt("id_lider");
                String nombre = rs.getString("nombre");
                String primer_apellido = rs.getString("primer_apellido");
                String ciudad_residencia = rs.getString("ciudad_residencia");               
                LiderVo lider = new LiderVo(id,nombre,primer_apellido,ciudad_residencia);
                listaLideres.add(lider);
            }
            rs.close();
            stmt.close();
            con.close();
            return listaLideres;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
