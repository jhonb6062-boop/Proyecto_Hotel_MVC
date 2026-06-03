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
public class Huesped {
    
    private String documento;
    private String nombre;
    private String correo;
    private String telefono;
    private double estatura;
    private LocalDate fechaNac;
    private String tipoHuesped; 

    public Huesped(String documento, String nombre, String correo, String telefono, double estatura, 
            LocalDate fechaNac, String tipoHuesped) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.estatura = estatura;
        this.fechaNac = fechaNac;
        this.tipoHuesped = tipoHuesped;
    }

    public String getTipoHuesped() {
        return tipoHuesped;
    }

    public void setTipoHuesped(String tipoHuesped) {
        this.tipoHuesped = tipoHuesped;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNac;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNac = fechaNacimiento;
    }
   
    
}
