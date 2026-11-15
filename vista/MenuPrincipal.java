package vista;
import controlador.*;import modelo.*;import repositorio.*;import servicio.*;import estrategia.*;import java.nio.file.*;import java.time.*;import java.util.*;
public class MenuPrincipal {
    public static void main(String[] args){
        var repo=new RepositorioArchivos(Path.of("datos"));
        var controller=new AgenciaController(new ControlReserva(repo,new PoliticaCancelacion()),new Tarifador(new PrecioBase()));
        try(var sc=new Scanner(System.in)){
            System.out.println("Rumbo Sur — sistema de reservas");
            System.out.println("1. Demostrar cálculo de tarifa   0. Salir");
            if(sc.hasNextInt()&&sc.nextInt()==1){
                Tour t=new TourUrbano("DEMO","Paseo urbano","Recorrido de muestra",3,20,12000);
                Salida s=new Salida(LocalDate.now().plusDays(10),LocalTime.of(9,0),3,20);
                t.programarSalida(s);
                Cliente c=new Cliente("00000000","Cliente Demo","0000","demo@ejemplo.com");
                Reserva r=new Reserva("DEMO1",LocalDate.now(),c,s);controller.crearReserva(r,2);
                System.out.println("Total de ejemplo: "+r.getTotal());
            }
        }
    }
}
