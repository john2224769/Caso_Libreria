package modelo;

public class Coleccion extends Libreria
{

    protected String nombreColeccion;
    protected int numeroLibro=1;

    public Coleccion(String nombreLibro, String autor, String tipoEdicion, int anioEdicion, String nombreColeccion,
            int numeroLibro) 
    {
        super(nombreLibro, autor, tipoEdicion, anioEdicion);
        this.nombreColeccion = nombreColeccion;
        this.numeroLibro = numeroLibro;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public int getNumeroLibro() {
        return numeroLibro;
    }

    

    
}