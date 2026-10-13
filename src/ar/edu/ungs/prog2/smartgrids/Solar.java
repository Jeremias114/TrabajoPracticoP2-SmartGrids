package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDate;

public class Solar extends PlantaRenovable {
    private double superficieCubierta;
    private int cantPaneles;
    private int horasRadiacion;

    public Solar(String nombre, String direccion, double capMaxima, LocalDate fechaFuncionamiento, int ID, String fuentePrimaria, double eficienciaPromedio, double superficieCubierta, int cantPaneles, int horasRadiacion) {
        super(nombre, direccion, capMaxima, fechaFuncionamiento, ID, fuentePrimaria, eficienciaPromedio);
        this.superficieCubierta = superficieCubierta;
        this.cantPaneles = cantPaneles;
        this.horasRadiacion = horasRadiacion;
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
    
    public double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public int getCantPaneles() {
        return cantPaneles;
    }

    public int getHorasRadiacion() {
        return horasRadiacion;
    }

    public String toString() {
        return "Solar [superficieCubierta=" + superficieCubierta + ", cantPaneles=" + cantPaneles + ", horasRadiacion="
                + horasRadiacion + "]";
    }

}
