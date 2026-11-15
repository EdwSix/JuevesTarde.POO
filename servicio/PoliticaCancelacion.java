package servicio;
import modelo.*;
import java.time.*;
public class PoliticaCancelacion {
    public double calcularReembolso(Reserva r,LocalDate hoy){
        Validacion.requerido(r,"reserva");
        long dias=Duration.between(hoy.atStartOfDay(),r.getSalida().getDia().atStartOfDay()).toDays();
        return dias>=7?r.getTotal():0;
    }
    public boolean permiteCancelacion(Reserva r,LocalDate hoy){
        return r!=null&&r.getEstado().equals("ACTIVA")&&!hoy.isAfter(r.getSalida().getDia());
    }
}
