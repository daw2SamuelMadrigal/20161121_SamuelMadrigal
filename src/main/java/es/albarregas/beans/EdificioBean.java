package es.albarregas.beans;

public class EdificioBean {
    
    private double tipo;
    private double habitaciones;
    private int fecha;
    private String construccion;
    private double valor;

    public double getTipo() {
        return tipo;
    }

    public void setTipo(double tipo) {
        this.tipo = tipo;
    }

    public double getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(double habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getConstruccion() {
        return construccion;
    }

    public void setConstruccion(String construccion) {
        this.construccion = construccion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
