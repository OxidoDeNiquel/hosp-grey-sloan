/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import excepciones.EstadoException;

/**
 *
 * @author niobeclaveria
 */
public class Paciente extends Usuario{
    
    private int edad;
    private EstadoPaciente estado;
    
    public Paciente(int id, String nombre, String apellido, int edad, String estado){
        super(id, nombre, apellido);
        
        this.edad = edad;
        
        //Nos aseguramos de que el estado sea el correcto
        if(estado == "ASEGURADO" || estado == "NO_ASEGURADO"){            
            this.estado = EstadoPaciente.valueOf(estado);            
        }
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadoPaciente getEstado() {
        return estado;
    }

    public void setEstado(EstadoPaciente estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paciente:\n" + "Nombre=" + this.getNombre() + "\nApellido=" + this.getApellido() + "\nEdad=" + edad + "\nEstado=" + estado;
    }
    
}
