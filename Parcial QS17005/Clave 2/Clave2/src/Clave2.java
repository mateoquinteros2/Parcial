/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import consola.Menu;
import consola.MenuCallback;
import metodos.*;


/**
 *
 * @author Mateo Quinteros
 */
public class Clave2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setTitulo("Metodos Numericos");

        menu.agregar("Newton Raphson", new MenuCallback() {
            public void ejecutar() {
                NewtonRaphson metodo = new NewtonRaphson();
                metodo.consola();
            }
        });

        menu.agregar("Metodo de Runge Kutta", new MenuCallback() {
            public void ejecutar() {
                RungeKutta metodo = new RungeKutta();
                metodo.consola();
            }
        });
        menu.mostrar();
    }
   
}
