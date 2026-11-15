package modelo;
public final class Conductor extends Empleado {
    private final String licencia;
    private final int capacidad;
    public Conductor(String l,String n,String d,String t,String licencia,int capacidad){
        super(l,n,d,t);
        this.licencia=Validacion.texto(licencia,"licencia");
        this.capacidad=Validacion.positivo(capacidad,"capacidad");
    }
    public String getLicencia(){
        return licencia;
    }
    public int getCapacidad(){
        return capacidad;
    }
}
