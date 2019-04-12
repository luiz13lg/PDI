/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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

    public static rgb[][] leituraRGB(int i, int j, String localArq) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(localArq));
        rgb m[][] = new rgb[i][j];
        Scanner s = new Scanner(System.in);
        String valoresLinha = null;
        
        for(int aux = 0; aux < 4; aux++)
            valoresLinha = br.readLine();
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                m[aL][aC] = new rgb();
                m[aL][aC].setR(Integer.valueOf(br.readLine()));
                m[aL][aC].setG(Integer.valueOf(br.readLine()));
                m[aL][aC].setB(Integer.valueOf(br.readLine()));
            }
        return m;
    }
    
    public static int[][] getCanalR(rgb matriz[][], int i, int j){
        int[][] imagem = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC] = matriz[aL][aC].getR();
            }
        return imagem;
    }
    
    public static int[][] getCanalB(rgb matriz[][], int i, int j){
        int[][] imagem = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC] = matriz[aL][aC].getB();
            }
        return imagem;
    }
    
    public static int[][] getCanalG(rgb matriz[][], int i, int j){
        int[][] imagem = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC] = matriz[aL][aC].getG();
            }
        return imagem;
    }
    
    public static rgb[][] reduzirCanalR(rgb matriz[][], int i, int j, int valor){
        rgb imagem[][] = matriz;
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC].setR(matriz[aL][aC].getR() - valor);
            }
        
        return imagem;
    }
    
    public static rgb[][] reduzirCanalG(rgb matriz[][], int i, int j, int valor){
        rgb imagem[][] = matriz;
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC].setG(matriz[aL][aC].getG() - valor);
            }
        
        return imagem;
    }
    
    public static rgb[][] reduzirCanalB(rgb matriz[][], int i, int j, int valor){
        rgb imagem[][] = matriz;
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC].setB(matriz[aL][aC].getB() - valor);
            }
        
        return imagem;
    }
    
    public static int[][] salvarCanalR(rgb matriz[][], int i, int j){
        int imagem[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC] = matriz[aL][aC].getR();
            }
        
        return imagem;
    }
    
    public static int[][] salvarCanalG(rgb matriz[][], int i, int j){
        int imagem[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC] = matriz[aL][aC].getG();
            }
        
        return imagem;
    }
    
    public static int[][] salvarCanalB(rgb matriz[][], int i, int j){
        int imagem[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC] = matriz[aL][aC].getB();
            }
        
        return imagem;
    }
    
}
