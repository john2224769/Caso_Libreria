package ejecutable;

import javax.swing.JOptionPane;

import controlador.Controlador;
import modelo.Autores;
import modelo.Coleccion;
import modelo.Libreria;
import vista.VentanaPrincipal;

public class Test
{
    public static void main(String[] args) {

        /** String tipoEdicion="", nombreColeccion="";
        int numLibro=0;

        String nombreLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro: ");
        int anioEdicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de edicion del libro"));
        int autores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autores del libro")); 
        String nombreAutor = JOptionPane.showInputDialog("Ingrese el nombre del autor: ");

        tipoEdicion = JOptionPane.showInputDialog("Ingrese el tipo de edicion del libro: E para estandar u C para Coleccion"); 

        if ( tipoEdicion.equals("C"))
        {
            tipoEdicion="Coleccion";
            nombreColeccion= JOptionPane.showInputDialog("Ingrese el nombre de la coleccion: ");
            numLibro= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del libro en la coleccion: ")); 
        }
        else if (tipoEdicion.equals("E"))
        {
            tipoEdicion="Estandar";
        }
        Libreria libro = new Libreria(nombreLibro, nombreAutor, tipoEdicion, anioEdicion);
        Coleccion coleccion1= new Coleccion(nombreLibro, nombreAutor, tipoEdicion, anioEdicion, nombreColeccion, numLibro);
        Autores autor = new Autores(nombreLibro, nombreAutor, tipoEdicion, anioEdicion, autores);

        JOptionPane.showMessageDialog(null,"Libro agregado. \nNombre: "+libro.getNombreLibro()+"\nAutor: "+autor.mostrarAutores()+"\nEdicion: "+ libro.getTipoEdicion()
        +"\nAño de edicion: "+libro.getAnioEdicion()+"\nTipo de edicion:"+libro.getTipoEdicion()+"\nNombre de coleccion: "+coleccion1.getNombreColeccion()
        +"\nNumero del libro en coleccion: "+coleccion1.getNumeroLibro()); **/

        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentanaPrincipal);
    }
}