/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

/**
 *
 * @author cc151255911
 */
public class rgb {
    private int r = 0;
    private int g = 0;
    private int b = 0;
    
    public int getR(){
        return r;
    }
    
    public int getG(){
        return g;
    }
    
    public int getB(){
        return b;
    }
    
    public void setR(int r){
        this.r = r;
    }
    
    public void setG(int g){
        this.g = g;
    }
    
    public void setB(int b){
        this.b = b;
    }
    
    public int[] getRGB(){
        int[] aux = new int [3];
        aux[0] = r;
        aux[1] = g;
        aux[2] = b;
        return aux;
    }
    
    public void setRGB(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }    
}
