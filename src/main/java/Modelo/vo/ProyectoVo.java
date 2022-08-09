package Modelo.vo;

public class ProyectoVo {
    
    private int ID_Proyecto;
    private String Constructora;
    private int Numero_Habitaciones;
    private String Ciudad;

    public ProyectoVo() {
    }

    public ProyectoVo(int ID_Proyecto, String Constructora, int Numero_Habitaciones, String Ciudad) {
        this.ID_Proyecto = ID_Proyecto;
        this.Constructora = Constructora;
        this.Numero_Habitaciones = Numero_Habitaciones;
        this.Ciudad = Ciudad;
    }

    public int getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(int ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public int getNumero_Habitaciones() {
        return Numero_Habitaciones;
    }

    public void setNumero_Habitaciones(int Numero_Habitaciones) {
        this.Numero_Habitaciones = Numero_Habitaciones;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }       
    
}
