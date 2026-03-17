package Problema2;

import java.time.LocalDate;
import java.time.Period;

public class Paciente {
    private String nombre;
    private String rfc;
    private LocalDate fechaNacimiento;
    private Consulta[] consultas;

    public Paciente(String nombre, String rfc, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.fechaNacimiento = fechaNacimiento;
        consultas = new Consulta[20];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Consulta[] getConsultas() {
        return consultas;
    }

    public void agregarConsulta(Consulta c) {   // CORREGIDO
        for (int i = 0; i < consultas.length; i++) {
            if (consultas[i] == null) {
                consultas[i] = c;
                break;
            }
        }
    }

    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public int obtenerEdad() {
        return calcularEdad();
    }
    public void mostrarConsultas(){
        for(Consulta c : consultas){
            if(c != null){
                System.out.println(c);
            }
        }
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", rfc='" + rfc + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + calcularEdad() +
                '}';
    }
}
