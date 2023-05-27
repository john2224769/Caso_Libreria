package modelo;

public class Libreria
{


    protected String nombreLibro, autor, tipoEdicion;
    protected int anioEdicion;

    public Libreria() {
    }

    public Libreria(String nombreLibro, String autor, String tipoEdicion, int anioEdicion) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.tipoEdicion = tipoEdicion;
        this.anioEdicion = anioEdicion;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public String getTipoEdicion() {
        return tipoEdicion;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    
}