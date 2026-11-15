package modelo;
import java.util.Objects;
public final class Validacion {
 private Validacion(){}
 public static String texto(String v,String n){
  if(v==null||v.isBlank())throw new IllegalArgumentException(n+" es obligatorio");
  return v.trim();
 }
 public static int positivo(int v,String n){
  if(v<=0)throw new IllegalArgumentException(n+" debe ser positivo");
  return v;
 }
 public static double noNegativo(double v,String n){
  if(!Double.isFinite(v)||v<0)throw new IllegalArgumentException(n+" no puede ser negativo");
  return v;
 }
 public static <T>T requerido(T v,String n){
  return Objects.requireNonNull(v,n+" es obligatorio");
 }
}
