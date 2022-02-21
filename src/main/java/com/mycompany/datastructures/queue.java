/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

/**
 *
 * @author Steven Rodriguez
 */
public class queue {
    
    //Declaracion de atributos
    private node head;
    private node tail;
    
    //Constructor sin parametros
    public queue(){
        head = null;
        tail = null;
    }
    //Metodo insertar
    
    public void insertar(int dato){
        node newNode = new node();
        newNode.setValue(dato);
        newNode.setNext(null);
        
        //Porque es nuestro primer elemento en la cola
        if(head == null & tail == null){
            head = newNode;
            tail = newNode;
        }
        System.out.println("El valor anterior del tail es:  ");
        System.out.println(tail.getValue());
        
        tail.setNext(newNode);
        tail = newNode;
        
        System.out.println("El valor actual del tail es:  ");
        System.out.println(tail.getValue());
    }
    
    //Metodo extraer dato 
    public void extraer(){
        System.out.println("El valor anterior del head es:  ");
        System.out.println(head.getValue());
        
        head = head.getNext();
        
        System.out.println("El valor actual del head es:  ");
        System.out.println(head.getValue());
    }
    
    //Metodo para comprobar que la cola no esta vacia
    public boolean isEmpty(){
        boolean cola = false;
        if(head == null & tail == null){
            cola = true;
            System.out.println("La cola esta vacia"); 
        }else{
            System.out.println("La cola no esta vacia");
            cola = false;
        }
        return cola;
    }
    public int lenght(){
        int resultado = 0;
        node c = this.head;
        if (isEmpty()){
            return resultado;
        }
        while(c != null){
            
            c = c.getNext();
            resultado++;
        }
        return resultado;
    }
    
}
    
    
    


