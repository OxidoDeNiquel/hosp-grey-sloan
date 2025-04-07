/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author niobeclaveria
 */
public class Medico extends Usuario{
    
    private String especialidad;
    
    public Medico(int id, String nombre, String apellido, String especialidad) {
        super(id, nombre, apellido);
        
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico:\n"+ "Nombre=" + this.getNombre() + "\nApellido=" + this.getApellido() + "Especialidad=" + especialidad;
    }
    
}
