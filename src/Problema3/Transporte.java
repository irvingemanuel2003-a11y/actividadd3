package Problema3;

import java.time.LocalDate;

public class Transporte {
    private String marca;
    private String modelo;
    private double cantidadMaxima;
    private LocalDate fechaAdquisicion;
    private ViajeRealizado[] viajesRealizados;

    public Transporte(String marca, String modelo, double cantidadMaxima, LocalDate fechaAdquisicion) {

        this.marca = marca;
        this.modelo = modelo;
        this.cantidadMaxima = cantidadMaxima;
        this.fechaAdquisicion = fechaAdquisicion;

        viajesRealizados = new ViajeRealizado[20];
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(double cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public ViajeRealizado[] getViajesRealizados() {
        return viajesRealizados;
    }

    public void asignarViaje(ViajeRealizado viajeRealizado) {
        for (int i = 0; i < viajesRealizados.length; i++) {
            if (viajesRealizados[i] == null) {
                viajesRealizados[i] = viajeRealizado;
                break;
            }
        }
    }

    public void cancelarViaje(ViajeRealizado viajeRealizado) {
        for (int i = 0; i < viajesRealizados.length; i++) {
            if (viajesRealizados[i] == viajeRealizado) {
                viajesRealizados[i] = null;
                break;
            }
        }
    }

    public void mostrarViajes() {
        for (ViajeRealizado v : viajesRealizados) {
            if (v != null) {
                System.out.println(v);
            }
        }
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cantidadMaxima=" + cantidadMaxima +
                ", fechaAdquisicion=" + fechaAdquisicion +
                '}';
    }
}
