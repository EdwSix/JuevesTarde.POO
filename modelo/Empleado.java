package modelo;
import java.io.Serializable;
public abstract class Empleado implements Serializable {
    private final String legajo,nombre,documento,telefono;
    public Empleado(String l,String n,String d,String t){
        legajo=Validacion.texto(l,"legajo");
        nombre=Validacion.texto(n,"nombre");
        documento=Validacion.texto(d,"documento");
        telefono=Validacion.texto(t,"teléfono");
    }
    public String getLegajo(){return legajo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDocumento(){
        return documento;
    }
    public String getTelefono(){
        return telefono;
    }
}
