package lectorprimario;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import lectorprimario.Lista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augusto-btz
 */
public class Escribir_Archivo {
    
    Lista x=new Lista();
    public void escribit(Lista x)
    {
        try {
            RandomAccessFile j=new RandomAccessFile("cagado.com","rw");
            j.writeByte('P');
            j.writeByte('P');
            j.writeByte('P');
            j.writeByte('0');
            j.writeByte('0');
            j.writeByte('0');
            String cancion;
            String Artista;
            int largo;
            String Album;
            x.setsiguiente(x.getinicio());
            while(x.aux!=null)
            {   
                if(x.getartista()!=null)
                {
                    System.out.println(x.getartista());
                     Artista=x.getartista();
                     System.out.println("artisa xxx "+Artista);
                     largo=Artista.length();
                     System.out.println("Largo "+largo);
                      j.writeByte('0');
                      j.writeByte((byte)largo);
                      j.writeByte('0');
                      for (int i = 0; i < Artista.length(); i++) {
                        j.writeByte(Artista.charAt(i));
                    }
                      
                }
                else
                {
                    j.writeByte('0');
                    j.writeByte('0');
                    
                }
                if(x.getalbum()!=null)
                {
                   
                     Album=x.getalbum();
                     largo=Album.length();
                     System.out.println("Largo "+largo);
                      j.writeByte('0');
                      j.writeByte((byte)largo);
                      j.writeByte('0');
                      for (int i = 0; i < Album.length(); i++) {
                        j.writeByte(Album.charAt(i));
                    }
                }
                else
                {
                    
                    j.writeByte('0');
                    j.writeByte('0');
                }
                 if(x.getnombre()!=null)
                {
                    
                     cancion=x.getnombre();
                    
                     largo=cancion.length();
                     System.out.println("Largo "+largo);
                      j.writeByte('0');
                      j.writeByte((byte)largo);
                      j.writeByte('0');
                      for (int i = 0; i < cancion.length(); i++) {
                        j.writeByte(cancion.charAt(i));
                    }
                      
                }
                else
                {
                    j.writeByte('0');
                    j.writeByte('0');
                    
                }
                cancion=x.getnombre();
                
                x.setsiguiente(x.getsiguinte());
            }
            j.close();
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Escribir_Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Escribir_Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
