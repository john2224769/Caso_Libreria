package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) {

        String nombreLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro: ");
        String nombreAutor = JOptionPane.showInputDialog("Ingrese el nombre del autor: ");
        String tipoEdicion = JOptionPane.showInputDialog("Ingrese el tipo de edicion del libro: ");
        int anioEdicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de edicion del libro")); 
        
    }
}