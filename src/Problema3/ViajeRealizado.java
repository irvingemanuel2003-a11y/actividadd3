package Problema3;

import java.time.LocalDate;

public class ViajeRealizado {
    private String ciudadDestino;
    private String direccion;
    private LocalDate fechaViaje;
    private LocalDate fechaRegreso;
    private String descripcionCarga;
    private double montoViaje;

    public ViajeRealizado(String ciudadDestino, String direccion, LocalDate fechaViaje,
                          LocalDate fechaRegreso, String descripcionCarga, double montoViaje) {

        this.ciudadDestino = ciudadDestino;
        this.direccion = direccion;
        this.fechaViaje = fechaViaje;
        this.fechaRegreso = fechaRegreso;
        this.descripcionCarga = descripcionCarga;
        this.montoViaje = montoViaje;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public LocalDate getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(LocalDate fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getDescripcionCarga() {
        return descripcionCarga;
    }

    public void setDescripcionCarga(String descripcionCarga) {
        this.descripcionCarga = descripcionCarga;
    }

    public double getMontoViaje() {
        return montoViaje;
    }

    public void setMontoViaje(double montoViaje) {
        this.montoViaje = montoViaje;
    }

    public void mostrarViaje() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ViajeRealizado{" +
                "ciudadDestino='" + ciudadDestino + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaViaje=" + fechaViaje +
                ", fechaRegreso=" + fechaRegreso +
                ", descripcionCarga='" + descripcionCarga + '\'' +
                ", montoViaje=" + montoViaje +
                '}';
    }
}
