package Modelo.vo;

public class ComprasVo {

    private int ID_Compra;
    private String Constructora;
    private String Banco_Vinculado;

    public ComprasVo() {
    }

    public ComprasVo(int id, String constructora, String banco) {
        this.ID_Compra = id;
        this.Constructora = constructora;
        this.Banco_Vinculado = banco;
    }

    public int getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(int ID_Compra) {
        this.ID_Compra = ID_Compra;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String Banco_Vinculado) {
        this.Banco_Vinculado = Banco_Vinculado;
    }

}
