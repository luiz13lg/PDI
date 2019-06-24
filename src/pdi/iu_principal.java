/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz
 */
public class iu_principal extends javax.swing.JFrame {
    
    public BufferedImage imagem_ppm;
    public BufferedImage imagem_pgm;
    
    private int matrizCinza[][];
    private rgb matrizRGB[][];
    
    private int matrizCinzaNova[][];
    private rgb matrizRGBNova[][];
    
    private int altura, largura;
    private int alturaNova, larguraNova;
    private boolean pgmPPM; //se pgm 0 senao 1 (ppm)
    int imagemCinza[][];
    rgb imagemRGB[][];
    int tamanho[];
    
    /**
     * Creates new form iu_principal
     */
    public iu_principal() {
        initComponents();
        
        menuCinza_.setEnabled(false);
        menuRGB_.setEnabled(false);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel_imagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrirImagem_ = new javax.swing.JMenuItem();
        salvar_ = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        restaurar_ = new javax.swing.JMenuItem();
        menuRGB_ = new javax.swing.JMenu();
        reduzCanalR = new javax.swing.JMenuItem();
        reduzCanalG = new javax.swing.JMenuItem();
        reduzCanalB = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        extrairCanalR = new javax.swing.JMenuItem();
        extrairCanalG = new javax.swing.JMenuItem();
        extrairCanalB = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        inverterCanais_ = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuCinza_ = new javax.swing.JMenu();
        gerarHistograma_ = new javax.swing.JMenuItem();
        equalizacaoGlobal_ = new javax.swing.JMenuItem();
        media_ = new javax.swing.JMenuItem();
        mediana_ = new javax.swing.JMenuItem();
        girar90_ = new javax.swing.JMenuItem();
        binarizar_ = new javax.swing.JMenuItem();
        zoomIn_ = new javax.swing.JMenuItem();
        zommOut_ = new javax.swing.JMenuItem();
        laplaciano_ = new javax.swing.JMenuItem();
        clarear_ = new javax.swing.JMenuItem();
        escurecer_ = new javax.swing.JMenuItem();
        negativo_ = new javax.swing.JMenuItem();
        subOriginal_ = new javax.swing.JMenuItem();
        somarOriginal_ = new javax.swing.JMenuItem();
        highboost_ = new javax.swing.JMenuItem();
        nitidez_ = new javax.swing.JMenuItem();
        gama_ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setViewportView(jLabel_imagem);

        jMenu1.setText("Arquivo");

        abrirImagem_.setText("Abrir");
        abrirImagem_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirImagem_ActionPerformed(evt);
            }
        });
        jMenu1.add(abrirImagem_);

        salvar_.setText("Salvar");
        salvar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_ActionPerformed(evt);
            }
        });
        jMenu1.add(salvar_);
        jMenu1.add(jSeparator3);

        restaurar_.setText("Restaurar Imagem");
        restaurar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurar_ActionPerformed(evt);
            }
        });
        jMenu1.add(restaurar_);

        jMenuBar1.add(jMenu1);

        menuRGB_.setText("RGB");

        reduzCanalR.setText("Reduzir Canal R");
        reduzCanalR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduzCanalRActionPerformed(evt);
            }
        });
        menuRGB_.add(reduzCanalR);

        reduzCanalG.setText("Reduzir Canal G");
        reduzCanalG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduzCanalGActionPerformed(evt);
            }
        });
        menuRGB_.add(reduzCanalG);

        reduzCanalB.setText("Reduzir Canal B");
        reduzCanalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduzCanalBActionPerformed(evt);
            }
        });
        menuRGB_.add(reduzCanalB);
        menuRGB_.add(jSeparator1);

        extrairCanalR.setText("Extrair Canal R");
        extrairCanalR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrairCanalRActionPerformed(evt);
            }
        });
        menuRGB_.add(extrairCanalR);

        extrairCanalG.setText("Extrair Canal G");
        extrairCanalG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrairCanalGActionPerformed(evt);
            }
        });
        menuRGB_.add(extrairCanalG);

        extrairCanalB.setText("Extrair Canal B");
        extrairCanalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrairCanalBActionPerformed(evt);
            }
        });
        menuRGB_.add(extrairCanalB);
        menuRGB_.add(jSeparator4);

        inverterCanais_.setText("Inverter Canais");
        inverterCanais_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverterCanais_ActionPerformed(evt);
            }
        });
        menuRGB_.add(inverterCanais_);
        menuRGB_.add(jSeparator2);

        jMenuBar1.add(menuRGB_);

        menuCinza_.setText("Cinza");

        gerarHistograma_.setText("Gerar Histograma");
        gerarHistograma_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarHistograma_ActionPerformed(evt);
            }
        });
        menuCinza_.add(gerarHistograma_);

        equalizacaoGlobal_.setText("Equalização Global");
        equalizacaoGlobal_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalizacaoGlobal_ActionPerformed(evt);
            }
        });
        menuCinza_.add(equalizacaoGlobal_);

        media_.setText("Média (3x3, 5x5, ...)");
        media_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                media_ActionPerformed(evt);
            }
        });
        menuCinza_.add(media_);

        mediana_.setText("Mediana (3x3, 5x5, ...)");
        mediana_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediana_ActionPerformed(evt);
            }
        });
        menuCinza_.add(mediana_);

        girar90_.setText("Girar 90º");
        girar90_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girar90_ActionPerformed(evt);
            }
        });
        menuCinza_.add(girar90_);

        binarizar_.setText("Binarizar");
        binarizar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarizar_ActionPerformed(evt);
            }
        });
        menuCinza_.add(binarizar_);

        zoomIn_.setText("Zoom In");
        zoomIn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomIn_ActionPerformed(evt);
            }
        });
        menuCinza_.add(zoomIn_);

        zommOut_.setText("Zoom Out");
        zommOut_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zommOut_ActionPerformed(evt);
            }
        });
        menuCinza_.add(zommOut_);

        laplaciano_.setText("Laplaciano");
        laplaciano_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laplaciano_ActionPerformed(evt);
            }
        });
        menuCinza_.add(laplaciano_);

        clarear_.setText("Clarear (soma)");
        clarear_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clarear_ActionPerformed(evt);
            }
        });
        menuCinza_.add(clarear_);

        escurecer_.setText("Escurecer (subtrair)");
        escurecer_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escurecer_ActionPerformed(evt);
            }
        });
        menuCinza_.add(escurecer_);

        negativo_.setText("Negativo");
        negativo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativo_ActionPerformed(evt);
            }
        });
        menuCinza_.add(negativo_);

        subOriginal_.setText("Subtrair da Original");
        subOriginal_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subOriginal_ActionPerformed(evt);
            }
        });
        menuCinza_.add(subOriginal_);

        somarOriginal_.setText("Somar à Original");
        somarOriginal_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somarOriginal_ActionPerformed(evt);
            }
        });
        menuCinza_.add(somarOriginal_);

        highboost_.setText("Highboost");
        highboost_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highboost_ActionPerformed(evt);
            }
        });
        menuCinza_.add(highboost_);

        nitidez_.setText("Máscara de Nitidez");
        nitidez_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitidez_ActionPerformed(evt);
            }
        });
        menuCinza_.add(nitidez_);

        gama_.setText("Correção Gama");
        gama_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gama_ActionPerformed(evt);
            }
        });
        menuCinza_.add(gama_);

        jMenuBar1.add(menuCinza_);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirImagem_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirImagem_ActionPerformed
        JFileChooser jfc = new JFileChooser();
        String medidas[];
        int retorno = jfc.showOpenDialog(null);
        if(retorno == JFileChooser.APPROVE_OPTION){
            File aux = jfc.getSelectedFile();

            String a[] = aux.getAbsolutePath().split("\\.");

            if("ppm".equals(a[a.length-1])){
                menuCinza_.setEnabled(false);
                pgmPPM = true;
                try{
                    FileInputStream stream = new FileInputStream(aux.getAbsolutePath());
                    InputStreamReader reader = new InputStreamReader(stream);
                    BufferedReader br = new BufferedReader(reader);

                    //Lendo cabeçalho
                    String linha = br.readLine(); //Linha P2
                    linha = br.readLine(); //Possível comentário
                    
                    if(linha.charAt(0) == '#') //Se comentário
                        linha = br.readLine(); // Lê: Largura - Altura

                    medidas = linha.split(" ");
                    larguraNova = largura = Integer.parseInt(medidas[0]);
                    alturaNova = altura = Integer.parseInt(medidas[1]);

                    br.readLine();  //lendo maior valor
                    matrizRGB = rgb.leituraRGB(aux.getAbsolutePath(), altura, largura);
                    matrizRGBNova = matrizRGB.clone();
                    
                    exibirImagemRGB(matrizRGB);
                    menuRGB_.setEnabled(true);
                    }   catch (FileNotFoundException ex) {
                            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
            }else if("pgm".equals(a[a.length-1])){
                menuRGB_.setEnabled(false);
                pgmPPM = false;
                try{
                    FileInputStream stream = new FileInputStream(aux.getAbsolutePath());
                    InputStreamReader reader = new InputStreamReader(stream);
                    BufferedReader br = new BufferedReader(reader);
                    
                    //Lendo cabeçalho
                    String linha = br.readLine(); //Linha P2
                    linha = br.readLine(); //Possível comentário
                    
                    if(linha.charAt(0) == '#') //Se comentário
                        linha = br.readLine(); // Lê: Largura - Altura

                    medidas = linha.split(" ");
                    larguraNova = largura = Integer.parseInt(medidas[0]);
                    alturaNova = altura = Integer.parseInt(medidas[1]);

                    br.readLine();  //lendo maior valor
                    matrizCinza = cinza.lerCinza(aux.getAbsolutePath(), altura, largura);
                    matrizCinzaNova = matrizCinza.clone();
                       
                    exibirImagemCinza(matrizCinza);
                    menuCinza_.setEnabled(true);
                }catch (FileNotFoundException ex) {
                            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Extensão de arquivo inválida!");
            }
        }
    }//GEN-LAST:event_abrirImagem_ActionPerformed

    private void gerarHistograma_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarHistograma_ActionPerformed
        int hist[] = cinza.histograma(matrizCinzaNova, alturaNova, larguraNova);
        
        JFileChooser salvandoArquivo = new JFileChooser();
        int resultado = salvandoArquivo.showSaveDialog(this);
        
        if (resultado != JFileChooser.APPROVE_OPTION) return;
        
        File salvarArquivoEscolhido = salvandoArquivo.getSelectedFile();
        
        try {
            cinza.salvarHistograma(hist, salvarArquivoEscolhido.getPath());
        } catch (IOException ex) {
            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gerarHistograma_ActionPerformed

    private void reduzCanalRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduzCanalRActionPerformed
        int valor = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor a ser reduzido"));
        
        matrizRGBNova = rgb.reduzirCanalR(matrizRGBNova, alturaNova, larguraNova, valor);
        
        exibirImagemRGB(matrizRGBNova);
    }//GEN-LAST:event_reduzCanalRActionPerformed

    private void reduzCanalGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduzCanalGActionPerformed
        int valor = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor a ser reduzido"));
        
        matrizRGBNova = rgb.reduzirCanalG(matrizRGBNova, alturaNova, larguraNova, valor);
        
        exibirImagemRGB(matrizRGBNova);
    }//GEN-LAST:event_reduzCanalGActionPerformed

    private void reduzCanalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduzCanalBActionPerformed
        int valor = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor a ser reduzido"));
        
        matrizRGBNova = rgb.reduzirCanalB(matrizRGBNova, alturaNova, larguraNova, valor);
        
        exibirImagemRGB(matrizRGBNova);
    }//GEN-LAST:event_reduzCanalBActionPerformed

    private void extrairCanalRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrairCanalRActionPerformed
        int auxCinza[][];
        
        auxCinza = rgb.extrairCanalR(imagemRGB,tamanho[0],tamanho[1]);
        
        try {
            cinza.salvarMatriz(auxCinza, tamanho[0], tamanho[1], "C:\\novaImagem.pgm");
        } catch (IOException ex) {
            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_extrairCanalRActionPerformed

    private void extrairCanalGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrairCanalGActionPerformed
        int auxCinza[][];
        
        auxCinza = rgb.extrairCanalG(imagemRGB,tamanho[0],tamanho[1]);
        
        try {
            cinza.salvarMatriz(auxCinza, tamanho[0], tamanho[1], "C:\\novaImagem.pgm");
        } catch (IOException ex) {
            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_extrairCanalGActionPerformed

    private void extrairCanalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrairCanalBActionPerformed
        int auxCinza[][];
        
        auxCinza = rgb.extrairCanalB(imagemRGB,tamanho[0],tamanho[1]);
        
        try {
            cinza.salvarMatriz(auxCinza, tamanho[0], tamanho[1], "C:\\novaImagem.pgm");
        } catch (IOException ex) {
            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_extrairCanalBActionPerformed

    private void restaurar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurar_ActionPerformed
        int r,g,b, rgb;
        
        if(pgmPPM){
            for(int i = 0; i < altura; i++)
                for(int j = 0; j < largura; j++){
                    r = matrizRGB[i][j].getR(); // lendo r
                    g = matrizRGB[i][j].getG(); // lendo g
                    b = matrizRGB[i][j].getB(); // lendo b

                    Color myColor = new Color(r,g,b);
                    rgb = myColor.getRGB();

                    imagem_ppm.setRGB(j, i, rgb);
            }
            jScrollPane1.setSize(imagem_ppm.getWidth()+80, imagem_ppm.getHeight()+80);           
            setSize(imagem_ppm.getWidth()+80, imagem_ppm.getHeight()+110);        
            jLabel_imagem.setIcon(new ImageIcon(imagem_ppm));

            matrizRGBNova = matrizRGB.clone();
            alturaNova = altura;
            larguraNova = largura;

        }else{
            imagem_pgm = new BufferedImage(largura, altura, BufferedImage.TYPE_BYTE_GRAY);
            WritableRaster raster = imagem_pgm.getRaster();
            int num;

            for(int i = 0; i < altura; i++)
                for(int j = 0; j < largura; j++){
                    num = matrizCinza[i][j];
                    raster.setSample(j, i, 0, num);
            }
            jScrollPane1.setSize(imagem_pgm.getWidth()+80, imagem_pgm.getHeight()+80);           
            setSize(imagem_pgm.getWidth()+80, imagem_pgm.getHeight()+110);        
            jLabel_imagem.setIcon(new ImageIcon(imagem_pgm));
            
            matrizCinzaNova = matrizCinza.clone();            
            alturaNova = altura;
            larguraNova = largura;

        }        
    }//GEN-LAST:event_restaurar_ActionPerformed

    private void exibirImagemRGB(rgb[][] matriz){
        imagem_ppm = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);
        int r,g,b,rgb;

        for(int i = 0; i < altura; i++)
            for(int j = 0; j < largura; j++){
                r = matriz[i][j].getR();
                g = matriz[i][j].getG();
                b = matriz[i][j].getB();

                Color myColor = new Color(r,g,b);
                rgb = myColor.getRGB();

                imagem_ppm.setRGB(j, i, rgb);
        }

        jScrollPane1.setSize(imagem_ppm.getWidth()+80, imagem_ppm.getHeight()+80);            
        setSize(imagem_ppm.getWidth()+80, imagem_ppm.getHeight()+110);        
        jLabel_imagem.setIcon(new ImageIcon(imagem_ppm));
    }
    
    private void exibirImagemCinza(int matriz[][]){ 
        imagem_pgm = new BufferedImage(larguraNova, alturaNova, BufferedImage.TYPE_BYTE_GRAY);
        WritableRaster raster = imagem_pgm.getRaster();
        int num;

        for(int i = 0; i < alturaNova; i++)
            for(int j = 0; j < larguraNova; j++){
                num = matriz[i][j];
                raster.setSample(j, i, 0, num);
        }
        jScrollPane1.setSize(imagem_pgm.getWidth()+80, imagem_pgm.getHeight()+80);           
        setSize(imagem_pgm.getWidth()+80, imagem_pgm.getHeight()+110);        
        jLabel_imagem.setIcon(new ImageIcon(imagem_pgm));
    }
    
    private void salvar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_ActionPerformed
        if(pgmPPM){ //salvando imagem ppm
            
        }else{      //salvando imagem pgm
            JFileChooser salvandoArquivo = new JFileChooser();
            int resultado = salvandoArquivo.showSaveDialog(this);

            if (resultado != JFileChooser.APPROVE_OPTION) return;

            File salvarArquivoEscolhido = salvandoArquivo.getSelectedFile();
            File salvarArquivo = new File(salvarArquivoEscolhido.getPath()+".pgm");

            try {
                cinza.salvarMatriz(matrizCinzaNova, alturaNova, larguraNova, salvarArquivo.getPath());
                
            } catch (IOException ex) {
                Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_salvar_ActionPerformed

    private void laplaciano_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laplaciano_ActionPerformed
        matrizCinzaNova = cinza.filtroLaplaciano(matrizCinzaNova, alturaNova, larguraNova);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_laplaciano_ActionPerformed

    private void girar90_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girar90_ActionPerformed
        int aux;
        matrizCinzaNova = cinza.girarNovGraus(matrizCinzaNova, alturaNova, larguraNova);
        aux = alturaNova;
        alturaNova = larguraNova;
        larguraNova = aux;
        
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_girar90_ActionPerformed

    private void zoomIn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomIn_ActionPerformed
        matrizCinzaNova = cinza.zoomIn(matrizCinzaNova, alturaNova, larguraNova);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_zoomIn_ActionPerformed

    private void zommOut_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zommOut_ActionPerformed
        matrizCinzaNova = cinza.zoomOut(matrizCinzaNova, alturaNova, larguraNova);
        alturaNova = alturaNova/2;
        larguraNova = larguraNova/2;
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_zommOut_ActionPerformed

    private void binarizar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarizar_ActionPerformed
        int valor = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Insira valor separador:"));
        
        matrizCinzaNova = cinza.binarizarMatriz(matrizCinzaNova, alturaNova, larguraNova, valor);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_binarizar_ActionPerformed

    private void media_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_media_ActionPerformed
        int valor = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Insira o tamanho do filtro (YxY):"));
 
        matrizCinzaNova = cinza.filtro(matrizCinzaNova.clone(), alturaNova, larguraNova, valor);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_media_ActionPerformed

    private void mediana_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediana_ActionPerformed
        int valor = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Insira o tamanho do filtro (YxY):"));
 
        matrizCinzaNova = cinza.filtroMediana(matrizCinzaNova.clone(), alturaNova, larguraNova, valor);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_mediana_ActionPerformed

    private void clarear_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clarear_ActionPerformed
        int valor = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Insira o valor a ser subtraido:"));
        
        while(valor < 0)
            valor = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Insira a ser incrementado:"));
        
        matrizCinzaNova = cinza.somarValorMatriz(matrizCinzaNova, alturaNova, larguraNova, valor);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_clarear_ActionPerformed

    private void escurecer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escurecer_ActionPerformed
        int valor = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Insira o tamanho do filtro (YxY):"));
        
        while(valor < 0)
            valor = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Insira o valor a ser subtraido:"));
        
        matrizCinzaNova = cinza.subValorMatriz(matrizCinzaNova, alturaNova, larguraNova, valor);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_escurecer_ActionPerformed

    private void negativo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativo_ActionPerformed
        matrizCinzaNova = cinza.negativo(matrizCinzaNova, altura, largura);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_negativo_ActionPerformed

    private void subOriginal_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subOriginal_ActionPerformed
        matrizCinzaNova = cinza.subMatriz(matrizCinza, matrizCinzaNova, alturaNova, larguraNova);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_subOriginal_ActionPerformed

    private void somarOriginal_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somarOriginal_ActionPerformed
        matrizCinzaNova = cinza.somarMatriz(matrizCinza, matrizCinzaNova, alturaNova, larguraNova);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_somarOriginal_ActionPerformed

    private void highboost_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highboost_ActionPerformed
        //g(x,y) = f(x,y) - s(x,y)
            int valor = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Insira o tamanho do filtro da média (YxY):"));
            matrizCinzaNova = cinza.filtro(matrizCinzaNova.clone(), alturaNova, larguraNova, valor);
            matrizCinzaNova = cinza.subMatriz(matrizCinza, matrizCinzaNova, alturaNova, larguraNova);

        //k
        float valor2 = Float.valueOf(JOptionPane.showInputDialog(rootPane, "Insira o limiar:"));
        
        //k.g(x,y)
        matrizCinzaNova = cinza.somarPerMatriz(matrizCinzaNova, alturaNova, larguraNova, valor2);
        
        //h(x,y) = f(x,y) - k.g(x,y)
        matrizCinzaNova = cinza.somar(matrizCinza, matrizCinzaNova, alturaNova, larguraNova);

        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_highboost_ActionPerformed

    private void nitidez_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitidez_ActionPerformed
        int valor = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Insira o tamanho do filtro da suavização (YxY):"));

        matrizCinzaNova = cinza.filtro(matrizCinzaNova, alturaNova, larguraNova, valor);
        matrizCinzaNova = cinza.subMatriz(matrizCinza, matrizCinzaNova, alturaNova, larguraNova);
        matrizCinzaNova = cinza.somarMatriz(matrizCinza, matrizCinzaNova, alturaNova, larguraNova);
        
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_nitidez_ActionPerformed

    private void gama_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gama_ActionPerformed
        float c = Float.valueOf(JOptionPane.showInputDialog(rootPane, "Insira o valor de C:"));
        float gama = Float.valueOf(JOptionPane.showInputDialog(rootPane, "Insira o valor de gama:"));
        matrizCinzaNova = cinza.gama(matrizCinzaNova, alturaNova, larguraNova, c, gama);

        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_gama_ActionPerformed

    private void equalizacaoGlobal_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalizacaoGlobal_ActionPerformed
        matrizCinzaNova = cinza.equalizacaoGlobal(matrizCinza, alturaNova, larguraNova);
        exibirImagemCinza(matrizCinzaNova);
    }//GEN-LAST:event_equalizacaoGlobal_ActionPerformed

    private void inverterCanais_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverterCanais_ActionPerformed
        String[] opcoes = {"RBG","BRG","BGR","GRB","GBR"};
        
        String input = (String) JOptionPane.showInputDialog(null, "Escolha a inversão desejada",
        "Escolhendo Inversão", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]); 
        
        switch(input){
            case "RBG":
                matrizRGBNova = rgb.setRBG(matrizRGBNova, alturaNova, larguraNova);
                System.out.println("RBG");
                break;
            case "BRG":
                matrizRGBNova = rgb.setBRG(matrizRGBNova, alturaNova, larguraNova);
                System.out.println("BRG");                
                break;
            case "BGR":
                matrizRGBNova = rgb.setBGR(matrizRGBNova, alturaNova, larguraNova);
                System.out.println("BGR");                
                break;
            case "GRB":
                matrizRGBNova = rgb.setGRB(matrizRGBNova, alturaNova, larguraNova);
                System.out.println("GRB");                
                break;
            case "GBR":
                matrizRGBNova = rgb.setGBR(matrizRGBNova, alturaNova, larguraNova);
                System.out.println("GBR");                
                break;
        }
        
        exibirImagemRGB(matrizRGBNova);
    }//GEN-LAST:event_inverterCanais_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(iu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirImagem_;
    private javax.swing.JMenuItem binarizar_;
    private javax.swing.JMenuItem clarear_;
    private javax.swing.JMenuItem equalizacaoGlobal_;
    private javax.swing.JMenuItem escurecer_;
    private javax.swing.JMenuItem extrairCanalB;
    private javax.swing.JMenuItem extrairCanalG;
    private javax.swing.JMenuItem extrairCanalR;
    private javax.swing.JMenuItem gama_;
    private javax.swing.JMenuItem gerarHistograma_;
    private javax.swing.JMenuItem girar90_;
    private javax.swing.JMenuItem highboost_;
    private javax.swing.JMenuItem inverterCanais_;
    private javax.swing.JLabel jLabel_imagem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuItem laplaciano_;
    private javax.swing.JMenuItem media_;
    private javax.swing.JMenuItem mediana_;
    private javax.swing.JMenu menuCinza_;
    private javax.swing.JMenu menuRGB_;
    private javax.swing.JMenuItem negativo_;
    private javax.swing.JMenuItem nitidez_;
    private javax.swing.JMenuItem reduzCanalB;
    private javax.swing.JMenuItem reduzCanalG;
    private javax.swing.JMenuItem reduzCanalR;
    private javax.swing.JMenuItem restaurar_;
    private javax.swing.JMenuItem salvar_;
    private javax.swing.JMenuItem somarOriginal_;
    private javax.swing.JMenuItem subOriginal_;
    private javax.swing.JMenuItem zommOut_;
    private javax.swing.JMenuItem zoomIn_;
    // End of variables declaration//GEN-END:variables
}
