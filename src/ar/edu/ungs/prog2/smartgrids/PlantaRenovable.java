package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public abstract class PlantaRenovable extends Planta {
    private String fuentePrimaria;
    private double eficienciaPromedio;

    public PlantaRenovable(String nombre, String direccion, double capMaxima, LocalDateTime fechaHoraFuncionamiento, String fuentePrimaria, double eficienciaPromedio) {
        super(nombre, direccion, capMaxima, fechaHoraFuncionamiento);
        this.fuentePrimaria = fuentePrimaria;
        this.eficienciaPromedio = eficienciaPromedio;
    }

    @Override
    public abstract boolean cumpleCuota(Registro registro); //metodo abstracto que será implementado en las subclases
    
    @Override
    public double capacidadMinimaCuota() {
    	return getCapMaxima() * this.eficienciaPromedio;
    }
    
    public String getFuentePrimaria() {
        return this.fuentePrimaria;
    }

    public double getEficienciaPromedio() {
        return this.eficienciaPromedio;
    }

    public String toString() {
        return super.toString() + ", Fuente Primaria: " + fuentePrimaria + ", Eficiencia Promedio: " + eficienciaPromedio;
    }

    
}
