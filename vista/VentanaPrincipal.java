package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public PanelEntradaDatos miPanelEntradaDatos;

    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,10,370,130);
        this.add(miPanelOperaciones);

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,150,370,320);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("Libreria");
        this.setSize(400,550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void desplegarAgregarLibro()
    {
        miPanelEntradaDatos = new PanelEntradaDatos();
    }


}
