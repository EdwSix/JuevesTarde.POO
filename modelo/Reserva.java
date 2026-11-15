package modelo;
import java.io.Serializable;
import java.time.*;
import java.util.*;
public class Reserva implements Serializable {
  private final String numero;
  private final LocalDate fecha;
  private String estado="ACTIVA";
  private final Cliente cliente;
  private final Salida salida;
  private final List<Pasajero> pasajeros=new ArrayList<>();
  private final List<Pago> pagos=new ArrayList<>();
  private final List<ServicioAdicional> servicios=new ArrayList<>();
  private double total;
  public Reserva(String numero,LocalDate fecha,Cliente cliente,Salida salida){
    this.numero=Validacion.texto(numero,"número");
    this.fecha=Validacion.requerido(fecha,"fecha");
    this.cliente=Validacion.requerido(cliente,"cliente");
    this.salida=Validacion.requerido(salida,"salida");
    cliente.agregarReserva(this);
  }
  public void agregarPasajero(Pasajero p){
    if(estado.equals("CANCELADA"))throw new IllegalStateException("Reserva cancelada");
    if(pasajeros.size()>=salida.getCapacidad())throw new IllegalStateException("Cupo agotado");
    if(salida.getTour()!=null&&!p.cumpleRequisitos(salida.getTour().obtenerRequisitos()))throw new IllegalArgumentException("El pasajero no cumple los requisitos");
    pasajeros.add(Validacion.requerido(p,"pasajero"));
  }
  public void agregarPago(Pago p){
    pagos.add(Validacion.requerido(p,"pago"));
  }
  public void agregarServicio(ServicioAdicional s){
    servicios.add(Validacion.requerido(s,"servicio"));
  }
  public double calcularSaldo(){
    return Math.max(0,total-pagos.stream().mapToDouble(Pago::getImporte).sum());
  }
  public void setTotal(double t){
    total=Validacion.noNegativo(t,"total");
  }
  public void cancelar(){
    estado="CANCELADA";
  }
  public void reactivar(){
    if(!estado.equals("CANCELADA"))throw new IllegalStateException("Solo se reactiva una reserva cancelada");
    estado="ACTIVA";
  }
  public String getNumero(){
    return numero;
  }
  public LocalDate getFecha(){
    return fecha;
  }
  public String getEstado(){
    return estado;
  }
  public Cliente getCliente(){
    return cliente;
  }
  public Salida getSalida(){
    return salida;
  }
  public List<Pasajero> getPasajeros(){
    return List.copyOf(pasajeros);
  }
  public List<Pago> getPagos(){
    return List.copyOf(pagos);
  }
  public List<ServicioAdicional> getServicios(){
    return List.copyOf(servicios);
  }
  public double getTotal(){
    return total;
  }
}
