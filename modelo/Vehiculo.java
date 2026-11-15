package modelo;
import java.io.Serializable;
public class Vehiculo implements Serializable {
    private final String patente,tipo;
    private final int capacidad;
    public Vehiculo(String patente,int capacidad,String tipo){
        this.patente=Validacion.texto(patente,"patente");
        this.capacidad=Validacion.positivo(capacidad,"capacidad");
        this.tipo=Validacion.texto(tipo,"tipo");
    }
    public String getPatente(){
        return patente;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public String getTipo(){
        return tipo;
    }
}
