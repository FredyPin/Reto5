package Modelo.vo;

import Modelo.dao.LiderDao;
import java.sql.ResultSet;

public class LiderVo {

    private int ID_Lider;
    private String Nombre;
    private String Primer_Apellido;
    private String Ciudad_Residencia;

    public LiderVo(int id, String nombre, String primer_apellido, String ciudad_residencia) {
        this.ID_Lider=id;
        this.Nombre=nombre;
        this.Primer_Apellido=primer_apellido;
        this.Ciudad_Residencia=ciudad_residencia;       
    }

    public LiderVo() {
    }
 
    public int getID_Lider() {
        return ID_Lider;
    }

    public void setID_Lider(int ID_Lider) {
        this.ID_Lider = ID_Lider;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String Ciudad_Residencia) {
        this.Ciudad_Residencia = Ciudad_Residencia;
    }
  
}
