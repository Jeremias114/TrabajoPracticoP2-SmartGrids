package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class RegistroTermicas extends Registro {
    private double  cantCO2Generado;

    public RegistroTermicas(LocalDateTime fechaYhora, double energiaGenerada, int cantIncidencias, int IDRegistro, int IDPlanta, double cantCO2Generado) {
        super(fechaYhora, energiaGenerada, cantIncidencias, IDRegistro, IDPlanta);
        this.cantCO2Generado = cantCO2Generado;
    }

    public double getCantCO2Generado() {
        return cantCO2Generado;
    }

    public String toString() {
        return "RegistroTermicas [cantCO2Generado=" + cantCO2Generado + ", fechaYhora=" + getFechaYhora() + ", energiaGenerada=" + getEnergiaGenerada() + ", cantIncidencias="
                + getCantIncidencias() + ", IDRegistro=" + getIDRegistro() + ", IDPlanta=" + getIDPlanta() + "]";
    }
}
