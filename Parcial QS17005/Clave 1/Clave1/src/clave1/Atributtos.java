/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave1;

/**
 *
 * @author Mateo Quinteros
 */
public class Atributtos {    //DELARACION DE VARIABLES DE SimultaorMontecarlo

    //DELARACION DE VARIABLES DE RTORRE
    int n;
    
    int semilla;
    int cmultiplicativa;
    int caditiva;
    int modulo;
    int i, numero;  
    double numero2; 
    
    public Atributtos(){
        
    }
    public  Atributtos(int semilla, int cmultiplicativa, int caditiva, int modulo){
            this.semilla=semilla;
            this.cmultiplicativa=cmultiplicativa;
            this.caditiva=caditiva;
            this.modulo=modulo;
        }
    public int getSemilla() {
        return semilla;
    }

    public void setSemilla(int semilla) {
        this.semilla = semilla;
    }

    public int getCmultiplicativa() {
        return cmultiplicativa;
    }

    public void setCmultiplicativa(int cmultiplicativa) {
        this.cmultiplicativa = cmultiplicativa;
    }

    public int getCaditiva() {
        return caditiva;
    }

    public void setCaditiva(int caditiva) {
        this.caditiva = caditiva;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
}
