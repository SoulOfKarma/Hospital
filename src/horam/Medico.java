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
public class Medico extends Especialidad
{
    private String rutMedico;
    private String nombreMedico;

    public Medico() {
    }

    public Medico(String rutMedico, String nombreMedico, String tipoEspecialidad) {
        super(tipoEspecialidad);
        this.rutMedico = rutMedico;
        this.nombreMedico = nombreMedico;
    }

    public String getRutMedico() {
        return rutMedico;
    }

    public void setRutMedico(String rutMedico) {
        this.rutMedico = rutMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

  

   
    
}
