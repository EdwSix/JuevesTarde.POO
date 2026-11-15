package estrategia;
import modelo.*;
public class PrecioBase implements EstrategiaPrecio {
    public double calcularPrecio(Tour t,int pasajeros){
        return t.obtenerPrecio()*pasajeros;
    }
}
