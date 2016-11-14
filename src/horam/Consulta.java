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
public class Consulta 
{
    private int id;
    private String tipoConsulta;
    private String hora;

    public Consulta() {
    }

    public Consulta(int id, String tipoConsulta, String hora) {
        this.id = id;
        this.tipoConsulta = tipoConsulta;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
}
