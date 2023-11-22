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


// public class ContactoDAO {
//     public void guardarContacto(Contacto contacto) {
//         // Implementar la lógica para guardar un contacto en la base de datos
//     }

//     public Contacto cargarContactoPorIdentificacion(String numeroIdentificacion) {
//         // Implementar la lógica para cargar un contacto desde la base de datos
//         return null;
//     }
// }
