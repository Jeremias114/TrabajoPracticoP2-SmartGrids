package ar.edu.ungs.prog2.smartgrids;

import java.time.LocalDateTime;

public class Eolica extends PlantaRenovable {
    private int cantAerogeneradores;
    private double alturaTorres;
    private double velocidadMinViento;

    public Eolica(String nombre, String direccion, double capMaxima, LocalDateTime fechaHoraFuncionamiento, String fuentePrimaria, double eficienciaPromedio, int cantAerogeneradores, double alturaTorres, double velocidadMinViento) {
        super(nombre, direccion, capMaxima, fechaHoraFuncionamiento, fuentePrimaria, eficienciaPromedio);
        this.cantAerogeneradores = cantAerogeneradores;
        this.alturaTorres = alturaTorres;
        this.velocidadMinViento = velocidadMinViento;
    }
    
    @Override
    public boolean nuncaCumplioCuota() {
        return super.nuncaCumplioCuota();
    }

    @Override
    public boolean cumpleCuota(Registro registro) {
        return registro.getEnergiaGenerada() >= capacidadMinimaCuota();
    }

    public int getCantAerogeneradores() {
        return cantAerogeneradores;
    }

    public double getAlturaTorres() {
        return alturaTorres;
    }

    public double getVelocidadMinViento() {
        return velocidadMinViento;
    }
    
    public String toString() {
        return  "Eolica:" + super.toString() +", Cantidad De Aerogeneradores: " + cantAerogeneradores + ", alturaTorres: " + alturaTorres
                + ", velocidadMinViento: " + velocidadMinViento + "]";
    }

}
