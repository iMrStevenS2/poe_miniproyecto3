package mini_proyecto3.modelo;

import java.util.ArrayList;
import java.util.List;

public class ContactoDAOImp implements ContactoDAO {

    List<Contacto> listaContactos = new ArrayList<>();
    

    @Override
    public void agregarContacto(Contacto contacto) {
        listaContactos.add(contacto);
        System.out.println("Contacto agregado");
        
    }

    @Override
    public void actualizarContacto(Contacto contactoAntiguo, Contacto contactoNuevo) {
    }

    @Override
    public void eliminarContacto(Contacto contacto) {
    }

    @Override
    public List<Contacto> listarContactos() {
        return listaContactos;
    }

}
