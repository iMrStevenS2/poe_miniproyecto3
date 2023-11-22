package mini_proyecto3.modelo;

public class Direccion {
    private String calle;
    private String ciudad;
    private String pais;

    public Direccion(String calle, String ciudad, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public Direccion() {
        this.calle = "";
        this.ciudad = "";
        this.pais = "";
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
