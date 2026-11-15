package repositorio;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class RepositorioArchivos {
    private final Path directorio;
    public RepositorioArchivos(Path d){
        directorio=Objects.requireNonNull(d);
    }
    public synchronized void guardar(String clave,Serializable objeto){
        try{
            Files.createDirectories(directorio);
            try(ObjectOutputStream out=new ObjectOutputStream(Files.newOutputStream(ruta(clave)))){
                out.writeObject(objeto);
            }
        }
        catch(IOException e){
            throw new IllegalStateException("No se pudo guardar",e);
        }
    }
    public synchronized <T>T buscar(String clave,Class<T> tipo){
        Path p=ruta(clave);
        if(!Files.exists(p))return null;
        try(ObjectInputStream in=new ObjectInputStream(Files.newInputStream(p))){
            return tipo.cast(in.readObject());
        }
        catch(IOException|ClassNotFoundException e){
            throw new IllegalStateException("No se pudo leer",e);
        }
    }
    private Path ruta(String clave){
        if(clave==null||!clave.matches("[A-Za-z0-9_-]+"))throw new IllegalArgumentException("Clave inválida");
        return directorio.resolve(clave+".dat");
    }
}
