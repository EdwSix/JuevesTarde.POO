package estrategia;
import modelo.*;
public class Tarifador {
    private final EstrategiaPrecio estrategia;
    public Tarifador(EstrategiaPrecio e){
        estrategia=Validacion.requerido(e,"estrategia");
    }
    public double calcularPrecio(Tour t,int pasajeros){
        Validacion.requerido(t,"tour");
        Validacion.positivo(pasajeros,"pasajeros");
        double p=estrategia.calcularPrecio(t,pasajeros);
        return Validacion.noNegativo(p,"precio calculado");
    }
}
