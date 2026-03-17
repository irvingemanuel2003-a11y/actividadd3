package Problema2;

import java.time.LocalDate;

public class Consulta {
    private LocalDate fecha;
    private String[] sintomas;
    private double peso;
    private double estatura;
    private String[] diagnosticoMedico;
    private String[] receta;
    private double temperatura;

    public Consulta(LocalDate fecha, double peso, double estatura, double temperatura) {
        this.fecha = fecha;
        this.peso = peso;
        this.estatura = estatura;
        this.temperatura = temperatura;

        sintomas = new String[10];
        diagnosticoMedico = new String[10];
        receta = new String[10];
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public String[] getDiagnosticoMedico() {
        return diagnosticoMedico;
    }

    public String[] getReceta() {
        return receta;
    }

    public void mostrarConsulta() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "fecha=" + fecha +
                ", peso=" + peso +
                ", estatura=" + estatura +
                ", temperatura=" + temperatura +
                '}';
    }
}
