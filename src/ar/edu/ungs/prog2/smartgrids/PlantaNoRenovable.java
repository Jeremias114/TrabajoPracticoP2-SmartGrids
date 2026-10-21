package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public abstract class PlantaNoRenovable extends Planta {
    private String tipoCombustible;
    private double capacidadCombustible;

    public PlantaNoRenovable(String nombre, String direccion, double capMaxima,LocalDateTime fechaHoraFuncionamiento, String tipoCombustible, double capacidadCombustible) {
        super(nombre, direccion, capMaxima, fechaHoraFuncionamiento);
        this.tipoCombustible = tipoCombustible;
        this.capacidadCombustible = capacidadCombustible;
    }
    
    @Override
    public abstract boolean cumpleCuota(Registro registro); //metodo abstracto que será implementado en las subclases
    
    
    public String getTipoCombustible() {
        return this.tipoCombustible;
    }
    
    public double getCapacidadCombustible() {
        return this.capacidadCombustible;
    }

    public String toString() {
        return "PlantaNoRenovable [tipoCombustible=" + tipoCombustible + ", objetivoEmision=" +", capacidadCombustible=" + capacidadCombustible + "]";
    }

}
