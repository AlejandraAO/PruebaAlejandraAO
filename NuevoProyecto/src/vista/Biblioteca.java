/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Libro;
import modelo.RegistroLibros;

/**
 *
 * @author usuario
 */
public class Biblioteca 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Libro libro= new Libro("12", "Java", "Deitel");
          Libro libro1= new Libro("13", "Python", "Deitel");
        
       //System.out.println(libro.toString() + "\n " + "\n"  + libro1.toString());
         
        
        RegistroLibros registro= new RegistroLibros();
        
        registro.setLibro(libro);
         registro.setLibro(libro1);
         
         
       
        
           System.out.println(registro.getBuscar("12"));
        // TODO code application logic here
           
           
           
           new GuiLibro().setVisible(true); 
           new GuiEstudiante().setVisible(true);
           
    }
    
}
