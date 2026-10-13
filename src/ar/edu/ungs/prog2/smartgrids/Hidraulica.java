package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDate;

public class Hidraulica extends PlantaRenovable {
    private int cantTurbinas;
    private double capacidadEmbalse;

    public Hidraulica(String nombre, String direccion, double capMaxima, LocalDate fechaFuncionamiento, int ID,
            String fuentePrimaria, double eficienciaPromedio, int cantTurbinas, double capacidadEmbalse) {
        super(nombre, direccion, capMaxima, fechaFuncionamiento, ID, fuentePrimaria, eficienciaPromedio);
        this.cantTurbinas = cantTurbinas;
        this.capacidadEmbalse = capacidadEmbalse;
    }
    
    @Override
    public boolean nuncaCumplioCuota() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nuncaCumplioCuota'");
    }

    @Override
    public boolean cumpleCuota(Registro registro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cumpleCuota'");
    }

    public int getCantTurbinas() {
        return cantTurbinas;
    }

    public double getCapacidadEmbalse() {
        return capacidadEmbalse;
    }
    
    public String toString() {
        return "Hidraulica [cantTurbinas=" + cantTurbinas + ", capacidadEmbalse=" + capacidadEmbalse + "]";
    }

}
