/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mini_proyecto3;

import mini_proyecto3.controlador.ContactoController;
import mini_proyecto3.modelo.Contacto;
import mini_proyecto3.vista.directorioUI;

/**
 *
 * @author steve
 */
public class Mini_proyecto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contacto contactoModelo = new Contacto();
        directorioUI dir = new directorioUI();
        ContactoController contactoController = new ContactoController(contactoModelo, dir  );
        // contactoController.agregarContacto();
        // contactoController.listarContactos();
        dir.setVisible(true);

    }

}
