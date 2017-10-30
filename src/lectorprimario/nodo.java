package lectorprimario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augusto-btz
 */
public class nodo {
    
    private String path,track,NoA,cancion,artista,album,disquera,letra,pagA,pagD,genero,año;
   
    private nodo siguiente;
    public nodo()
	{
		this.track=null;
                this.NoA=null;
                this.año=null;
                this.path=null;
                this.cancion=null;
                this.artista=null;
                this.album=null;
                this.disquera=null;
                this.letra=null;
                this.pagA=null;
                this.pagD=null;
                this.genero=null;
                this.siguiente=null;
                
	}
	public String gettrack()
	{
		return track;
	}
        public void setaño(String año)
	{
		this.año=año;
	}
	public String getaño()
	{
		return año;
	}
        public void setNoA(String NoA)
	{
		this.NoA=NoA;
	}
	public String getNoA()
	{
		return NoA;
	}
        public void setpagD(String paD)
	{
		this.pagD=pagD;
	}
	public String getpagD()
	{
		return pagD;
	}
        public void setgenero(String genero)
	{
		this.genero=genero;
	}
	public String getgenero()
	{
		return genero;
	}
        public void setpagA(String pagA)
	{
		this.pagA=pagA;
	}
	public String getpagA()
	{
		return pagA;
	}
        public void setletra(String letra)
	{
		this.letra=letra;
	}
	public String getletra()
	{
		return letra;
	}
        public void setdisquera(String disquera)
	{
		this.disquera=disquera;
	}
	public String getdisquera()
	{
		return disquera;
	}
        public void setalbum(String album)
	{
		this.album=album;
	}
	public String getalbum()
	{
		return album;
	}
        public void setartista(String artista)
	{
		this.artista=artista;
	}
	public String getartista()
	{
		return artista;
	}
	public void settrack(String x)
	{ 
		
		this.track=x;
	}
	public nodo getsiguiente()
	{
		return siguiente;
	}
	public void setsiguiente(nodo next)
	{
		this.siguiente=next;
	}
	public void setpath(String path)
	{
		this.path=path;
	}
	public String getpath()
	{
		return path;
	}
	public void setcancion(String cancion)
	{
		this.cancion=cancion;
	}
	public String getcancion()
	{
		return cancion;
	}
        
        
	public nodo getSiguiente() {
        return siguiente;
            }

        public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }   
    
}
