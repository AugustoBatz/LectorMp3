/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectorprimario;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author augusto-btz
 */
public class LectorPrimario {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Acceso n=new Acceso();
        String ruta;
        File f;
        javax.swing.JFileChooser j = new javax.swing.JFileChooser();
        FileNameExtensionFilter filt=new FileNameExtensionFilter("mp3", "mp3");
        j.setFileFilter(filt);
        j.showOpenDialog(j);
        String path=j.getSelectedFile().getAbsolutePath();
        String lectura="";
        ArrayList<String> lec = new ArrayList<String>();
        ruta=path;
        int leido;
        n.lectura(ruta);
        f = new File(path);
        
//        try {
//            FileInputStream archivo=new FileInputStream(f);
//            DataInputStream lectorarchivo=new DataInputStream(archivo);
//            int b;
//            b=lectorarchivo.read();
//            while(b!=-1){
//           
//            if(b==84)
//            {   System.out.println((char)b);
//                b=lectorarchivo.read();
//                if(b==65)
//                {
//                    System.out.println((char)b);
//                    b=lectorarchivo.read();
//                    if(b==71)
//                    {
//                        System.out.println((char)b);
//                        b=lectorarchivo.read();
//                        if(b>48&&b<142)
//                            
//                        {
//                        while(b!=-1)
//                        {
//                            System.out.println("Datos "+(char)b);
//                             b=lectorarchivo.read();
//                        }
//                        }
//                    }
//                }
//            
//            }
//            b=lectorarchivo.read();
//            }
//            lectorarchivo.close();
//            archivo.close();
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(LectorPrimario.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(LectorPrimario.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
    }
    
}
