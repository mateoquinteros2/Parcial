/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Mateo Quinteros
 */
public class Menu {
    
    //public static void main(String[] args) throws IOException {
        // TODO code application logic here
        public void Menu01() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner stdin = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        
        while(!salir){
            System.out.println("------------------------------------------------");
            System.out.println("-                 BIENVENIDO                   -");
            System.out.println("------------------------------------------------");
            System.out.println("-        [1] Resolver Torre de Hanoid          -");
            System.out.println("-        [2] Resolver Monte Carlo              -");
            System.out.println("-        [3] Simular Torre de Hanoid           -");
            System.out.println("-        [4] Salir                             -");
            System.out.println("------------------------------------------------");
            do{
            try {
                System.out.println("-          Ingresa una opcion                  -");
                System.out.println("------------------------------------------------");
                 opcion = stdin.nextInt();
                 
                 switch(opcion){
                case 1:
                Torre simtor =  new Torre();
                simtor.Torre();
                    break;
                    
                case 2:
                SimultaorMontecarlo MonteC =  new SimultaorMontecarlo();
                MonteC.MonteCarlos();
                    break;
                
                case 3:
                RTorre tor = new RTorre();
                tor.RTorre();
                    break;    
                case 4:
                    salir=true;
                    break;          
                default:
                    System.out.println("Elige una opcion correcta");
            }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                stdin.next();
            }
        }while(opcion<=0 || opcion>4);
        System.out.println("------------------------------------");
        System.out.println("Presione Enter para continuar......>");
        br.readLine();
        }
        }
}
          