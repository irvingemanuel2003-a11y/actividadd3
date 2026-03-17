package Problema1;

import java.time.LocalDate;

public class Solicitud {

    private String nombreInterprete;
    private LocalDate fechaSolicitud;
    private LocalDate fechaAutorizacion;
    private String companiaGrabadora;

    public Solicitud(String nombreInterprete, LocalDate fechaSolicitud, String companiaGrabadora) {
        this.nombreInterprete = nombreInterprete;
        this.fechaSolicitud = fechaSolicitud;
        this.companiaGrabadora = companiaGrabadora;
    }

    public String getNombreInterprete() {
        return nombreInterprete;
    }

    public void setNombreInterprete(String nombreInterprete) {
        this.nombreInterprete = nombreInterprete;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDate getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(LocalDate fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public String getCompaniaGrabadora() {
        return companiaGrabadora;
    }

    public void setCompaniaGrabadora(String companiaGrabadora) {
        this.companiaGrabadora = companiaGrabadora;
    }

    public void autorizar(LocalDate fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public void mostrarSolicitud() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "nombreInterprete='" + nombreInterprete + '\'' +
                ", fechaSolicitud=" + fechaSolicitud +
                ", fechaAutorizacion=" + fechaAutorizacion +
                ", companiaGrabadora='" + companiaGrabadora + '\'' +
                '}';
    }

}
