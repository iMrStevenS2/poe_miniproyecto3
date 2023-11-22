package mini_proyecto3.modelo;

import java.util.ArrayList;
import java.util.List;
import mini_proyecto3.modelo.Contacto;

public interface ContactoDAO {
public void agregarContacto(Contacto contacto);
public void actualizarContacto(Contacto contactoAntiguo, Contacto contactoNuevo);
public void eliminarContacto(Contacto contacto);
public List<Contacto> listarContactos();
    
}



