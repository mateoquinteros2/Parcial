/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave1;

import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Torre {
     public void Torre(){
     Scanner sc = new Scanner(System.in);
        Atributtos stdin = new Atributtos();
        System.out.println("Numero de discos: ");
        stdin.setN(sc.nextInt());
        Hanoi(stdin.getN(),1,2,3);  //1:origen  2:auxiliar 3:destino
    }
    
    
  public static void Hanoi(int nn, int origen,  int auxiliar, int destino){
  if(nn==1)
  System.out.println("mover disco de " + origen + " a " + destino);
  else{
     Hanoi(nn-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     Hanoi(nn-1, auxiliar, origen, destino);
   }
 }
}
