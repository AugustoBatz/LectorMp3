/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectorprimario;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author augusto-btz
 */
public class Acceso {
    public void lectura(String ruta)
    {
        try {
            RandomAccessFile archivo= new RandomAccessFile(ruta,"r");
            int s=-52;
            int contador=0;
            if((char)archivo.readByte()=='I')
            {
                contador++;
                if((char)archivo.readByte()=='D')
                {
                    contador++;
                    if((char)archivo.readByte()=='3')
                    {
                        contador++;
                        System.out.println("Archivo correcto");
                        byte x=archivo.readByte();
                        contador++;
                        if(x==3)
                        {
                            byte a=0,b=0,c=0,d=0;
                            while(a!=84&&b!=80&&c!=69&&d!=50)
                            {
                                a=archivo.readByte();
                                contador++;
                               
                                b=archivo.readByte();
                                contador++;
                                
                                c=archivo.readByte();
                                contador++;
                                
                                d=archivo.readByte();
                                contador++;
                                
                                if(a!=84&&b!=80&&c!=69&&d!=50)
                                {
                                    contador=contador-3;
                                    archivo.seek(contador);
                                }
                            }
                           int IA=contador;
                          
                           if((char)a=='T'&&(char)b=='I'&&(char)c=='T'&&(char)d=='2')//////raro
                           {
                               System.out.println("Raro");
                               a=0;
                               b=0;
                               c=0;
                               d=0;
                               while(a!=84&&b!=80&&c!=69&&d!=49)
                            {
                                
                                a=archivo.readByte();
                                contador++;
                                b=archivo.readByte();
                                contador++;
                                c=archivo.readByte();
                                contador++;
                                d=archivo.readByte();
                                contador++;
                                if(a!=84&&b!=80&&c!=69&&d!=50)
                                {
                                    contador=contador-3;
                                    archivo.seek(contador);
                                }
                                
                            }   
                                byte xx;
                                String titulo="";
                                archivo.seek(IA+1);
                                for (int i = IA; i < contador-5; i++) 
                                {
                                    xx=archivo.readByte();
                                    if(xx>65&&xx<123||xx==32)
                                    {
                                        titulo=titulo+String.valueOf((char)xx);
                                    }
                                
                                }
                                System.out.println(titulo);
                                
                           }
                           else////////normal
                           {
                               
                           }
                            
                        }
                        if(x==4)
                        {
                            System.out.println("Version 4");
                        }
                         
                    }
                }
            }
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
