package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Planta
 */
public abstract class Planta {
    private String nombre;
    private String direccion;
    private double capMaxima;
    private boolean estado;
    private LocalDateTime fechaHoraFuncionamiento;
    private String ID;
    private ArrayList<Registro> registros;

    public Planta(String nombre, String direccion, double capMaxima, LocalDateTime fechaHoraFuncionamiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capMaxima = capMaxima;
        this.fechaHoraFuncionamiento = fechaHoraFuncionamiento;
        this.estado = true;
        this.ID = UUID.randomUUID().toString();
        this.registros = new ArrayList<>();
    }



    public void actualizarEstado(boolean estado) {
        this.estado = estado;
    }

    public void agregarRegistro(Registro registro) {
    	if(!this.estado) {
    		throw new IllegalStateException("No se puede registrar un monitoreo en una planta inactiva");
    	}
    	
        this.registros.add(registro);
    }

    public double totalGenerado(){
        double total = 0;
        for (Registro registro : registros) {
            total += registro.getEnergiaGenerada();
        }
        return total;
    }

    public abstract boolean nuncaCumplioCuota(); //metodo abstracto que será implementado en las subclases
    
    public abstract boolean cumpleCuota(Registro registro); //metodo abstracto que será implementado en las subclases

    public String getID() {
        return this.ID;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public ArrayList<Registro> getRegistros() {
        return this.registros;
    }

    public String getFechaHoraFuncionamiento() {

        DateTimeFormatter formatoEstricto = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        return this.fechaHoraFuncionamiento.format(formatoEstricto);
    }

    public double getCapMaxima() {
        return this.capMaxima;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }


    public String toString() {
        return "Planta [nombre=" + nombre + ", direccion=" + direccion + ", capMaxima=" + capMaxima + ", estado="
                + estado + ", fechaFuncionamiento=" + fechaHoraFuncionamiento + ", ID=" + ID + "]";
    }
    
    public abstract double capacidadMinimaCuota();
}
