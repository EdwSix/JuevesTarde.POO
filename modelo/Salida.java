package modelo;
import java.io.Serializable;
import java.time.*;
public class Salida implements Serializable {
 private final LocalDate dia;
 private final LocalTime hora;
 private final int duracion,capacidad;
 private Tour tour;
 private Empleado guia;
 private Vehiculo vehiculo;
 private String estado="PROGRAMADA";
 public Salida(LocalDate dia,LocalTime hora,int duracion,int capacidad){
  this.dia=Validacion.requerido(dia,"día");
  this.hora=Validacion.requerido(hora,"hora");
  this.duracion=Validacion.positivo(duracion,"duración");
  this.capacidad=Validacion.positivo(capacidad,"capacidad");
 }
 public void asignarTour(Tour t){
  tour=Validacion.requerido(t,"tour");
 }
 public void asignarGuia(Empleado e){
  guia=Validacion.requerido(e,"guía");
 }
 public void asignarVehiculo(Vehiculo v){
  v=Validacion.requerido(v,"vehículo");
  if(capacidad>v.getCapacidad())throw new IllegalArgumentException("Vehículo insuficiente");
  vehiculo=v;
 }
 public void emitirLista(){}
 public void cambiarEstado(String e){
  estado=Validacion.texto(e,"estado").toUpperCase();
 }
 public LocalDate getDia(){
  return dia;
 }
 public LocalTime getHora(){
  return hora;
 }
 public int getDuracion(){
  return duracion;
 }
 public int getCapacidad(){
  return capacidad;
 }
 public Tour getTour(){
  return tour;
 }
 public Empleado getGuia(){
  return guia;
 }
 public Vehiculo getVehiculo(){
  return vehiculo;
 }
 public String getEstado(){
  return estado;
 }
}
