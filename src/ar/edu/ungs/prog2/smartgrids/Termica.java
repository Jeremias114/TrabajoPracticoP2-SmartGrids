package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class Termica extends PlantaNoRenovable {
    
    double objetivoEmisionCO2;

    public Termica(String nombre, String direccion, double capMaxima, LocalDateTime fechaHoraFuncionamiento, String tipoCombustible, double objetivoEmisionCO2, double capacidadCombustible) {
        super(nombre, direccion, capMaxima, fechaHoraFuncionamiento, tipoCombustible, capacidadCombustible);
        this.objetivoEmisionCO2 = objetivoEmisionCO2;
    }

    @Override
    public boolean cumpleCuota(Registro registro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cumpleCuota'");
    }

    @Override
    public boolean nuncaCumplioCuota() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nuncaCumplioCuota'");
    }

    public double getObjetivoEmisionCO2() {
        return this.objetivoEmisionCO2;
    }

    public String toString() {
        return "Termica [objetivoEmisionCO2=" + objetivoEmisionCO2 + "]";
    }
}
