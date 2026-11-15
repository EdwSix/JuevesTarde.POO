package modelo;
import java.io.Serializable;import java.util.*;
public abstract class Tour implements Serializable {
 private final String codigo,nombre,descripcion;
 private final int duracion,cupo;
 private final List<Actividad> actividades=new ArrayList<>();
 private final List<Salida> salidas=new ArrayList<>();
 private double precio;
 protected Tour(String codigo,String nombre,String descripcion,int duracion,int cupo,double precio){
  this.codigo=Validacion.texto(codigo,"código");
  this.nombre=Validacion.texto(nombre,"nombre");
  this.descripcion=Validacion.texto(descripcion,"descripción");
  this.duracion=Validacion.positivo(duracion,"duración");
  this.cupo=Validacion.positivo(cupo,"cupo");
  this.precio=Validacion.noNegativo(precio,"precio");
 }
 public List<String> obtenerRequisitos(){
  return actividades.stream().map(Actividad::obtenerRequisitos).flatMap(List::stream).distinct().toList();
 }
 public double obtenerPrecio(){
  return precio;
 }
 public void cambiarPrecio(double p){
  precio=Validacion.noNegativo(p,"precio");
 }
 public void incluirActividad(Actividad a){
  actividades.add(Validacion.requerido(a,"actividad"));
 }
 public void programarSalida(Salida s){
  s.asignarTour(this);
  salidas.add(s);
 }
 public String getCodigo(){
  return codigo;
 }
 public String getNombre(){
  return nombre;
 }
 public String getDescripcion(){
  return descripcion;
 }
 public int getDuracion(){
  return duracion;
 }
 public int getCupo(){
  return cupo;
 }
 public List<Actividad> getActividades(){
  return List.copyOf(actividades);
 }
 public List<Salida> getSalidas(){
  return List.copyOf(salidas);
 }
}
