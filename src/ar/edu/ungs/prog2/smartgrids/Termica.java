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
    	if(!(registro instanceof RegistroTermicas)) {
    		return false;
    	}
    	
    	RegistroTermicas registroTermico = (RegistroTermicas) registro;
    	
        return registro.getEnergiaGenerada() >= capacidadMinimaCuota() && registroTermico.getCantCO2Generado() < objetivoEmisionCO2;
    }

    @Override
    public boolean nuncaCumplioCuota() {
        return super.nuncaCumplioCuota();
    }
    
    @Override
    public double capacidadMinimaCuota() {
    	return getCapMaxima() / 2.0;
    }

    public double getObjetivoEmisionCO2() {
        return this.objetivoEmisionCO2;
    }

    public String toString() {
        return super.toString() + ", Objetivo De Emisión De CO2: " + objetivoEmisionCO2;
    }
}
