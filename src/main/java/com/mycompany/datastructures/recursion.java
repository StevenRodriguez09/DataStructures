/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

/**
 *El metodo recursivo debe tener
 *Minimo una Condicion de Parada/Base, que nos permita devolver un valor
 * Una llamada a si misma
 */
public class recursion {
    
    static int arr [] = {12,34,64,2,3};
     
/**
 *El metodo recursivo debe tener
 *Minimo una Condicion de Parada/Base, que nos permita devolver un valor
 * Una llamada a si misma
 */       
    public static int factorial(int n){
        if(n==0){
          return 1;  
        }else {
            return (n*factorial(n-1));
        }
    }
 /**
 *Metodo que logra buscar un valor X en un array
 */
    
    public static int buscarElemento(int arr[],int i, int n, int f){
        if(f<1){
            return -1;
        }
        if (arr[i]==n){
            return i;
        }
        if (arr[f]==n){
            return n;
        }
        else{
           return buscarElemento(arr,1+i,n,f-1);
        }
  }
}

