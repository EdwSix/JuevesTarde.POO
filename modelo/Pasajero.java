package modelo;
import java.io.Serializable;
import java.util.*;
public class Pasajero implements Serializable {
    private final String documento,nombre,telefono,email,restricciones;
    private final int edad;
    private final List<ServicioAdicional> servicios=new ArrayList<>();
    public Pasajero(String documento,String nombre,String telefono,String email,String restricciones,int edad){
        this.documento=Validacion.texto(documento,"documento");
        this.nombre=Validacion.texto(nombre,"nombre");
        this.telefono=Validacion.texto(telefono,"teléfono");
        this.email=Validacion.texto(email,"email");
        this.restricciones=restricciones==null?"":restricciones;
        this.edad=Validacion.positivo(edad,"edad");
    }
    public boolean cumpleRequisitos(List<String> req){
        return req.stream().noneMatch(x->!restricciones.isBlank()&&restricciones.toLowerCase().contains(x.toLowerCase()));
    }
    public void solicitar(ServicioAdicional s){
        servicios.add(Validacion.requerido(s,"servicio"));
    }
    public List<ServicioAdicional> getServicios(){
        return List.copyOf(servicios);
    }
    public String getDocumento(){
        return documento;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getEmail(){
        return email;
    }
    public String getRestricciones(){
        return restricciones;
    }
    public int getEdad(){
        return edad;
    }
}
