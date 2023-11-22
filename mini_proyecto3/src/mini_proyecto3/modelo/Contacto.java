package mini_proyecto3.modelo;

import java.util.ArrayList;
import java.util.List;

class Contacto {
    private String fechaNacimiento;
    private String numeroIdentificacion;
    private String nombres;
    private String apellidos;
    private List<Direccion> direcciones;
    private List<Telefono> telefonos;
    private TipoContacto tipoContacto;

    public Contacto(String fechaNacimiento, String numeroIdentificacion, String nombres, String apellidos,
            TipoContacto tipoContacto) {
        this.fechaNacimiento = fechaNacimiento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direcciones = new ArrayList<>();
        this.telefonos = new ArrayList<>();
        this.tipoContacto = tipoContacto;
    }

    public Contacto() {
        this.fechaNacimiento = "";
        this.numeroIdentificacion = "";
        this.nombres = "";
        this.apellidos = "";
        this.direcciones = new ArrayList<>();
        this.telefonos = new ArrayList<>();
        this.tipoContacto = null;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public TipoContacto getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(TipoContacto tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

}
