/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave1;

import static com.sun.javafx.fxml.expression.Expression.modulo;
import java.util.Scanner;

/**
 *
 * @author Mateo Quinteros
 */
public class SimultaorMontecarlo {
    
    
    public void MonteCarlos(){
        
Scanner entrada = new Scanner(System.in); 
   Atributtos stdin = new Atributtos();  //instancia de la clse atributos
        
 //procedimiento de captura de datos para la realizacion del algoritmo
System.out.print("Inserte una semilla: ");
stdin.setSemilla(entrada.nextInt());
        
System.out.print("Inserte una constante multiplicativa: ");
 stdin.setCmultiplicativa(entrada.nextInt());
        
System.out.print("Inserte el módulo: ");
stdin.setModulo(entrada.nextInt());

//Una vez capturado los datos se procede a realizar el algoritmo        
for (stdin.i=1; stdin.i<=20; stdin.i++){
     stdin.numero = (stdin.getCmultiplicativa()*stdin.getSemilla()) % stdin.getModulo();   
     stdin.numero2 = (int) ((double)stdin.numero / (double)(stdin.getModulo()-1));
   System.out.printf("%d. %d (%.4f)\n", stdin.i ,stdin.numero ,stdin.numero2 ); 
    
   stdin.semilla = stdin.numero; 
}
    }
    
}
