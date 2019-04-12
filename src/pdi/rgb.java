/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
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

    public static rgb[][] leituraRGB(String localArq, int i, int j) throws FileNotFoundException, IOException{
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
    
        public static boolean salvarMatriz(rgb[][] m,int i, int j, String SalvarArq) throws FileNotFoundException, IOException{
        OutputStream salvar = new FileOutputStream(SalvarArq);
        String auxiliar;
        String cabecalho = "P3\n#CREATOR: LUIZ G THOMAZ\n"+j+" "+i+"\n255\n";
        byte[] salvando = cabecalho.getBytes();
        salvar.write(salvando); //escrevendo cabecalho do arq

        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                auxiliar = String.valueOf(m[aL][aC].getR())+'\n'+String.valueOf(m[aL][aC].getG())+'\n'+String.valueOf(m[aL][aC].getB())+'\n';
                salvando = auxiliar.getBytes();
                salvar.write(salvando);
            }
        
        salvar.close();
        return true;
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
    
    public static int[][] extrairCanalR(rgb matriz[][], int i, int j){
        int imagem[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC] = matriz[aL][aC].getR();
            }
        
        return imagem;
    }
    
    public static int[][] extrairCanalG(rgb matriz[][], int i, int j){
        int imagem[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC] = matriz[aL][aC].getG();
            }
        
        return imagem;
    }
    
    public static int[][] extrairCanalB(rgb matriz[][], int i, int j){
        int imagem[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                imagem[aL][aC] = matriz[aL][aC].getB();
            }
        
        return imagem;
    }
    
}
