package controlador;
import modelo.*;
import servicio.*;
import estrategia.*;
import java.time.*;
public class AgenciaController {
    private final ControlReserva control;
    private final Tarifador tarifador;
    public AgenciaController(ControlReserva c,Tarifador t){
        control=Validacion.requerido(c,"control");
        tarifador=Validacion.requerido(t,"tarifador");
    }
    public Reserva crearReserva(Reserva r,int pasajeros){
        r.setTotal(tarifador.calcularPrecio(r.getSalida().getTour(),pasajeros));
        return control.crearReserva(r);
    }
    public double cancelar(Reserva r,LocalDate hoy){
        return control.cancelarReserva(r,hoy);
    }
    public void asignar(Salida s,Empleado guia,Vehiculo v){
        control.asignarRecursos(s,guia,v);
    }
}
