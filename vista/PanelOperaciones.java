package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    private JButton btAgregarLibro, btVerLibros, btSalir;
    //----------------------


    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel

        this.setLayout(null);
        this.setBackground(Color.green);

        btAgregarLibro = new JButton("Agregar libro");
        btAgregarLibro.setBounds(10,30,170,20);
        btAgregarLibro.setActionCommand("agregarLibro");
        this.add(btAgregarLibro);

        btVerLibros = new JButton("Ver biblioteca");
        btVerLibros.setBounds(190,30,170,20);
        btVerLibros.setActionCommand("verLibros");
        this.add(btVerLibros);

        btSalir = new JButton("Salir");
        btSalir.setBounds(90,70,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        TitledBorder borde = BorderFactory.createTitledBorder("Opciones");
        borde.setTitleColor(Color.darkGray);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAgregarLibro.addActionListener(pAL);
        btVerLibros.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }


}
