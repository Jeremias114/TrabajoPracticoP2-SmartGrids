package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDate;
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
    private LocalDate fechaFuncionamiento;
    private String ID;
    private ArrayList<Registro> registros;

    public Planta(String nombre, String direccion, double capMaxima, LocalDate fechaFuncionamiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capMaxima = capMaxima;
        this.fechaFuncionamiento = fechaFuncionamiento;
        this.estado = true;
        this.ID = UUID.randomUUID().toString();
        this.registros = new ArrayList<>();
    }



    public void actualizarEstado(boolean estado) {
        this.estado = estado;
    }

    public void agregarRegistro(Registro registro) {
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

    public LocalDate getFechaFuncionamiento() {
        return this.fechaFuncionamiento;
    }

    public double getCapMaxima() {
        return this.capMaxima;
    }

    public String toString() {
        return "Planta [nombre=" + nombre + ", direccion=" + direccion + ", capMaxima=" + capMaxima + ", estado="
                + estado + ", fechaFuncionamiento=" + fechaFuncionamiento + ", ID=" + ID + "]";
    }
}
