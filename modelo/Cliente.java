package modelo;
import java.io.Serializable;
import java.util.*;
public class Cliente implements Serializable {
    private final String documento,nombre,telefono,email;
    private final List<Reserva> reservas=new ArrayList<>();
    public Cliente(String documento,String nombre,String telefono,String email){
        this.documento=Validacion.texto(documento,"documento");
        this.nombre=Validacion.texto(nombre,"nombre");
        this.telefono=Validacion.texto(telefono,"teléfono");
        this.email=Validacion.texto(email,"email");
    }
    public void agregarReserva(Reserva r){
        reservas.add(Validacion.requerido(r,"reserva"));
    }
    public List<Reserva> getReservas(){
        return List.copyOf(reservas);
    }
    public String getDocumento(){
        return documento;
    }
    public String getNombre(){return nombre;
    }
    public String getTelefono(){return telefono;
    }
    public String getEmail(){return email;
    }
}
