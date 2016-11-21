package es.albarregas.util;

import es.albarregas.beans.ContenidoBean;
import es.albarregas.beans.EdificioBean;

public class CalcularCuota {
    
    private double cuota;

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
    
    
    
    public double calcular(EdificioBean edificio){
        Double cuotaBasica;
        Double prima;
        
        cuotaBasica=edificio.getValor()*0.005;
        prima=cuotaBasica*edificio.getTipo();
        prima+=(prima/100)*edificio.getHabitaciones();
        int fecha=edificio.getFecha();
        switch(fecha){
            case 1949:prima+=prima*0.09;
            break;
            case 1950:prima+=prima*0.06;
            break;
            case 1991:prima+=prima*0.04;
            break;
            case 2006:prima+=prima*0.02;
            break;
            case 2016:prima+=prima*0.01;
        }
        if("madera".equals(edificio.getConstruccion())){
            prima+=prima*0.1;
        }
            
        cuota=prima;
        return cuota;
    }
    
    public double calcularContenido(ContenidoBean contenido){
        Double prima;
        
        prima=contenido.getCantidad()*0.008;
        String danos=contenido.getDanos();
        if(danos.equals("si")){
            prima=prima * 1.25;
        }
        int franquicia=contenido.getFranquicia();
        switch(franquicia){
            case 500:prima-=prima*0.1;
            break;
            case 1000:prima-=prima*0.2;
        }
        
        cuota=prima;
        return cuota;
    }
}
