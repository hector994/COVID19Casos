/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema1.PersonaBL;

/**
 *
 * @author Hector Murillo
 */
public class CasosC {
    // variables 
    int id;
    String dia, nuevos, fallecidos, recuperados, activos;
    
    //aquiestan los metodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getActivos() {
        return activos;
    }

    public void setActivos(String activos) {
        this.activos = activos;
    }
  
    public String getNuevos() {
        return nuevos;
    }

    public void setNuevos(String nuevos) {
        this.nuevos = nuevos;
    }
    
    

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getFallecidos() {
        return fallecidos;
    }

    public void setFallecidos(String fallecidos) {
        this.fallecidos = fallecidos;
    }

    public String getRecuperados() {
        return recuperados;
    }

    public void setRecuperados(String recuperados) {
        this.recuperados = recuperados;
    }

}
