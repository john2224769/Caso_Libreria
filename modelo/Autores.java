package modelo;

public class Autores extends Libreria
{
    protected int numeroAutores;

    public Autores(String nombreLibro, String autor, String tipoEdicion, int anioEdicion, int numeroAutores) {
        super(nombreLibro, autor, tipoEdicion, anioEdicion);
        this.numeroAutores = numeroAutores;
    }

    public int getNumeroAutores() {
        return numeroAutores;
    }

    public String mostrarAutores()
    {
        if (numeroAutores>1)
        {
            autor=autor+" y otros";
        }

        return autor;
    }

}