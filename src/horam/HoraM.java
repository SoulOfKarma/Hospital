/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horam;

/**
 *
 * @author RichiThe
 */
public class HoraM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Usuario user1 = new Usuario(1, "Cloud", "Strife");
        Usuario user2 = new Usuario(2, "Sephiroth", "Sephir");
        Usuario user3 = new Usuario(3, "Leon", "Squall");
        Usuario user4 = new Usuario(4, "Sora", "Kairi");
        Usuario user5 = new Usuario(5, "Riku", "KingMickey");
        
        ArrayUsuario arrU = new ArrayUsuario();
        arrU.agregarUsuario(user1);
        arrU.agregarUsuario(user2);
        arrU.agregarUsuario(user3);
        arrU.agregarUsuario(user4);
        arrU.agregarUsuario(user5);
        
        
        
        
        LoginUsuario user = new LoginUsuario();
        user.setVisible(true);
        
        user.cargarLista(arrU.getUser());
        
       
    }
    
}
