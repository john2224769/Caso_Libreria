package modelo;

import java.util.ArrayList;

public class Libreria
{
    protected String nombreLibro, autor, tipoEdicion, ficha;
    protected int anioEdicion;
    protected ArrayList resultado=null;

    public Libreria(String nLibro, String nAutor, String tEdicion, int aEdicion)
    {
        this.nombreLibro = nLibro;
        this.autor = nAutor;
        this.tipoEdicion = tEdicion;
        this.anioEdicion = aEdicion;
    }

    public String mostrarResultado ()
    {
        return this.ficha;
    }

}