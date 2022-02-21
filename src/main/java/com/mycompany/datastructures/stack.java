/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

/**
 *
 * @author Steven Rodriguez
 */
public class stack {
    private node top;
    private int lenght;
    private boolean isEmpty;
    
    public void stack (){
        top = null;
        lenght=0;
    }
    
    public boolean isEmpty(){
        if(top==null){
            System.out.println("La pila se encuentra vacia");
            return true;
        }
        else{
            return false;
        }
    }
    public int getLenght(){
        return lenght;
    }
    /**
     * Este metodo ingresa un nuevo valor al inicio/top de nuestra pila
     * @param value = valor a agregar a nuestra pila
     */
    public void push (int value){
       node newNode = new node();
       newNode.setValue (value);
       
       if(isEmpty()){
           
           //Inicializa la pila con el newNode
           top = newNode;
       }
       else{
           //si no esta vacia; nuestro nuevo nodo, hace referencia al que este en
           //el top en ese momento
           System.out.println("El top anterior fue :  ");
           System.out.println(top.getValue());
           newNode.setNext(top);
           
           //nuestro start/top ahora es el nuevo nodo
           top = newNode;
           System.out.println("Se agrego nuestro nuevo nodo al top de la pila");
           System.out.println(top.getValue());
       }
       
       lenght++;
    }
       public void pop(){
           if(isEmpty){
               System.out.println("Porque no agregas un nuevo nodo");
           }
           else{
               System.out.println("Se quito el top de la pila en ese momentp que es: ");
               System.out.println(top.getValue());
               
               //Asigna como primer elemento, al siguiente de la pila
               top=top.getNext();
               
               System.out.println("El nuevo top es: ");
               System.out.println(top.getValue());
                lenght--;      
           }
       }
       
    }

