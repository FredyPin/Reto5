/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 */
public class JDBCUtilities {

    // Atributos de clase para gestión de conexión con la base de datos
    private static final String UBICACION_BD = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {    
        try {
            // db parameters
             String url = "jdbc:sqlite:" + UBICACION_BD;
            // create a connection to the database
            var con = DriverManager.getConnection(url);
            return con;          
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }        
        return null;
    }
}
