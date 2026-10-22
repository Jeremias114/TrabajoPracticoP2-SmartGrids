package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class Hidraulica extends PlantaRenovable {
    private int cantTurbinas;
    private double capacidadEmbalse;

    public Hidraulica(String nombre, String direccion, double capMaxima, LocalDateTime fechaHoraFuncionamiento, String fuentePrimaria, double eficienciaPromedio, int cantTurbinas, double capacidadEmbalse) {
        super(nombre, direccion, capMaxima, fechaHoraFuncionamiento, fuentePrimaria, eficienciaPromedio);
        this.cantTurbinas = cantTurbinas;
        this.capacidadEmbalse = capacidadEmbalse;
    }
    
    @Override
    public boolean nuncaCumplioCuota() {
        return super.nuncaCumplioCuota();
    }

    @Override
    public boolean cumpleCuota(Registro registro) {
        return registro.getEnergiaGenerada() >= capacidadMinimaCuota();
    }

    public int getCantTurbinas() {
        return cantTurbinas;
    }

    public double getCapacidadEmbalse() {
        return capacidadEmbalse;
    }
    
    public String toString() {
        return "Hidraulica: " + super.toString() + ", Cantidad De Turbinas: " + cantTurbinas + ", Capacidad Del Embalse: " + capacidadEmbalse;
    }

}
