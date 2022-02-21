/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

/**
 *
 * @author Steven Rodriguez
 */
public class Problema1 {
    
   private static int invertirNumero(int num, int pos){
     if (num<10) {
         return num;
     } else{
         return num%10 * (int)Math.pow(10, pos) + invertirNumero(num/10, pos-1);
     }
     
   }

}
