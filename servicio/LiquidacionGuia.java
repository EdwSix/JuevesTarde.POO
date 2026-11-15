package servicio;
import modelo.*;
public class LiquidacionGuia {
    private final double sueldo;
    private final int dias;
    private final double ventasAdicionales;
    public LiquidacionGuia(double sueldo,int dias,double ventasAdicionales){
        this.sueldo=Validacion.noNegativo(sueldo,"sueldo");
        if(dias<0)throw new IllegalArgumentException("días no puede ser negativo");
        this.dias=dias;
        this.ventasAdicionales=Validacion.noNegativo(ventasAdicionales,"ventas adicionales");
    }
    public double calcular(){
        return sueldo*dias+ventasAdicionales;
    }
}
