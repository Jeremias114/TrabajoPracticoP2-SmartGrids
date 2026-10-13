package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDate;

public abstract class PlantaRenovable extends Planta {
    private String fuentePrimaria;
    private double eficienciaPromedio;

    public PlantaRenovable(String nombre, String direccion, double capMaxima, LocalDate fechaFuncionamiento, int ID, String fuentePrimaria, double eficienciaPromedio) {
        super(nombre, direccion, capMaxima, fechaFuncionamiento);
        this.fuentePrimaria = fuentePrimaria;
        this.eficienciaPromedio = eficienciaPromedio;
    }
    
    @Override
    public abstract boolean nuncaCumplioCuota(); //metodo abstracto que obliga a las subclases a implementarlo, ya que PlantaRenovable es abstracta y no se puede instanciar.

    public String getFuentePrimaria() {
        return this.fuentePrimaria;
    }

    public double getEficienciaPromedio() {
        return this.eficienciaPromedio;
    }

    public String toString() {
        return "PlantaRenovable [fuentePrimaria=" + fuentePrimaria + ", eficienciaPromedio=" + eficienciaPromedio + "]";
    }

}
