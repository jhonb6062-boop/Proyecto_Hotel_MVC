/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class HabitacionDoble extends HabitacionSimple{
    private int CapacidadMax;
    
    public HabitacionDoble(int numero, String estado) {
        super(numero, estado);
        this.CapacidadMax=CapacidadMax;
    }

    public int getCapacidadMax() {
        return CapacidadMax;
    }

    public void setCapacidadMax(int CapacidadMax) {
        this.CapacidadMax = CapacidadMax;
    }
    
     public double calcularCosto() {
        return 320000.0;
    }
}
