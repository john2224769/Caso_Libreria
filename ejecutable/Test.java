package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) {

        String nombreLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro: ");
        int autores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autores del libro")); 
        if ( autores > 1)
        {
            String nombreAutor = JOptionPane.showInputDialog("Ingrese el nombre del autor: ");
            nombreAutor = nombreAutor + " y otros";
            String tipoEdicion = JOptionPane.showInputDialog("Ingrese el tipo de edicion del libro: E para estandar u C para Coleccion"); 
        if ( tipoEdicion.equals("C"))
        {
            String nombreColeccion= JOptionPane.showInputDialog("Ingrese el nombre de la coleccion: ");
            int numLibro= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del libro en la coleccion: ")); 
            int anioEdicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de edicion del libro"));
            JOptionPane.showMessageDialog(null," Libro agregado: "+ nombreLibro+ "\nAutor: "+nombreAutor+"\nTipo de edicion: Coleccion" 
            +"\nNombre de la coleccion: "+nombreColeccion +"\nLibro numero: "+numLibro+"\nFecha de edicion: "+anioEdicion);
        }
        else if ( tipoEdicion.equals("E"))
        { 
            int anioEdicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de edicion del libro"));
            JOptionPane.showMessageDialog(null,"\nLibro agregado: "+ nombreLibro+ "\nAutor: "+nombreAutor+"\nTipo de edicion: Estandar"+ 
            "\nFecha de edicion: "+anioEdicion);
        
        }
        }
        else 
        {
        String tipoEdicion = JOptionPane.showInputDialog("Ingrese el tipo de edicion del libro: E para estandar u C para Coleccion"); 
        if ( tipoEdicion == "C")
        {
            String nombreColeccion= JOptionPane.showInputDialog("Ingrese el nombre de la coleccion: ");
            int numLibro= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del libro en la coleccion: ")); 
            int anioEdicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de edicion del libro"));
            JOptionPane.showMessageDialog(null," Libro agregado: "+ nombreLibro+ "\nAutor: "+autores+"\nTipo de edicion: Coleccion" 
            +"\nNombre de la coleccion: "+nombreColeccion +"\nLibro numero: "+numLibro+"\nFecha de edicion: "+anioEdicion);
        }
        else if ( tipoEdicion == "E")
        { 
            int anioEdicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de edicion del libro"));
            JOptionPane.showMessageDialog(null,"\nLibro agregado: "+ nombreLibro+ "\nAutor: "+autores+"\nTipo de edicion: Estandar"+ 
            "\nFecha de edicion: "+anioEdicion);
        
        }

        }
    }
}