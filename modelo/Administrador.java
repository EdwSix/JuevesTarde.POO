package modelo;
import java.util.*;
public final class Administrador extends Empleado {
    private final Set<String> permisos;
    public Administrador(String l,String n,String d,String t,Set<String> permisos){
        super(l,n,d,t);this.permisos=permisos==null?Set.of():Set.copyOf(permisos);
    }
    public Set<String> getPermisos(){
        return permisos;
    }
}
