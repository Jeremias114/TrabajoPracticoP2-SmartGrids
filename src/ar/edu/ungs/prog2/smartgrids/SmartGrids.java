package ar.edu.ungs.prog2.smartgrids;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.time.format.DateTimeParseException;
import java.time.LocalDateTime;

/**
 * SmartGrids
 */
public class SmartGrids implements ISmartGrids {

    private HashMap<String, Planta> plantas;

    public SmartGrids() {
        this.plantas = new LinkedHashMap<>();
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
            throw new RuntimeException ("Error: Datos inválidos para registrar la planta solar.");
        }

        for(Planta planta : plantas.values()){
            if(planta.getNombre().equals(nombre)){
                throw new RuntimeException("Error: Ya existe una planta Solar con el nombre " + nombre);
            }
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
            throw new RuntimeException ("Error: Datos inválidos para registrar la planta eólica.");
        }

        for(Planta planta : plantas.values()){
            if(planta.getNombre().equals(nombre)){
                throw new RuntimeException("Error: Ya existe una planta Eolica con el nombre " + nombre);
            }
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
            throw new RuntimeException ("Error: Datos inválidos para registrar la planta hidráulica.");
        }

        for(Planta planta : plantas.values()){
            if(planta.getNombre().equals(nombre)){
                throw new RuntimeException("Error: Ya existe una planta hidraulica con el nombre " + nombre);
            }
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
            throw new RuntimeException ("Error: Datos inválidos para registrar la planta térmica.");
        }

        for(Planta planta : plantas.values()){
            if(planta.getNombre().equals(nombre)){
                throw new RuntimeException("Error: Ya existe una planta Termica con el nombre " + nombre);
            }
        }

        LocalDateTime fechaHoraPuestaEnFuncionamientoConvertida = LocalDateTime.parse(fechaHoraPuestaEnFuncionamiento); // convierte el string a LocalDateTime

        Termica plantaTermica = new Termica(nombre, direccion, capacidadMaxima, fechaHoraPuestaEnFuncionamientoConvertida, tipoCombustible, objetivoEmisionesCo2PorHora, capacidadAlmacenamientoCombustible);

