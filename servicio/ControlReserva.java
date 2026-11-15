package servicio;
import modelo.*;
import repositorio.*;
import java.time.*;
public class ControlReserva {
    private final RepositorioArchivos repositorio;
    private final PoliticaCancelacion politica;
    public ControlReserva(RepositorioArchivos r,PoliticaCancelacion p){
        repositorio=Validacion.requerido(r,"repositorio");
        politica=Validacion.requerido(p,"política");
    }
    public Reserva crearReserva(Reserva r){
        Validacion.requerido(r,"reserva");
        repositorio.guardar(r.getNumero(),r);
        return r;
    }
    public double cancelarReserva(Reserva r,LocalDate hoy){
        if(!politica.permiteCancelacion(r,hoy))throw new IllegalStateException("Cancelación no permitida");
        double importe=politica.calcularReembolso(r,hoy);
        r.cancelar();
        repositorio.guardar(r.getNumero(),r);
        return importe;
    }
    public void asignarRecursos(Salida s,Empleado guia,Vehiculo v){
        s.asignarGuia(guia);
        s.asignarVehiculo(v);
    }
}

