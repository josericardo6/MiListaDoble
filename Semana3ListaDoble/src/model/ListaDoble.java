/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author joser
 */
public class ListaDoble {
    
    private NodoDoble cabeza;
    private int size;

    public ListaDoble() {
        this.cabeza = null;
        this.size = 0;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return cabeza == null;
    }
    
    public boolean add(String dato){
        
        NodoDoble nuevo = new NodoDoble(dato);
        
        if(null == cabeza){
            
            cabeza = nuevo;
            
        }else{
            
            NodoDoble aux = cabeza;
            
            for(int i = 0;i < size - 1; i++){
                
                aux = aux.getSig();
                
            }
            
            aux.setSig(nuevo);
            
        }
        
        size++;
        return true;
    }
    
    @Override
    public String toString(){
        
        NodoDoble aux = cabeza; //Inicializa el nodo auxiliar con el valor de la cabeza
        String resultado = "";
     
        for(int i = 0; i < size; i++){
            
            resultado +="[" + aux.getDato()+ "] "; //Toma el dato del auxiliar y lo agrega al string
            aux = aux.getSig(); //le da un nuevo valor al auxiliar, el valor dado es del nodo que sigue, osea se corre un campo
            
        }
        
        return resultado;
    }
    
    public boolean AddFirst(String dato){
        
        NodoDoble nuevo = new NodoDoble(dato);
        
        if(size == 0){
            
            cabeza = nuevo;
            
        }else{
            
            nuevo.setSig(cabeza);
            cabeza = nuevo;
            
        }
        
        size++;
        return true;
    }
    
    public boolean addIndex(String dato, int index){
        
        NodoDoble nuevo = new NodoDoble(dato);
        
        if (index < 0 || index > size){ // exepcion
            
            throw new ArrayIndexOutOfBoundsException("El indice es invalido");
            
        }
        
        if(size == 0 || index == 0){ // si el index es 0, o la lista esta vacia, se agrega al inicio
            
            cabeza = nuevo; 
            
        }
        else{
            
            if(size == index){ // si el index es el campo que sigue, lo agrega al final
                
                NodoDoble aux = cabeza;
                
                for(int i = 0; i < index-1; i++){
                    
                    aux = aux.getSig();
                    
                }
                
                aux.setSig(nuevo);
                
            }else{
                
                if(size != index && index != 0){
                    
                    NodoDoble aux = cabeza;
                    
                    for(int i = 0; i < index-1; i++){ // va buscando el index
                        
                        aux = aux.getSig();// se va moviendo por la lista
                        
                    }
                    
                    nuevo.setSig(aux.getSig()); //pega el nuevo nodo con el siguiente de donde lo queremos meter
                    aux.setSig(nuevo); // pega el aux(lo anterior en la lista) al nuevo agregado
                    
                }
                
            }
            
        }
        
        return true;
    }
    
    public boolean remove(int index){
        
        if(index < 0 || index >= size){
            
            throw new ArrayIndexOutOfBoundsException("El indice es invalido");
            
        }
        
        if(index == 0){
           
            cabeza = cabeza.getSig();
            
        }else{
            
            if(index == size-1){
                
                NodoDoble aux = cabeza;
                
                for(int i = 0; i < index-1; i++){
                    
                    aux = aux.getSig();
                    
                }
                
                aux.setSig(null);
                
                
            }else{
                
                NodoDoble aux = cabeza;
                
                for(int i = 0; i < index-1; i++){
                    
                    aux = aux.getSig();
                    
                }
                
                aux.setSig(aux.getSig().getSig());
                
            }
            
        }
        size--;
        
        return true;
    }
    
}