        plantas.put(plantaTermica.getID(), plantaTermica);
    }

    @Override
    public List<String> consultarPlantas() {
        ArrayList<String> listaPlantas = new ArrayList<>();

        for(Planta planta : plantas.values()){
            String estado = planta.getEstado() ? "ACTIVA" : "INACTIVA";
            String infoPlanta = planta.getNombre() + " (" + estado + "): "  + planta.getFechaHoraFuncionamiento();

            listaPlantas.add(infoPlanta);
        }
        return listaPlantas;
    }

    @Override
    public double capacidadMinimaCuota(String nombre) {
    	for(Planta planta : plantas.values()) {
        	if(planta.getNombre().equals(nombre)) {
        		return planta.capacidadMinimaCuota();
        	}
        }
        
        throw new RuntimeException("No existe planta con ese nombre " + nombre);
    }

    @Override
    public void activarPlanta(String nombre, String fechaHora) {
    	for(Planta planta : plantas.values()) {
    		if(planta.getNombre().equals(nombre)) {
    			if(!validarFechaHora(fechaHora)) {
    				throw new RuntimeException("Fecha y hora invalidas");
    			}
    			
    			planta.actualizarEstado(true);
    			return;
    		}
    	}
    	
    	throw new RuntimeException("No existe planta con ese nombre: " + nombre);
    }

    @Override
    public void desactivarPlanta(String nombre, String fechaHora) {
        for(Planta planta : plantas.values()) {
        	if(planta.getNombre().equals(nombre)) {
        		if(!validarFechaHora(fechaHora)) {
        			throw new RuntimeException("Fecha y hora invalidas");
        		}
        		
        		planta.actualizarEstado(false);
        		return;
        	}
        }
        
        throw new RuntimeException("No existe planta con ese nombre: " + nombre);
    }

    @Override
    public boolean estaActiva(String nombre) {
        for(Planta planta : plantas.values()) {
        	if(planta.getNombre().equals(nombre)) {
        		return planta.getEstado();
        	}
        }
        
        throw new RuntimeException("No existe planta con ese nombre: " + nombre);
    }

    @Override
    public void registrarMonitoreo(String nombre, String fechaHora, double energiaGenerada, int incidencias) {
        if(!validarFechaHora(fechaHora)) {
        	throw new RuntimeException("Fecha y hora inválidas");
        }

        if(energiaGenerada < 0 || incidencias < 0) {
        	throw new RuntimeException("Energia generada o incidencias negativas");
        }
        
        for(Planta planta : plantas.values()){
        	if(planta.getNombre().equals(nombre)) {
        		if(!planta.getEstado()) {
        			throw new RuntimeException("No se puede registrar un monitoreo, la planta esta inactiva");
        		}

                if(LocalDateTime.parse(planta.getFechaHoraFuncionamiento()).isAfter(LocalDateTime.parse(fechaHora))) {
                    throw new RuntimeException("No se puede registrar un monitoreo, la fecha y hora es anterior a la puesta en funcionamiento de la planta");
                }

                for(Registro registro : planta.getRegistros()) {
                    if(registro.getFechaYhora().equals(LocalDateTime.parse(fechaHora))) {
                        throw new RuntimeException("No se puede registrar un monitoreo, ya existe un registro para esa fecha y hora");
                    }
                }


        	
        	
        	LocalDateTime fecha = LocalDateTime.parse(fechaHora);
        	
        	Registro registro = new Registro(fecha,energiaGenerada,incidencias,planta.getID());
        	planta.agregarRegistro(registro);
        	return;
        	}
        }
        
        throw new RuntimeException("No existe planta con ese nombre: " + nombre);
    }

    @Override
    public void registrarMonitoreo(String nombre, String fechaHora, double energiaGenerada, int incidencias,
            double velocidadViento) {
        if(!validarFechaHora(fechaHora)) {
        	throw new RuntimeException("Fecha y hora inválidas");
        }

        if(energiaGenerada < 0 || incidencias < 0 || velocidadViento < 0) {
        	throw new RuntimeException("Energia generada, incidencias o velocidad del viento negativas");
        }

        for(Planta planta : plantas.values()){
            	if(planta.getNombre().equals(nombre)) {
            		if(!planta.getEstado()) {
            			throw new RuntimeException("No se puede registrar un monitoreo, la planta esta inactiva");
            		}
    
                    if(LocalDateTime.parse(planta.getFechaHoraFuncionamiento()).isAfter(LocalDateTime.parse(fechaHora))) {
                        throw new RuntimeException("No se puede registrar un monitoreo, la fecha y hora es anterior a la puesta en funcionamiento de la planta");
                    }
    
                    for(Registro registro : planta.getRegistros()) {
                        if(registro.getFechaYhora().equals(LocalDateTime.parse(fechaHora))) {
                            throw new RuntimeException("No se puede registrar un monitoreo, ya existe un registro para esa fecha y hora");
                        }
                    }
    
                    if(!(planta instanceof Eolica)) {
                        throw new RuntimeException("No se puede registrar un monitoreo con velocidad del viento, la planta no es eólica");
                    }
            	
            	LocalDateTime fecha = LocalDateTime.parse(fechaHora);
            	
            	RegistroEolicas registroEolica = new RegistroEolicas(fecha,energiaGenerada,incidencias,planta.getID(),velocidadViento);
            	planta.agregarRegistro(registroEolica);
            	return;
            	}
        }
    }

    @Override
    public void registrarMonitoreo(String nombre, String fechaHora, double energiaGenerada, int incidencias,
            double co2Emitido, double combustibleUtilizado) {
        if(!validarFechaHora(fechaHora)) {
        	throw new RuntimeException("Fecha y hora inválidas");
        }

        if(energiaGenerada < 0 || incidencias < 0 || co2Emitido < 0 || combustibleUtilizado < 0) {
        	throw new RuntimeException("Energia generada, incidencias, co2 emitido o combustible utilizado negativas");
        }

        for(Planta planta : plantas.values()){
        	if(planta.getNombre().equals(nombre)) {
        		if(!planta.getEstado()) {
        			throw new RuntimeException("No se puede registrar un monitoreo, la planta esta inactiva");
        		}

                if(LocalDateTime.parse(planta.getFechaHoraFuncionamiento()).isAfter(LocalDateTime.parse(fechaHora))) {
                    throw new RuntimeException("No se puede registrar un monitoreo, la fecha y hora es anterior a la puesta en funcionamiento de la planta");
                }

                for(Registro registro : planta.getRegistros()) {
                    if(registro.getFechaYhora().equals(LocalDateTime.parse(fechaHora))) {
                        throw new RuntimeException("No se puede registrar un monitoreo, ya existe un registro para esa fecha y hora");
                    }
                }

                if(!(planta instanceof Termica)) {
                    throw new RuntimeException("No se puede registrar un monitoreo con co2 emitido y combustible utilizado, la planta no es térmica");
                }
        	
        	
        	LocalDateTime fecha = LocalDateTime.parse(fechaHora);
        	
        	RegistroTermicas registroTermica = new RegistroTermicas(fecha,energiaGenerada,incidencias,planta.getID(),co2Emitido,combustibleUtilizado);
        	planta.agregarRegistro(registroTermica);
        	return;
        	}
        }
    }

    @Override
    public double totalGenerado(String nombre) {
        for(Planta planta : plantas.values()) {
        	if(planta.getNombre().equals(nombre)) {
        		return planta.totalGenerado();
        	}
        }
        
        throw new RuntimeException("No existe planta con ese nombre: " + nombre);
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
