package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.Libreria;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener{

    private VentanaPrincipal vnPrincipal;

    
    public Controlador (VentanaPrincipal vnPrincipal)
    {
        this.vnPrincipal =vnPrincipal;
        this.vnPrincipal.miPanelOperaciones.agregarOyentesBotones(this);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        String comando = ae.getActionCommand();

        if (comando.equals("agregarLibro"))
        {
            vnPrincipal.desplegarAgregarLibro();
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }  

    }

}