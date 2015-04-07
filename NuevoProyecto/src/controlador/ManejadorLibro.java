/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.PanelBotonesAccion;
import vista.PanelDatosLibro;
import modelo.RegistroLibros;



/**
 *
 * @author Ale
 */
public class ManejadorLibro implements ActionListener
{
   private  RegistroLibros registro;
   private PanelBotonesAccion panel;
   private PanelDatosLibro panelDatos;
   
    public ManejadorLibro(PanelBotonesAccion panelito, PanelDatosLibro panelDato, RegistroLibros registros)
    {
        panel= panelito;
        panelDatos=panelDato;
        registro=registros;
    }
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getActionCommand().equalsIgnoreCase(panel.BOTON_ACEPTAR))
        {
            if(panelDatos.verificarDatos()==true)
            {
                if(registro.getBuscar(panelDatos.getISBN())==null)
                {
                   registro.setLibro(panelDatos.getLibro()); 
                   System.out.println("Se guardo");
                   registro.devolver();
                   System.out.println("ISBN:" + panelDatos.getISBN());
                }
            }
          
        }
        if(evento.getActionCommand().equalsIgnoreCase("Cancelar"))
        {
            panelDatos.limpiar();
        
        }
        //System.out.println("Evento ejecutado");
    }
   
    
    
}
