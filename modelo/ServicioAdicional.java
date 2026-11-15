package modelo;
import java.io.Serializable;
public class ServicioAdicional implements Serializable {
    private final String nombre;
    private final double precio;
    private final boolean obligatorio;
    public ServicioAdicional(String nombre,double precio,boolean obligatorio){
        this.nombre=Validacion.texto(nombre,"nombre");
        this.precio=Validacion.noNegativo(precio,"precio");
        this.obligatorio=obligatorio;
    }
    public double calcularImporte(){
        return precio;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public boolean isObligatorio(){
        return obligatorio;
    }
}
