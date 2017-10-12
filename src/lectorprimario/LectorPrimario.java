/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectorprimario;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author augusto-btz
 */
public class LectorPrimario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            FileInputStream archivo=new FileInputStream("Perfect Insanity.mp3");
            DataInputStream lectorarchivo=new DataInputStream(archivo);
            int b;
            b=lectorarchivo.read();
            while(b!=-1){
           
            if(b==84)
            {   System.out.println((char)b);
                b=lectorarchivo.read();
                if(b==65)
                {
                    System.out.println((char)b);
                    b=lectorarchivo.read();
                    if(b==71)
                    {
                        System.out.println((char)b);
                        b=lectorarchivo.read();
                        if(b>48&&b<142)
                            
                        {
                        while(b!=-1)
                        {
                            System.out.println("Datos "+(char)b);
                             b=lectorarchivo.read();
                        }
                        }
                    }
                }
            
            }
            b=lectorarchivo.read();
            }
            lectorarchivo.close();
            archivo.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LectorPrimario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LectorPrimario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
