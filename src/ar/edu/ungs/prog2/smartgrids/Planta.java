package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Planta
 */
public abstract class Planta {
    private String nombre;
    private String direccion;
    private double capMaxima;
    private boolean estado;
    private LocalDate fechaFuncionamiento;
    private int ID;
    private ArrayList<Registro> registros;

    public Planta(String nombre, String direccion, double capMaxima, LocalDate fechaFuncionamiento, int ID) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capMaxima = capMaxima;
        this.fechaFuncionamiento = fechaFuncionamiento;
        this.estado = true;
        this.ID = ID;
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

    public int getID() {
        return ID;
    }

    public boolean getEstado() {
        return estado;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public LocalDate getFechaFuncionamiento() {
        return fechaFuncionamiento;
    }

    public double getCapMaxima() {
        return capMaxima;
    }

    public String toString() {
        return "Planta [nombre=" + nombre + ", direccion=" + direccion + ", capMaxima=" + capMaxima + ", estado="
                + estado + ", fechaFuncionamiento=" + fechaFuncionamiento + ", ID=" + ID + "]";
    }
}
