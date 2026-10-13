package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class RegistroEolicas extends Registro {
    double velocidadVientoPromedio;

    public RegistroEolicas(LocalDateTime fechaYhora, double energiaGenerada, int cantIncidencias, String IDPlanta, double velocidadVientoPromedio) {
        super(fechaYhora, energiaGenerada, cantIncidencias, IDPlanta);
        this.velocidadVientoPromedio = velocidadVientoPromedio;
    }

    public double getVelocidadVientoPromedio() {
        return this.velocidadVientoPromedio;
    }

    public String toString() {
        return "RegistroEolicas [velocidadVientoPromedio=" + velocidadVientoPromedio + ", fechaYhora=" + getFechaYhora() + ", energiaGenerada=" + getEnergiaGenerada() + ", cantIncidencias="
                + getCantIncidencias() + ", IDRegistro=" + getIDRegistro() + ", IDPlanta=" + getIDPlanta() + "]";
    }
}
