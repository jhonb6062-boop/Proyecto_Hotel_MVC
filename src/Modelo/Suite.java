/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Suite extends HabitacionSimple {
    
    public Suite(int numero, String estado) {
        super(numero, estado);
        
    }
    public double calcularCosto() {
        return 650000.0;
    }
}
