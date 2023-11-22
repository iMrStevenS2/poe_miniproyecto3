package mini_proyecto3.modelo;

// import mini_proyecto3.modelo.TipoLugar;

public class Telefono {

    private String numero;
    private TipoLugar tipoLugar;

    public Telefono(String numero, TipoLugar tipoLugar) {
        this.numero = numero;
        this.tipoLugar = tipoLugar;
    }

    public Telefono() {
        this.numero = "";
        this.tipoLugar = null;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoLugar getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(TipoLugar tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

}
