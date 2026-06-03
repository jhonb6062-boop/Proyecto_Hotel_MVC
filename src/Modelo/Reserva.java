/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Reserva {
    private String codigoReserva;
    private Huesped huesped;
    private HabitacionSimple habitacion;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private int cantidadNoches;
    private double valorTotal;

    public Reserva(String codigoReserva, Huesped huesped, HabitacionSimple habitacionSimple, LocalDate fechaIngreso, LocalDate fechaSalida, int cantidadNoches, double valorTotal) {
        this.codigoReserva = codigoReserva;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.cantidadNoches = cantidadNoches;
        this.valorTotal = valorTotal;
        this.habitacion.setEstado("Ocupada");
    }
    
    
     private void calcularValorTotal() {
        double precioPorNoche = habitacion.Costo();
        this.valorTotal = this.cantidadNoches * precioPorNoche;
    }

    public String generarComprobante() {
        return "=== COMPROBANTE RESERVA ===" + "\n" +
               "Código: " + codigoReserva + "\n" +
               "Cliente: " + huesped.getNombre() + "\n" +
               "Habitación N°: " + habitacion.getNumero() + "\n" +
               "Valor por noche: $" + habitacion.Costo() + "\n" +
               "Total noches: " + cantidadNoches + "\n" +
               "=========================" + "\n" +
               "TOTAL A PAGAR: $" + valorTotal + "\n";
    }
    
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public HabitacionSimple getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(HabitacionSimple habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }  
    
}
