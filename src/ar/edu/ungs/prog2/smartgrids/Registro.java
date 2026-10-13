package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Registro
 */
public class Registro {

    private LocalDateTime fechaYhora;
    private double energiaGenerada;
    private int cantIncidencias;
    private String IDRegistro;
    private String IDPlanta;


    public Registro(LocalDateTime fechaYhora, double energiaGenerada, int cantIncidencias, String IDPlanta) {
        this.fechaYhora = fechaYhora;
        this.energiaGenerada = energiaGenerada;
        this.cantIncidencias = cantIncidencias;
        this.IDRegistro = UUID.randomUUID().toString();
        this.IDPlanta = IDPlanta;
    }


    public LocalDateTime getFechaYhora() {
        return this.fechaYhora;
    }


    public double getEnergiaGenerada() {
        return this.energiaGenerada;
    }


    public int getCantIncidencias() {
        return this.cantIncidencias;
    }


    public String getIDRegistro() {
        return this.IDRegistro;
    }


    public String getIDPlanta() {
        return this.IDPlanta;
    }


    public String toString() {
        return "Registro [fechaYhora=" + fechaYhora + ", energiaGenerada=" + energiaGenerada + ", cantIncidencias="
                + cantIncidencias + ", IDRegistro=" + IDRegistro + ", IDPlanta=" + IDPlanta + "]";
    }
}
