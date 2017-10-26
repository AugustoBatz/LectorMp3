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
                            System.out.println("Version 3");
                            //////////////////////////////// buscar TPE1
                            int terminar=-5;
                            while(terminar!=0){
                            while((char)archivo.readByte()!='T')
                            {
                                contador++;
                            }
                            archivo.seek(contador);
                            String aux=String.valueOf((char)archivo.read());
                            System.out.println("Primera Letra "+aux);
                            System.out.println("La primera T esta "+ contador);
                            for (int i = 0; i < 3; i++) {
                                aux=aux+String.valueOf((char)archivo.readByte());
                                contador++;
                            }
                                System.out.println(aux);
                            if("TPE2".equals(aux))
                            {
                                System.out.println("Aca empieza el artista");
                                System.out.println("TPE2 termina "+contador+" Bytes");
                                int IA=contador;
                                int fin=-5;
                                while(fin!=0)
                                {
                                    contador++;
                                    if((char)archivo.readByte()=='T')
                                    {
                                        contador++;
                                        if((char)archivo.readByte()=='I')
                                        {
                                            contador++;
                                            if((char)archivo.readByte()=='T')
                                            {
                                                contador++;
                                                if((char)archivo.readByte()=='2')
                                                {
                                                   
                                                    System.out.println("TPE2 Termina en "+contador+"  Bytes");
                                                    archivo.seek(IA+1);
                                                    String artista="";
                                                    byte aux2;
                                                    for (int i = IA; i < contador-4; i++) {
                                                        aux2=archivo.readByte();
                                                        if(aux2>31&&aux2<123)
                                                        {
                                                            artista=artista+String.valueOf((char)aux2);
                                                        }
                                                        
                                                    }       
                                                    System.out.println("El artista es ");
                                                    System.out.println(artista);
                                                    fin=0;    
                                                        
                                                    
                                                }
                                            }
                                        }
                                    }
                                
                                    
                                    
                                }
                                terminar=0;
                            }
                            else
                            {
                                
                            }
                            
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
