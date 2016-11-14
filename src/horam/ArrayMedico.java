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
public class ArrayMedico
{
    private ArrayList<Medico> med = new ArrayList<>();
    
    public void agregarMedico(Medico medi)
    {
      med.add(medi);
    }
    
    public ArrayList<Medico> listarMedi()
    {
      return this.med;
    }

    public ArrayList<Medico> getMed() {
        return med;
    }

    public void setMed(ArrayList<Medico> med) {
        this.med = med;
    }
    
       
    
} 
