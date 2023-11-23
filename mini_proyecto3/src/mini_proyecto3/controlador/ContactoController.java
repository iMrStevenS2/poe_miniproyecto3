package mini_proyecto3.controlador;

import mini_proyecto3.modelo.ContactoDAO;
import mini_proyecto3.modelo.ContactoDAOImp;
import mini_proyecto3.vista.directorioUI;

import java.util.List;

import mini_proyecto3.modelo.Contacto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactoController {

    private Contacto contactoModelo;
    private directorioUI directorioVista;
    private ContactoDAO contactoDAO;

    public ContactoController(Contacto contactoModelo, directorioUI directorioVista) {
        this.contactoModelo = contactoModelo;
        this.directorioVista = directorioVista;
        this.contactoDAO = new ContactoDAOImp();

        directorioVista.addAgregarContactoListener(new agregarContactoListener());



        // directorioVista.addListarContactosListener(new listarContactosListener());

    }

    class agregarContactoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String fechaNacimiento = "";
            String numeroIdentificacion = "";
            String nombres = "";
            String apellidos = "";
            TipoContacto tipoContacto = null;
            String tipoContactoSeleccionado = "";

            TipoContacto tipoProfesor = TipoContacto.PROFESOR;
            TipoContacto tipoEmpleado = TipoContacto.EMPLEADO;
            TipoContacto tipoEstudiante = TipoContacto.ESTUDIANTE;
            System.out.println("ENTRO");
            try {
                fechaNacimiento = directorioVista.getFechaNacimientoProfesor();
                numeroIdentificacion = directorioVista.getNumeroIdentificacionProfesor();
                nombres = directorioVista.getNombresProfesor();
                apellidos = directorioVista.getApellidosProfesor();
                tipoContactoSeleccionado = directorioVista.getTipoContactoProfesor();

                if (tipoContactoSeleccionado.equals("PROFESOR")) {
                    tipoContacto = tipoProfesor;
                } else if (tipoContactoSeleccionado.equals("EMPLEADO")) {
                    tipoContacto = tipoEmpleado;
                } else if (tipoContactoSeleccionado.equals("ESTUDIANTE")) {
                    tipoContacto = tipoEstudiante;
                }
                System.out.println("EXITO");
            } catch (Exception ex) {
                System.out.println(ex);
            }

            Contacto contacto = new Contacto(fechaNacimiento, numeroIdentificacion, nombres, apellidos, tipoContacto);
            contactoDAO.agregarContacto(contacto);
            System.out.println("EMPLEADO AGREGADO");

        }
    }

    class listarContactosListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            listarContactos();
        }
    }

    public void agregarContacto() {
        // Contacto contacto = new Contacto("1999-01-01", "123456789", "Juan", "Perez",
        // tipoContacto);
        // Contacto contacto2 = new Contacto("1999-01-01", "234567890", "Pedro",
        // "Perez", tipoContacto);
        // Contacto contacto3 = new Contacto("1999-01-01", "345678901", "Maria",
        // "Perez", tipoContacto);
        // contactoDAO.agregarContacto(contacto);
        // contactoDAO.agregarContacto(contacto2);
        // contactoDAO.agregarContacto(contacto3);
    }

    public void actualizarContacto() {
        // Contacto contactoAntiguo = new Contacto("1999-01-01", "123456789", "Juan",
        // "Perez", tipoContacto);
        // Contacto contactoNuevo = new Contacto("1999-01-01", "123456789", "Juan",
        // "Perez", tipoContacto);
        // contactoDAO.actualizarContacto(contactoAntiguo, contactoNuevo);
    }

    public void eliminarContacto() {
        // Contacto contacto = new Contacto("1999-01-01", "123456789", "Juan", "Perez",
        // tipoContacto);
        // contactoDAO.eliminarContacto(contacto);
    }

    public void listarContactos() {

        List<Contacto> listaContactos = contactoDAO.listarContactos();

        for (int i = 0; i < listaContactos.size(); i++) {
            System.out.println("Contacto " + (i + 1) + ": ");
            System.out.println("Fecha de nacimiento: " + listaContactos.get(i).getFechaNacimiento());
            System.out.println("Numero de identificacion: " + listaContactos.get(i).getNumeroIdentificacion());
            System.out.println("Nombres: " + listaContactos.get(i).getNombres());
            System.out.println("Apellidos: " + listaContactos.get(i).getApellidos());
            System.out.println("Tipo de contacto: " + listaContactos.get(i).getTipoContacto());
            System.out.println("Direcciones: " + listaContactos.get(i).getDirecciones());
            System.out.println("Telefonos: " + listaContactos.get(i).getTelefonos());
            System.out.println(listaContactos.size());

        }

        // listaContactos.forEach(contacto -> {

        // System.out.println("Contacto " + i + ": ");
        // System.out.println("Fecha de nacimiento: " + contacto.getFechaNacimiento());
        // System.out.println("Numero de identificacion: " +
        // contacto.getNumeroIdentificacion());
        // System.out.println("Nombres: " + contacto.getNombres());
        // System.out.println("Apellidos: " + contacto.getApellidos());
        // System.out.println("Tipo de contacto: " + contacto.getTipoContacto());
        // System.out.println("Direcciones: " + contacto.getDirecciones());
        // System.out.println("Telefonos: " + contacto.getTelefonos());

        // });

        // contactoDAO.listarContactos();
    }
}
