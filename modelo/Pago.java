package modelo;
import java.io.Serializable;
import java.time.*;
public class Pago implements Serializable {
    private final LocalDate fecha;
    private final double importe;
    private final String metodo;
    private String estado="REGISTRADO";
    public Pago(LocalDate fecha,double importe,String metodo){
        this.fecha=Validacion.requerido(fecha,"fecha");
        this.importe=Validacion.noNegativo(importe,"importe");
        this.metodo=Validacion.texto(metodo,"método");
    }
    public void registrarPago(){
        estado="REGISTRADO";
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public double getImporte(){
        return importe;
    }
    public String getMetodo(){
        return metodo;
    }
    public String getEstado(){
        return estado;
    }
}
