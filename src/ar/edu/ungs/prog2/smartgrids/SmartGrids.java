package ar.edu.ungs.prog2.smartgrids;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * SmartGrids
 */
public class SmartGrids implements ISmartGrids {

    private HashMap<Integer, Planta> plantas;

    public SmartGrids() {
        this.plantas = new HashMap<>();
    }


    @Override
    public void registrarPlantaSolar(String nombre, String direccion, double capacidadMaxima,
            String fechaHoraPuestaEnFuncionamiento, String fuentePrimaria, double eficienciaPromedio,
            double superficieCubierta, int cantidadPaneles, double horasRadiacionDiaria) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarPlantaSolar'");
    }

    @Override
    public void registrarPlantaEolica(String nombre, String direccion, double capacidadMaxima,
            String fechaHoraPuestaEnFuncionamiento, String fuentePrimaria, double eficienciaPromedio,
            int cantidadAerogeneradores, double alturaTorres, double velocidadMinimaViento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarPlantaEolica'");
    }

    @Override
    public void registrarPlantaHidraulica(String nombre, String direccion, double capacidadMaxima,
            String fechaHoraPuestaEnFuncionamiento, String fuentePrimaria, double eficienciaPromedio,
            int cantidadTurbinas, double capacidadEmbalse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarPlantaHidraulica'");
    }

    @Override
    public void registrarPlantaTermica(String nombre, String direccion, double capacidadMaxima,
            String fechaHoraPuestaEnFuncionamiento, String tipoCombustible, double objetivoEmisionesCo2PorHora,
            double capacidadAlmacenamientoCombustible) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarPlantaTermica'");
    }

    @Override
    public List<String> consultarPlantas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarPlantas'");
    }

    @Override
    public double capacidadMinimaCuota(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'capacidadMinimaCuota'");
    }

    @Override
    public void activarPlanta(String nombre, String fechaHora) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'activarPlanta'");
    }

    @Override
    public void desactivarPlanta(String nombre, String fechaHora) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desactivarPlanta'");
    }

    @Override
    public boolean estaActiva(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaActiva'");
    }

    @Override
    public void registrarMonitoreo(String nombre, String fechaHora, double energiaGenerada, int incidencias) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarMonitoreo'");
    }

    @Override
    public void registrarMonitoreo(String nombre, String fechaHora, double energiaGenerada, int incidencias,
            double velocidadViento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarMonitoreo'");
    }

    @Override
    public void registrarMonitoreo(String nombre, String fechaHora, double energiaGenerada, int incidencias,
            double co2Emitido, double combustibleUtilizado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarMonitoreo'");
    }

    @Override
    public double totalGenerado(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'totalGenerado'");
    }

    @Override
    public int[] incidenciasPorHora(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incidenciasPorHora'");
    }

    @Override
    public int[] histogramaCumplimiento(String nombre, String fechaDesde, String fechaHasta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'histogramaCumplimiento'");
    }

    @Override
    public Map<String, Integer> plantasRenovablesPorFuente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'plantasRenovablesPorFuente'");
    }

    @Override
    public List<String> plantasQueNuncaCumplieronCuota() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'plantasQueNuncaCumplieronCuota'");
    }

    @Override
    public String horasSinVelocidadMinimaPorPlantaEolica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'horasSinVelocidadMinimaPorPlantaEolica'");
    }

    @Override
    public int limpiarMonitoreosSinDatos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'limpiarMonitoreosSinDatos'");
    }

    @Override
    public List<String> plantasOrdenadasPorEnergiaGenerada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'plantasOrdenadasPorEnergiaGenerada'");
    }

    @Override
    public List<String> plantasInactivasEn(String fechaHora) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'plantasInactivasEn'");
    }


    public String toString() {
        return "SmartGrids [plantas=" + plantas + "]";
    }
}
