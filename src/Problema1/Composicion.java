package Problema1;

import java.time.LocalDate;

public class Composicion {
    private String titulo;
    private int duracionSegundos;
    private int duracionMinutos;
    private Solicitud[] solicitudes;   // CORREGIDO
    private String generoMusical;
    private LocalDate fechaRegistro;
    private LocalDate fechaEstreno;

    public Composicion(String titulo, int duracionMinutos, int duracionSegundos,
                       String generoMusical, LocalDate fechaRegistro, LocalDate fechaEstreno) {

        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.duracionSegundos = duracionSegundos;
        this.generoMusical = generoMusical;
        this.fechaRegistro = fechaRegistro;
        this.fechaEstreno = fechaEstreno;
        solicitudes = new Solicitud[10];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public Solicitud[] getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(Solicitud[] solicitudes) {
        this.solicitudes = solicitudes;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void registrarSolicitud(Solicitud solicitud) {
        for (int i = 0; i < solicitudes.length; i++) {
            if (solicitudes[i] == null) {
                solicitudes[i] = solicitud;
                break;
            }
        }
    }

    public void mostrarInformacion() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Composicion{" +
                "titulo='" + titulo + '\'' +
                ", duracionMinutos=" + duracionMinutos +
                ", duracionSegundos=" + duracionSegundos +
                ", generoMusical='" + generoMusical + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaEstreno=" + fechaEstreno +
                '}';
    }
}
