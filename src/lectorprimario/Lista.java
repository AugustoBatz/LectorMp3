/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectorprimario;

/**
 *
 * @author augusto-btz
 */
public class Lista {
   
    nodo inicio;
    nodo aux;
    // Variable para registrar el tamaño de la lista.
    private int tamanio;
    /**
     * Constructor por defecto.
     */
    public void Lista(){
        inicio = null;
        tamanio = 0;
    }
     public boolean esVacia(){
        return inicio == null;
    }
    public int getTamanio(){
        return tamanio;
    }
    public void mostrar()
	{
	
		aux=inicio;
		if(inicio==null)
		{
			System.out.println("Lista vacia");
		}
		else
		{
			
			while(aux!=null)
			{
				System.out.println("Ruta "+aux.getpath());
                                System.out.println("Cancion "+aux.getcancion());
                                System.out.println("Artista "+aux.getartista());
                                System.out.println("Album "+aux.getalbum());
                                 System.out.println("Genero "+aux.getgenero());
                                System.out.println("Pista "+aux.gettrack());
                                System.out.println("No. Abum "+aux.getNoA());
                                System.out.println("Año "+aux.getaño());
                                System.out.println("Disquera "+aux.getdisquera());
                                System.out.println("Letra "+aux.getletra());
                                System.out.println("Pagina Artista "+aux.getpagA());
                                System.out.println("Pagina Disquera "+aux.getpagD());
                               
                                
				aux=aux.getsiguiente();
			}
		}
        }
   
    public void agregarAlInicio(String path,String cancion,String artista,String album,String disquera,String letra, String pagA,String pagD,String genero,String track,String NoA,String año){
        // Define un nuevo nodo.
        nodo nuevo = new nodo();
        // Agrega al valor al nodo.
        nuevo.setpath(path);
        nuevo.setcancion(cancion);
        nuevo.setartista(artista);
        nuevo.setalbum(album);
        nuevo.setdisquera(disquera);
        nuevo.setletra(letra);
        nuevo.setpagA(pagA);
        nuevo.setpagD(pagD);
        nuevo.setgenero(genero);
        nuevo.settrack(track);
        nuevo.setNoA(NoA);
        nuevo.setaño(año);
        
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario va agregando los nodos al inicio de la lista.
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(inicio);
            // Renombra al nuevo nodo como el inicio de la lista.
            inicio = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
        
    }
    
}
