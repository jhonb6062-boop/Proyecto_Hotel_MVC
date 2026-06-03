/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Hotel {
    private String nombre;
    private ArrayList<Huesped> listaHuespedes;
    private ArrayList<HabitacionSimple> listaHabitaciones;
    private ArrayList<Reserva> listaReservas;

      public Hotel() {
        this.nombre = "Hotel U. Caldas";
        this.listaHuespedes = new ArrayList<>();
        this.listaHabitaciones = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public String getNombreHotel() {
        return nombre;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombre = nombreHotel;
    }

    public ArrayList<Huesped> getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(ArrayList<Huesped> listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public ArrayList<HabitacionSimple> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<HabitacionSimple> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    
}
