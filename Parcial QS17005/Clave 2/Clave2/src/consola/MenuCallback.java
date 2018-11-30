/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.util.EventListener;

/**
 *
 * @author Mateo Quinteros
 */
public interface MenuCallback  extends EventListener{
        /**
     * funcion que ejecutara el menu
     */
   public void ejecutar();
   
}
