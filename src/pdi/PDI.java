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

//        String AbrirArq = "C:\\Users\\cc151255911\\Desktop\\placa_circuito.pgm";
//        C:\Users\cc151255911\Desktop\placa_circuito.pgm
//        String SalvarArq = "C:\\Users\\cc151255911\\Desktop\\resultado.pgm";
        
//        tam = cinza.tamMatriz(AbrirArq);
//        
//        matriz = cinza.lerCinza(AbrirArq, tam[0], tam[1]);
//        matrizResul = cinza.medianaFiltro(matriz, tam[0], tam[1]);
        
//        cinza.salvarMatriz(matrizResul,tam[0],tam[1], SalvarArq);
    }

    public static int[][] matTrans(int i, int j, int valor){   //inicia a matriz para operacao
        int matriz[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                matriz[aL][aC] = valor;
            }
        
        return matriz;
    }
    

}
