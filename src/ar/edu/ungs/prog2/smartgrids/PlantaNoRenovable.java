package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDate;

public class PlantaNoRenovable extends Planta {
    private String tipoCombustible;
    private double objetivoEmision;
    private double capacidadCombustible;

    public PlantaNoRenovable(String nombre, String direccion, double capMaxima,LocalDate fechaFuncionamiento, int ID, String tipoCombustible, double objetivoEmision, double capacidadCombustible) {
        super(nombre, direccion, capMaxima, fechaFuncionamiento, ID);
        this.tipoCombustible = tipoCombustible;
        this.objetivoEmision = objetivoEmision;
        this.capacidadCombustible = capacidadCombustible;
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
    
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    
    public double getObjetivoEmision() {
        return objetivoEmision;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public String toString() {
        return "PlantaNoRenovable [tipoCombustible=" + tipoCombustible + ", objetivoEmision=" + objetivoEmision
                + ", capacidadCombustible=" + capacidadCombustible + "]";
    }

}
