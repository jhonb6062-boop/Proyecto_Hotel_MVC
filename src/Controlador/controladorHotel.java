/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class controladorHotel {
    
    private Hotel hotel;

    public controladorHotel() {
        hotel = new Hotel();
    }

public Huesped crearHuesped(String documento, String nombre, String correo, String telefono, int diaNacimiento, int mesNacimiento, int anioNacimiento, double estatura, String tipoHuesped) {
    if (buscarHuesped(documento) == null) {
        try {
            LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
            Huesped huesped = new Huesped(documento, nombre, correo, telefono, estatura, fechaNacimiento, tipoHuesped);
            hotel.getListaHuespedes().add(huesped);
            return huesped;
        } catch (Exception ex) {
            System.out.println("error al crear huesped: " + ex.getMessage());
            return null;
        }
    } else {
        System.out.println("El huesped ya existe: " + documento);
        return null;
    }
}

    public Huesped buscarHuesped(String documento) {
        for (Huesped h : hotel.getListaHuespedes()) {
            if (h.getDocumento().equals(documento)) {
                return h;
            }
        }
        return null;
    }

    public boolean modificarHuesped(Huesped hNuevo) {
        Huesped hViejo = buscarHuesped(hNuevo.getDocumento());
        if (hViejo != null) {
            hViejo.setNombre(hNuevo.getNombre());
            hViejo.setCorreo(hNuevo.getCorreo());
            hViejo.setTelefono(hNuevo.getTelefono());
            hViejo.setFechaNacimiento(hNuevo.getFechaNacimiento());
            hViejo.setEstatura(hNuevo.getEstatura());
            hViejo.setTipoHuesped(hNuevo.getTipoHuesped());
            return true;
        }
        return false;
    }

    public boolean eliminarHuesped(String documento) {
        Huesped h = buscarHuesped(documento);
        if (h != null) {
            hotel.getListaHuespedes().remove(h);
            return true;
        }
        return false;
    }

    
    
    
    public boolean agregarHabitacion(HabitacionSimple hab) {
        if (buscarHabitacion(hab.getNumero()) == null) {
            hotel.getListaHabitaciones().add(hab);
            return true;
        }
        return false;
    }

    public HabitacionSimple buscarHabitacion(int numero) {
        for (HabitacionSimple hab : hotel.getListaHabitaciones()) {
            if (hab.getNumero() == numero) {
                return hab;
            }
        }
        return null;
    }

    public boolean modificarEstadoHabitacion(int numero, String nuevoEstado) {
        HabitacionSimple hab = buscarHabitacion(numero);
        if (hab != null) {
            hab.setEstado(nuevoEstado);
            return true;
        }
        return false;
    }

    public boolean eliminarHabitacion(int numero) {
        HabitacionSimple hab = buscarHabitacion(numero);
        if (hab != null) {
            hotel.getListaHabitaciones().remove(hab);
            return true;
        }
        return false;
    }


    
    
    public boolean crearReserva(String codigo, Huesped huesped, HabitacionSimple habitacion, 
            LocalDate fechaIngreso, LocalDate fechaSalida, int cantidadNoches, double valorNoche) {
    if (buscarReserva(codigo) != null) {
        return false;
    }
    Reserva nuevaReserva = new Reserva(codigo, huesped, habitacion, fechaIngreso, fechaSalida, cantidadNoches, valorNoche);
    return hotel.getListaReservas().add(nuevaReserva);
}
    
    public Reserva buscarReserva(String codigo) {
        for (Reserva r : hotel.getListaReservas()) {
            if (r.getCodigoReserva().equals(codigo)) {
                return r;
            }
        }
        return null;
    }

    public boolean eliminarReserva(String codigo) {
        Reserva r = buscarReserva(codigo);
        if (r != null) {
            r.getHabitacion().setEstado("Disponible");
            hotel.getListaReservas().remove(r);
            return true;
        }
        return false;
    }

public boolean actualizarHabitacion(HabitacionSimple habModificada) {
    for (int i = 0; i < hotel.getListaHabitaciones().size(); i++) {
        HabitacionSimple h = hotel.getListaHabitaciones().get(i);
        
        if (h.getNumero() == habModificada.getNumero()) {
            hotel.getListaHabitaciones().set(i, habModificada);
            return true;
        }
    }
    return false;
}

    public boolean crearReserva(String codigo, Huesped huespedEncontrado, HabitacionSimple habitacionEncontrada, LocalDate fechaIngreso, LocalDate fechaSalida, int cantidadNoches, double valorPorNoche, double valorTotal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
