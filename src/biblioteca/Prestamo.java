/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author fauri
 */
public class Prestamo {
    
    private String codigoLibro, numeroSocio;
    private LocalDateTime fecha;

    public Prestamo(String codigoLibro, String numeroSocio, LocalDateTime fecha) {
        this.codigoLibro = codigoLibro;
        this.numeroSocio = numeroSocio;
        this.fecha = fecha;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getFechaFormateada() {
        String formato = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
        return formateador.format(this.fecha);
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigoLibro=" + codigoLibro + ", numeroSocio=" + numeroSocio + ", fecha="
                + this.getFechaFormateada() + '}';
    }
    
}
