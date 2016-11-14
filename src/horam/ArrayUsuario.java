/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horam;
import java.util.ArrayList;
/**
 *
 * @author RichiThe
 */
public class ArrayUsuario 
{

    ArrayList<Usuario> user = new ArrayList<>();
    public void agregarUsuario(Usuario x)
    {
      user.add(x);
    } 
    
    public ArrayList<Usuario> listar()
    {
      return this.user;
    }

    public ArrayList<Usuario> getUser() {
        return user;
    }

    public void setUser(ArrayList<Usuario> user) {
        this.user = user;
    }
    
    
    
    
}
