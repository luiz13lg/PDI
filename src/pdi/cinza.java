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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class cinza {
    public static int[][] lerCinza(String localArq, int l, int c) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(localArq));
        int matriz[][] = new int[l][c];
        
        br.readLine(); //Linha P2
        String linha = br.readLine(); //Possível comentário

        if(linha.charAt(0) == '#') //Se comentário
            br.readLine(); // Lê: Largura - Altura
        
        br.readLine(); //maior valor
        
        for(int aL = 0; aL < l; aL++)
            for(int aC = 0; aC < c; aC++)
                matriz[aL][aC] = Integer.valueOf(br.readLine());
        
        return matriz;
    }
   
        
    public static int[] tamMatriz(String localArq) throws FileNotFoundException, IOException{
        int tam[] = new int[2];
        
        BufferedReader br;
        
        br = new BufferedReader(new FileReader(localArq));
                                                                // leitura cabecalho
        String valoresLinha = br.readLine();                    // . tipo do arquivo
        valoresLinha = br.readLine();                           // . comentario
        valoresLinha = br.readLine();                           // . tamanho da imagem
        String valoresQuebrado[] = valoresLinha.split(" ");     // obtendo tamanho da imagem
        
        tam[1] = Integer.valueOf(valoresQuebrado[0]);           // coluna
        tam[0] = Integer.valueOf(valoresQuebrado[1]);           // linha

        br.close();

        return tam;
    }
        
    public static boolean salvarMatriz(int[][] m,int i, int j, String SalvarArq) throws FileNotFoundException, IOException{
        OutputStream salvar = new FileOutputStream(SalvarArq);
        
        String cabecalho = "P2\n#CREATOR: LUIZ G THOMAZ\n"+j+" "+i+"\n255\n";
        byte[] salvando = cabecalho.getBytes();
        salvar.write(salvando); //escrevendo cabecalho do arq

        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                salvando =  String.valueOf(m[aL][aC]).getBytes();
                salvar.write(salvando);
                salvando =  "\n".getBytes();
                salvar.write(salvando);
            }
        
        salvar.close();
        
        return true;
    }
         
    public static int[][] girarNovGraus(int matriz[][], int i, int j){
        int giro[][] = new int[j][i];
        
        int linha = i-1;
        
        for(int auxL = 0; auxL < i ; auxL++, linha--)
            for(int auxC = 0; auxC < j; auxC++)
                giro[auxC][linha] = matriz[auxL][auxC];
        
        return giro;
    }
    
    public static int[][] binarizarMatriz(int matriz[][], int i, int j, int k){;
        int imagem[][] = new int[i][j];
        
        for(int auxL = 0; auxL < i; auxL++)
            for(int auxC = 0; auxC < j; auxC++)
                if(matriz[auxL][auxC] >= k)
                    imagem[auxL][auxC] = 255;
                else imagem[auxL][auxC] = 0;
        
        return imagem;
    }   
    
    public static int[][] flipMatriz(int matriz[][], int i, int j, int mod){
        int imagem[][] = new int[i][j];
        
        if(mod == 0)
            for(int auxL = 0; auxL < i; auxL++)
                for(int auxC = 0; auxC < j; auxC++)
                    imagem[i-1-auxL][auxC] = matriz[auxL][auxC];
        else
            for(int auxC = 0; auxC < j; auxC++)
                for(int auxL = 0; auxL < i; auxL++)
                    imagem[auxL][j-1-auxC] = matriz[auxL][auxC];
        
        return imagem;
    }
    
    public static int[][] binarizacaoSeletiva(int matriz[][], int i, int j, int A, int B, int tomClaro, int tomEscuro){
        int imagem[][] = new int[i][j];
        
        for(int auxL = 0; auxL < i; auxL++)
                for(int auxC = 0; auxC < j; auxC++)
                    if((matriz[auxL][auxC] < A)||(matriz[auxL][auxC] > B))
                        imagem[auxL][auxC] = tomEscuro;
                    else imagem[auxL][auxC] = tomClaro;
        
        return imagem;
    }
     
    public static int[][] destacarPonto(int matriz[][], int i, int j, int A, int B, int tomClaro){
        int imagem[][] = new int[i][j];
        
        for(int auxL = 0; auxL < i; auxL++)
                for(int auxC = 0; auxC < j; auxC++)
                    if((matriz[auxL][auxC] < A)||(matriz[auxL][auxC] > B))
                        imagem[auxL][auxC] = matriz[auxL][auxC];
                    else imagem[auxL][auxC] = tomClaro;
        
        return imagem;
    }
    
    public static int[][] gama(int matriz[][], int i, int j, float c, float g){
        int imagem[][] = new int[i][j];
        
        for(int auxL = 0; auxL < i; auxL++)
                for(int auxC = 0; auxC < j; auxC++){
                    imagem[auxL][auxC] = (int)((c*Math.pow(matriz[auxL][auxC]/255.0,g))*255);
                }
        return imagem;
    }
    
    public static int[][] log(int matriz[][], int i, int j, int r, int c){
        int imagem[][] = new int[i][j];
        
        for(int auxL = 0; auxL < i; auxL++)
                for(int auxC = 0; auxC < j; auxC++)
                    imagem[auxL][auxC] = (int)(c*Math.log(1+(float)matriz[auxL][auxC]/255)*255);
        
        return imagem;
    }
    
    public static int[][] zoomIn(int matriz[][], int i, int j){
        int imagem[][] = new int[i*2][j*2];
        
        for(int auxL = 0, aL = 0; auxL < i; auxL++, aL = aL+2)
                for(int auxC = 0, aC = 0; auxC < j; auxC++, aC = aC+2){
                    imagem[aL][aC] = matriz[auxL][auxC];
                    imagem[aL+1][aC] = matriz[auxL][auxC];
                    imagem[aL][aC+1] = matriz[auxL][auxC];
                    imagem[aL+1][aC+1] = matriz[auxL][auxC];
                }
        
        return imagem;
    }
    
    public static int[][] zoomOut(int matriz[][], int i, int j){
        int imagem[][] = new int[i/2][j/2];
        
        for(int auxL = 0, aL = 0; auxL < i; auxL=auxL+2, aL++)
                for(int auxC = 0, aC = 0; auxC < j; auxC=auxC+2, aC++)
                    imagem[aL][aC] = (matriz[auxL][auxC]+matriz[auxL+1][auxC]+matriz[auxL][auxC+1]+matriz[auxL+1][auxC+1])/4;
        
        return imagem;
    }
    
    public static int[][] eqReta(int matriz[][], int i, int j, int min, int max){
        int imagem[][] = new int [i][j];
        
        float a = (float) (max-min)/255;
        float b = (float) (max - 255.0*a);
        
        for(int auxL = 0; auxL < i; auxL++)
            for(int auxC = 0; auxC < j; auxC++){
                if(matriz[auxL][auxC] < min) matriz[auxL][auxC] = 0;
                else if(matriz[auxL][auxC] > max) matriz[auxL][auxC] = 255;
                    else imagem[auxL][auxC] = (int) (a*matriz[auxL][auxC]+b);
            }
        return imagem;
    }  
        
    public static int[][] filtro(int matriz[][], int i, int j, int tamFiltro){
        int imagem[][] = clonar(matriz, i, j);
        int auxSoma = 0;
        int auxTamFiltro = tamFiltro/2;
        int media = tamFiltro*tamFiltro;
                
        int auxI = i-auxTamFiltro;
        int auxJ = j-auxTamFiltro;
        
        for(int auxL = auxTamFiltro; auxL < auxI; auxL++)           //iterando sob a imagem
            for(int auxC = auxTamFiltro; auxC < auxJ; auxC++){
                for(int filtroL = 0; filtroL < tamFiltro; filtroL++) //iterando sob o filtro
                    for(int filtroC = 0; filtroC < tamFiltro; filtroC++)
                        auxSoma += matriz[auxL+filtroL-auxTamFiltro][auxC+filtroC-auxTamFiltro];    //soma dos valores dentro do filtro
                imagem[auxL][auxC] = (int)(auxSoma/media);  //dividindo pela media
                auxSoma = 0;
            }
        return imagem;
    }
    
    public static int[][] iniciaFiltro(int tamFiltro){
        int matriz[][] = new int[tamFiltro][tamFiltro];
        
        for(int l = 0; l < tamFiltro; l++)
            for(int c = 0; c < tamFiltro; c++)
                matriz[l][c] = 1;
        
        return matriz;
    }

    public static int[][] filtroMediana(int matriz[][], int i, int j, int tamanho){
        int imagem[][] = clonar(matriz, i, j);
        ArrayList <Integer> aux = new ArrayList<>();
        

        int valorCentral = (tamanho*tamanho)/2; //para pegar o valor central do array
        
        int auxTamFiltro = tamanho/2;           //para trabalhar com as bordas
        int auxI = i-auxTamFiltro;              //até onde posso ir da altura
        int auxJ = j-auxTamFiltro;              //até onde posso ir da largura
        
        for(int auxL = auxTamFiltro; auxL < auxI; auxL++)           //iterando sob a imagem
            for(int auxC = auxTamFiltro; auxC < auxJ; auxC++){
                for(int filtroL = 0; filtroL < tamanho; filtroL++) //iterando sob o filtro
                    for(int filtroC = 0; filtroC < tamanho; filtroC++)
                        aux.add(matriz[auxL+filtroL-auxTamFiltro][auxC+filtroC-auxTamFiltro]);
                Collections.sort(aux);
                imagem[auxL][auxC] = aux.get(valorCentral);  //pegando valor central do array
                aux.clear();
            }
        
        return imagem;
    }

    public static int[][] filtroLaplaciano(int matriz[][], int i, int j){
        int imagem[][] = new int[i][j];
        
        for(int auxL = 1; auxL < i-1; auxL++)
            for(int auxC = 1; auxC < j-1; auxC++)
                imagem[auxL][auxC] = -1*(matriz[auxL][auxC+1] + matriz[auxL][auxC-1] + matriz[auxL+1][auxC] + matriz[auxL-1][auxC] - 4*matriz[auxL][auxC]);   //central
        
        return imagem;
    }
    
    public static int[][] negativo(int matriz[][], int i, int j){
        int imagem[][] = new int[i][j];
        
        for(int auxL = 0; auxL < i; auxL++)
            for(int auxC = 0; auxC < j; auxC++)
                imagem[auxL][auxC] = 255 - matriz[auxL][auxC];
        
        return imagem;
    }
        
    public static int[][] somarPerMatriz(int m1[][], int i, int j, float p){
        int mR[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++)
                if((m1[aL][aC] * p) > 255) mR[aL][aC] = 255;
                    else if ((m1[aL][aC] * p) < 0) mR[aL][aC] = 0;
                    else mR[aL][aC] = (int)(m1[aL][aC] * p);
        return mR;
    }
    
    public static int[][] somarValorMatriz(int m1[][], int i, int j, int valor){
        int mR[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++)
                if((m1[aL][aC] + valor) > 255) mR[aL][aC] = 255;
                    else mR[aL][aC] = (int)(m1[aL][aC] + valor);
        return mR;
    }
    
    public static int[][] subValorMatriz(int m1[][], int i, int j, int valor){
        int mR[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++)
                if((m1[aL][aC] - valor) < 0) mR[aL][aC] = 0;
                    else mR[aL][aC] = (int)(m1[aL][aC] - valor);
        return mR;
    }
    
    public static int[][] somarMatriz(int m1[][], int m2[][],int i,int j){
        int mR[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++)
                if(m1[aL][aC] + m2[aL][aC] >= 255) mR[aL][aC] = m1[aL][aC];
                else if(m1[aL][aC] + m2[aL][aC] <= 0) mR[aL][aC] = m1[aL][aC];
                    else mR[aL][aC] = m1[aL][aC] + m2[aL][aC];
        return mR;
    }

    public static int[][] somar(int m1[][], int m2[][],int i,int j){
        int mR[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++)
                if(m1[aL][aC] + m2[aL][aC] >= 255) mR[aL][aC] = 255;
                else if(m1[aL][aC] + m2[aL][aC] <= 0) mR[aL][aC] = 0;
                    else mR[aL][aC] = m1[aL][aC] + m2[aL][aC];
        return mR;
    }

    public static int[][] subMatriz(int m1[][], int m2[][],int i,int j){
        int mR[][] = new int[i][j];
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++)
                if(m1[aL][aC] - m2[aL][aC] < 0) mR[aL][aC] = 0;
                    else mR[aL][aC] = m1[aL][aC] - m2[aL][aC];
        return mR;
    }
    
    public static void imprimirMatriz(int m[][], int i, int j){
        for(int aL = 0; aL < i; aL++){
            //System.out.print("|  ");
            for(int aC = 0; aC < j; aC++)
                System.out.print(m[aL][aC]+"\n");
            //System.out.println("  |");
        }
    }
    
    public static int [][] iniciarMatriz(int i, int j){
        int m[][] = new int[i][j];
        Scanner s = new Scanner(System.in);
        
        for(int aL = 0; aL < i; aL++)
            for(int aC = 0; aC < j; aC++){
                System.out.print("Valor de entrada ["+(aL+1)+"]["+(aC+1)+"] > ");
                m[aL][aC] = s.nextInt();
            }
        
        return m;
    }
    
    private static int[][] clonar(int matriz[][], int i, int j){
        int retorno[][] = new int[i][j];
        
        for(int auxL = 0; auxL < i; auxL++)
            System.arraycopy(matriz[auxL], 0, retorno[auxL], 0, j);
        
        return retorno;
    }
    
    public static int[] histograma(int matriz[][], int i, int j){
        int histograma[] = new int[255];
        
        for(int auxL = 0, aL = 0; auxL < i; auxL=auxL+2, aL++)
                for(int auxC = 0, aC = 0; auxC < j; auxC=auxC+2, aC++)
                    histograma[matriz[auxL][auxC]]++;
        
        return histograma;
    }
    
    public static boolean salvarHistograma(int[] histograma, String SalvarHistograma) throws FileNotFoundException, IOException{
        try (OutputStream salvar = new FileOutputStream(SalvarHistograma)) {
            byte[] salvando;
            for(int aux = 0; aux < histograma.length; aux++){
                salvando =  String.valueOf(histograma[aux]+" \n").getBytes();
                salvar.write(salvando);
            }
        }
        return true;
    }
    
    public static int[][] equalizacaoGlobal(int[][] matriz, int i, int j){
        int[][] imagem = new int[i][j];
        float[] histograma = new float[256];
        float pAcumulada = 0;
        
//        obtendo histograma
        for(int auxL = 0; auxL < i; auxL++)
            for(int auxC = 0; auxC < j; auxC++)
                histograma[matriz[auxL][auxC]]++;
        
        for(int aux = 0; aux < 256; aux++){
            histograma[aux] = histograma[aux]/(i*j);
            pAcumulada += histograma[aux];
            histograma[aux] = pAcumulada*254;
        }
        
        for(int auxL = 0; auxL < i; auxL++)
            for(int auxC = 0; auxC < j; auxC++)
                imagem[auxL][auxC] = (int) histograma[matriz[auxL][auxC]];
        
        return imagem;
    }
}
