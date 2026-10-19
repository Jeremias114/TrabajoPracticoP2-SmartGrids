package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class RegistroTermicas extends Registro {
    private double  cantCO2Generado;
    private double  combustibleConsumido;

    public RegistroTermicas(LocalDateTime fechaYhora, double energiaGenerada, int cantIncidencias, String IDPlanta, double cantCO2Generado, double combustibleConsumido) {
        super(fechaYhora, energiaGenerada, cantIncidencias, IDPlanta);
        this.cantCO2Generado = cantCO2Generado;
        this.combustibleConsumido = combustibleConsumido;
    }

    public double getCantCO2Generado() {
        return this.cantCO2Generado;
    }
    
    public double getCombustibleConsumido() {
        return this.combustibleConsumido;
    }

    public String toString() {
        return "RegistroTermicas [cantCO2Generado=" + cantCO2Generado + ", fechaYhora=" + getFechaYhora() + ", energiaGenerada=" + getEnergiaGenerada() + ", cantIncidencias="
                + getCantIncidencias() + ", IDRegistro=" + getIDRegistro() + ", IDPlanta=" + getIDPlanta() + "]";
    }
}
