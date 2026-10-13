package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class RegistroEolicas extends Registro {
    double velocidadVientoPromedio;

    public RegistroEolicas(LocalDateTime fechaYhora, double energiaGenerada, int cantIncidencias, int IDRegistro, int IDPlanta, double velocidadVientoPromedio) {
        super(fechaYhora, energiaGenerada, cantIncidencias, IDRegistro, IDPlanta);
        this.velocidadVientoPromedio = velocidadVientoPromedio;
    }

    public double getVelocidadVientoPromedio() {
        return velocidadVientoPromedio;
    }

    public String toString() {
        return "RegistroEolicas [velocidadVientoPromedio=" + velocidadVientoPromedio + ", fechaYhora=" + getFechaYhora() + ", energiaGenerada=" + getEnergiaGenerada() + ", cantIncidencias="
                + getCantIncidencias() + ", IDRegistro=" + getIDRegistro() + ", IDPlanta=" + getIDPlanta() + "]";
    }
}
