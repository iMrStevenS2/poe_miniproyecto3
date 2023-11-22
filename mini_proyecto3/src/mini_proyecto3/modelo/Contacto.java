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

    public void agregarDireccion(Direccion Direccion) {
        direcciones.add(Direccion);
    }

    public void actualizarDireccion(Direccion direccionAntigua, Direccion direccionNueva) {
        if (direcciones.contains(direccionAntigua)) {
            int index = direcciones.indexOf(direccionAntigua);
            direcciones.set(index, direccionNueva);
        }
    }

    public void eliminarDireccion(Direccion Direccion) {
        direcciones.remove(Direccion);
    }

    public List<Direccion> listarDirecciones() {
        return direcciones;
    }

    public void agregarTelefono(Telefono telefono) {
        telefonos.add(telefono);
    }

    public void actualizarTelefono(Telefono telefonoAntiguo, Telefono telefonoNuevo) {
        if (telefonos.contains(telefonoAntiguo)) {
            int index = telefonos.indexOf(telefonoAntiguo);
            telefonos.set(index, telefonoNuevo);
        }
    }

    public void eliminarTelefono(Telefono telefono) {
        telefonos.remove(telefono);
    }

    public List<Telefono> listarTelefonos() {
        return telefonos;
    }
}
