package vista;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JDialog
{
    //----------------------
    // Atributos

    private JLabel lbNombreLibro,lbAutor,lbAnioEdicion,lbTipoEdicion;
    private JTextField tfNombreLibro,tfAutor,tfAnioEdicion,tfTipoEdicion;
    private JButton btAgregar;
    //----------------------

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        this.setLayout(null);

        lbNombreLibro = new JLabel("Nombre : ");
        lbNombreLibro.setBounds(10,30,140,20);
        this.add(lbNombreLibro);

        lbAutor = new JLabel("Autor: ");
        lbAutor.setBounds(10,60,140,20);
        this.add(lbAutor);

        lbAnioEdicion = new JLabel("Año de edicion: ");
        lbAnioEdicion.setBounds(10,90,140,20);
        this.add(lbAnioEdicion);

        lbTipoEdicion = new JLabel("Tipo de edicion: ");
        lbTipoEdicion.setBounds(10,120,140,20);
        this.add(lbTipoEdicion);

        tfNombreLibro = new JTextField();
        tfNombreLibro.setBounds(150,60,100, 25);
        this.add(tfNombreLibro);

        tfAutor = new JTextField();
        tfAutor.setBounds(150,60,100, 25);
        this.add(tfAutor);

        tfAnioEdicion = new JTextField();
        tfAnioEdicion.setBounds(150,90,100, 25);
        this.add(tfAnioEdicion);

        tfTipoEdicion = new JTextField();
        tfTipoEdicion.setBounds(150,120,100, 25);
        this.add(tfTipoEdicion);

        //Checkbox objeto=new Checkbox("Multiples autores",null, boolean);
        Checkbox checkAutores=new Checkbox("Multiples autores");
        add(checkAutores);
        checkAutores.setBounds(10,140,120,50);

        Checkbox checkEdicion=new Checkbox("Edicion limitada");
        add(checkEdicion);
        checkEdicion.setBounds(10,180,120,50);

        btAgregar = new JButton("Agregar");
        btAgregar.setBounds(60,300,260,25);
        btAgregar.setActionCommand("agregar");
        this.add(btAgregar);

        this.setTitle("Agregar libro");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}
