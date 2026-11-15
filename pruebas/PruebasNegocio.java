package pruebas;
import modelo.*;
import estrategia.*;
import servicio.*;
import repositorio.*;
import java.nio.file.*;
import java.time.*;
public class PruebasNegocio {
    private static void check(boolean b,String m){
        if(!b)throw new AssertionError(m);
    }
    public static void main(String[]x)throws Exception{
        Tour t=new TourCultural("T1","Museos","Visita",2,3,100);
        Salida s=new Salida(LocalDate.now().plusDays(10),LocalTime.NOON,2,3);
        t.programarSalida(s);
        Cliente c=new Cliente("1","Ana","123","a@b.c");
        Reserva r=new Reserva("R1",LocalDate.now(),c,s);
        r.agregarPasajero(new Pasajero("2","Beto","123","b@b.c","",30));
        r.setTotal(new Tarifador(new PrecioBase()).calcularPrecio(t,1));
        check(r.getTotal()==100,"tarifa");
        r.agregarPago(new Pago(LocalDate.now(),30,"efectivo"));
        check(r.calcularSaldo()==70,"saldo");
        var dir=Files.createTempDirectory("rumbo");
        var repo=new RepositorioArchivos(dir);
        var control=new ControlReserva(repo,new PoliticaCancelacion());
        control.crearReserva(r);
        check(repo.buscar("R1",Reserva.class)!=null,"persistencia");
        check(control.cancelarReserva(r,LocalDate.now())==100,"reembolso anticipado");
        boolean rechazado=false;
        try{
            new TourUrbano("x","n","d",0,2,0);
        }
        catch(IllegalArgumentException e){
            rechazado=true;
        }
        check(rechazado,"validación");
        System.out.println("Pruebas de negocio: OK");
    }
}
