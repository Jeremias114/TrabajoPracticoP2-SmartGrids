package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

/**
 * Registro
 */
public class Registro {

    private LocalDateTime fechaYhora;
    private double energiaGenerada;
    private int cantIncidencias;
    private int IDRegistro;
    private int IDPlanta;


    public Registro(LocalDateTime fechaYhora, double energiaGenerada, int cantIncidencias, int IDRegistro, int IDPlanta) {
        this.fechaYhora = fechaYhora;
        this.energiaGenerada = energiaGenerada;
        this.cantIncidencias = cantIncidencias;
        this.IDRegistro = IDRegistro;
        this.IDPlanta = IDPlanta;
    }


    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }


    public double getEnergiaGenerada() {
        return energiaGenerada;
    }


    public int getCantIncidencias() {
        return cantIncidencias;
    }


    public int getIDRegistro() {
        return IDRegistro;
    }


    public int getIDPlanta() {
        return IDPlanta;
    }


    public String toString() {
        return "Registro [fechaYhora=" + fechaYhora + ", energiaGenerada=" + energiaGenerada + ", cantIncidencias="
                + cantIncidencias + ", IDRegistro=" + IDRegistro + ", IDPlanta=" + IDPlanta + "]";
    }
}
