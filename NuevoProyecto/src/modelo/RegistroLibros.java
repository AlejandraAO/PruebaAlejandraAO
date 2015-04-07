/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class RegistroLibros 
{
    private ArrayList<Libro> libros;

    public RegistroLibros() 
    {
        libros=new ArrayList<>();
    }
    
  public void setLibro(Libro libro)
  {
     libros.add(libro); 
  }
  
  public String getInformacion()
  {
      String datos=" ";
    for(Libro libro: libros)
        datos+=libro.toString();
    return datos;
  }
  
  public Libro getBuscar(String ISBN1)
  {
        for (Libro libro : libros) {
            if (libro.getISBN().equals(ISBN1)) {
               return libro;
            }
         
        }
       
       return null;
  }
  
  public void devolver()
  {
      for (int i=0; i<libros.size(); i++) 
     {
         System.out.println("ISBN:  " + libros.get(i).getISBN() + " " + "Titulo: " + libros.get(i).getTitulo() + " " + "Autor: " + libros.get(i).getAutor() );
         
     }  
     }
}
