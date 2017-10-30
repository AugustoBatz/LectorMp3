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
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author augusto-btz
 */
public class LectorPrimario {
   
    /**
     * @param args the command line arguments
     */
    public static ArrayList<String> nombres = new ArrayList<String>();
     public static ArrayList<String> Rutas = new ArrayList<String>();
    public static void main(String[] args) {
        // Aquí la carpeta donde queremos buscar
     
           
         Sc();
        
        Acceso n=new Acceso();
        Lista Lista=new Lista();
//        String ruta;
//        File f;
//        javax.swing.JFileChooser j = new javax.swing.JFileChooser();
//        FileNameExtensionFilter filt=new FileNameExtensionFilter("mp3", "mp3");
//        j.setFileFilter(filt);
//        j.showOpenDialog(j);
//        String path=j.getSelectedFile().getAbsolutePath();
//        String lectura="";
//        ArrayList<String> lec = new ArrayList<String>();
//        ruta=path;
//        int leido;
        
//        n.lectura(ruta,Lista);
        for (int i = 0; i < Rutas.size(); i++) {
            n.lectura(Rutas.get(i), Lista);
        }
        Lista.mostrar();
       
//        
    }
     static public void Sc()
    {
        
       
        JFileChooser fc=new JFileChooser();
        fc.setMultiSelectionEnabled(true);
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        byte d=(byte)fc.showOpenDialog(null);
        if(d==0)
        {
             String ruta= fc.getSelectedFile().toString();             
              paths(new File(ruta));   
              String []array=new String[nombres.size()];
              nombres.toArray(array);
              
        }
    }
    
    static public void paths(File ruta)
    {
       
        File listFile[] = ruta.listFiles();                                     
        if (listFile != null)       
        {
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isDirectory())                             
                {
                    paths(listFile[i]);
                }
                else                                                           
                {
                    int TamString = listFile[i].getAbsolutePath().length();     																	
                    String obtener=listFile[i].getAbsolutePath().substring(TamString-3, TamString);
                    if(obtener.equals("mp3"))                                 
                    {
                        Rutas.add(listFile[i].getAbsolutePath());
                        nombres.add(listFile[i].getName());
                    }
                }
            }
        }
    }
    
    
}
