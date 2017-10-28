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
                            int a=0,b=0,c=0,d=0;
                            while((a!=84&&b!=73)&&(c!=84&&d!=50))
                            {
                                a=archivo.readByte();
                                contador++;
                               
                                b=archivo.readByte();
                                contador++;
                                
                                c=archivo.readByte();
                                contador++;
                                
                                d=archivo.readByte();
                                contador++;
                                System.out.println("a= "+Integer.toHexString(a)+" b= "+Integer.toHexString(b)+" c= "+Integer.toHexString(c)+" d= "+Integer.toHexString(d));
                                if(a!=84&&b!=73&&c!=84&&d!=50)
                                {
                                    contador=contador-3;
                                    archivo.seek(contador);
                                }
                            }
                           int TIT2=contador;///termina etiqueta TIT2
                           System.out.println("TIT2 "+TIT2 +(char)archivo.readByte());
                          contador=3;
                           archivo.seek(3);
                           a=0;b=0;c=0;d=0;
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
                                System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
                                if(a!=84&&b!=80&&c!=69&&d!=49)
                                {
                                    contador=contador-3;
                                    archivo.seek(contador);
                                }
                            }
                           int TPE2=contador;///termina etiqueta TPE2
                            System.out.println("TPE2 "+TPE2+" " +archivo.readByte());
                            
                           
                          
                          contador=3;
                           archivo.seek(3);
                           a=0;b=0;c=0;d=0;
                            while(a!=84&&b!=65&&c!=76&&d!=66)
                            {
                                a=archivo.readByte();
                                contador++;
                               
                                b=archivo.readByte();
                                contador++;
                                
                                c=archivo.readByte();
                                contador++;
                                
                                d=archivo.readByte();
                                contador++;
                                System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
                                if(a!=84&&b!=65&&c!=76&&d!=66)
                                {
                                    contador=contador-3;
                                    archivo.seek(contador);
                                }
                            }
                           int TALB=contador;///termina etiqueta TALB
                            System.out.println("TALB "+TALB+" " +archivo.readByte());
                          
                            
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
