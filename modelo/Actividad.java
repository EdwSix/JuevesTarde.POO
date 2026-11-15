package modelo;
import java.io.Serializable;
import java.util.*;
public class Actividad implements Serializable {
  private final String tema;
  private final int duracion;
  private final List<String> requisitos;
  public Actividad(String tema,int duracion,List<String> requisitos){
   this.tema=Validacion.texto(tema,"tema");
   this.duracion=Validacion.positivo(duracion,"duración");
   this.requisitos=requisitos==null?new ArrayList<>():new ArrayList<>(requisitos);
  }
  public List<String> obtenerRequisitos(){
   return List.copyOf(requisitos);
  }
  public String getTema(){
   return tema;
  }
  public int getDuracion(){
   return duracion;
  }
}
