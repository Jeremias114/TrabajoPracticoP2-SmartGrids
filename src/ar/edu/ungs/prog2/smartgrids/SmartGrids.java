package ar.edu.ungs.prog2.smartgrids;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.time.format.DateTimeParseException;
import java.time.LocalDateTime;

/**
 * SmartGrids
 */
public class SmartGrids implements ISmartGrids {

    private HashMap<String, Planta> plantas;

    public SmartGrids() {
        this.plantas = new HashMap<>();
    }

    public boolean validarFechaHora(String fechaHora) {
        try {
            java.time.LocalDateTime.parse(fechaHora);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }


    @Override
    public void registrarPlantaSolar(String nombre, String direccion, double capacidadMaxima,
            String fechaHoraPuestaEnFuncionamiento, String fuentePrimaria, double eficienciaPromedio,
            double superficieCubierta, int cantidadPaneles, double horasRadiacionDiaria) {
        
        if(nombre == null || direccion == null || capacidadMaxima <= 0 || fechaHoraPuestaEnFuncionamiento == null || !validarFechaHora(fechaHoraPuestaEnFuncionamiento) || fuentePrimaria == null || eficienciaPromedio <= 0 || superficieCubierta <= 0 || cantidadPaneles <= 0 || horasRadiacionDiaria <= 0){
            throw new IllegalArgumentException ("Error: Datos inválidos para registrar la planta solar.");
        }

        LocalDateTime fechaHoraPuestaEnFuncionamientoConvertida = LocalDateTime.parse(fechaHoraPuestaEnFuncionamiento); // convierte el string a LocalDateTime

        Solar plantaSolar = new Solar(nombre, direccion, capacidadMaxima, fechaHoraPuestaEnFuncionamientoConvertida, fuentePrimaria, eficienciaPromedio, superficieCubierta, cantidadPaneles, horasRadiacionDiaria);

        plantas.put(plantaSolar.getID(), plantaSolar);

    }
    @Override
    public void registrarPlantaEolica(String nombre, String direccion, double capacidadMaxima,
            String fechaHoraPuestaEnFuncionamiento, String fuentePrimaria, double eficienciaPromedio,
            int cantidadAerogeneradores, double alturaTorres, double velocidadMinimaViento) {
        
        if(nombre == null || direccion == null || capacidadMaxima <= 0 || fechaHoraPuestaEnFuncionamiento == null || !validarFechaHora(fechaHoraPuestaEnFuncionamiento) || fuentePrimaria == null || eficienciaPromedio <= 0 || cantidadAerogeneradores <= 0 || alturaTorres <= 0 || velocidadMinimaViento <= 0){
            throw new IllegalArgumentException ("Error: Datos inválidos para registrar la planta eólica.");
        }

        LocalDateTime fechaHoraPuestaEnFuncionamientoConvertida = LocalDateTime.parse(fechaHoraPuestaEnFuncionamiento); // convierte el string a LocalDateTime

        Eolica plantaEolica = new Eolica(nombre, direccion, capacidadMaxima, fechaHoraPuestaEnFuncionamientoConvertida, fuentePrimaria, eficienciaPromedio, cantidadAerogeneradores, alturaTorres, velocidadMinimaViento);

        plantas.put(plantaEolica.getID(), plantaEolica);
    }

    @Override
    public void registrarPlantaHidraulica(String nombre, String direccion, double capacidadMaxima,
            String fechaHoraPuestaEnFuncionamiento, String fuentePrimaria, double eficienciaPromedio,
            int cantidadTurbinas, double capacidadEmbalse) {
        
        if(nombre == null || direccion == null || capacidadMaxima <= 0 || fechaHoraPuestaEnFuncionamiento == null || !validarFechaHora(fechaHoraPuestaEnFuncionamiento) || fuentePrimaria == null || eficienciaPromedio <= 0 || cantidadTurbinas <= 0 || capacidadEmbalse <= 0){
            throw new IllegalArgumentException ("Error: Datos inválidos para registrar la planta hidráulica.");
        }

        LocalDateTime fechaHoraPuestaEnFuncionamientoConvertida = LocalDateTime.parse(fechaHoraPuestaEnFuncionamiento); // convierte el string a LocalDateTime

        Hidraulica plantaHidraulica = new Hidraulica(nombre, direccion, capacidadMaxima, fechaHoraPuestaEnFuncionamientoConvertida, fuentePrimaria, eficienciaPromedio, cantidadTurbinas, capacidadEmbalse);

        plantas.put(plantaHidraulica.getID(), plantaHidraulica);
    }

    @Override
    public void registrarPlantaTermica(String nombre, String direccion, double capacidadMaxima,
            String fechaHoraPuestaEnFuncionamiento, String tipoCombustible, double objetivoEmisionesCo2PorHora,
            double capacidadAlmacenamientoCombustible) {
        
        if(nombre == null || direccion == null || capacidadMaxima <= 0 || fechaHoraPuestaEnFuncionamiento == null || !validarFechaHora(fechaHoraPuestaEnFuncionamiento) || tipoCombustible == null || objetivoEmisionesCo2PorHora <= 0 || capacidadAlmacenamientoCombustible <= 0){
            throw new IllegalArgumentException ("Error: Datos inválidos para registrar la planta térmica.");
        }

        LocalDateTime fechaHoraPuestaEnFuncionamientoConvertida = LocalDateTime.parse(fechaHoraPuestaEnFuncionamiento); // convierte el string a LocalDateTime

        Termica plantaTermica = new Termica(nombre, direccion, capacidadMaxima, fechaHoraPuestaEnFuncionamientoConvertida, tipoCombustible, objetivoEmisionesCo2PorHora, capacidadAlmacenamientoCombustible);

        plantas.put(plantaTermica.getID(), plantaTermica);
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
