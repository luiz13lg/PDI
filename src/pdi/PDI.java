/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Luiz
 */

public class PDI {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int tam[];
        rgb matrizRGB[][];
        rgb matrizResulRGB[][];
        int matriz[][];
        int matriz2[][];
        int matrizTrans[][];
        int matrizResul[][];
        int histograma[];
        int media;
        int tamFiltro;
        
        String AbrirArq = "C:\\Users\\cc151255911\\Desktop\\lenna.ppm";
        String SalvarArq = "C:\\Users\\cc151255911\\Desktop\\modificado.pgm";
        String SalvarHistograma = "E:\\histograma.txt";
        
        tam = cinza.tamMatriz(AbrirArq);
        
        matrizRGB = rgb.leituraRGB(tam[0], tam[1], AbrirArq);
        matrizResul = rgb.getCanalB(matrizRGB,tam[0],tam[1]);
        
        cinza.salvarMatriz(matrizResul,tam[0],tam[1], SalvarArq);
    }

    public static int[][] matTrans(int i, int j, int valor){   //inicia a matriz para operacao
        int matriz[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                matriz[aL][aC] = valor;
            }
        
        return matriz;
    }
    
    public static boolean salvarHistograma(int[] histograma, String SalvarHistograma) throws FileNotFoundException, IOException{
        OutputStream salvar = new FileOutputStream(SalvarHistograma);
        
        byte[] salvando;
        for(int aux = 0; aux < histograma.length; aux++){
            salvando =  String.valueOf(histograma[aux]+" \n").getBytes();            
            salvar.write(salvando);
        }
        
        salvar.close();
        return true;
    }

    public static int[] histograma(int matriz[][], int i, int j){
        int histograma[] = new int[255];
        
        for(int auxL = 0, aL = 0; auxL < i; auxL=auxL+2, aL++)
                for(int auxC = 0, aC = 0; auxC < j; auxC=auxC+2, aC++)
                    histograma[matriz[auxL][auxC]]++;
        
        return histograma;
    }

}
