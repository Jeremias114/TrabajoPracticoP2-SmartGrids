package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class Solar extends PlantaRenovable {
    private double superficieCubierta;
    private int cantPaneles;
    private double horasRadiacion;

    public Solar(String nombre, String direccion, double capMaxima, LocalDateTime fechaHoraFuncionamiento, String fuentePrimaria, double eficienciaPromedio, double superficieCubierta, int cantPaneles, double horasRadiacion) {
        super(nombre, direccion, capMaxima, fechaHoraFuncionamiento, fuentePrimaria, eficienciaPromedio);
        this.superficieCubierta = superficieCubierta;
        this.cantPaneles = cantPaneles;
        this.horasRadiacion = horasRadiacion;
    }
    
    @Override
    public boolean nuncaCumplioCuota() {
        return super.nuncaCumplioCuota();
    }

    @Override
    public boolean cumpleCuota(Registro registro) {
        return registro.getEnergiaGenerada() >= capacidadMinimaCuota();
    }
    
    @Override
    public double capacidadMinimaCuota() {
    	return getCapMaxima() * getEficienciaPromedio() * getHorasRadiacion() / 24.0;
    }
    
    public double getSuperficieCubierta() {
        return this.superficieCubierta;
    }

    public int getCantPaneles() {
        return this.cantPaneles;
    }

    public double getHorasRadiacion() {
        return this.horasRadiacion;
    }

    public String toString() {
        return "Solar: " + super.toString() + ", Superficie Cubierta: " + superficieCubierta + ", Cantidad De Paneles: " + cantPaneles + ", Horas De Radiación: " + horasRadiacion + "]";
    }

}
