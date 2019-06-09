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
    private int altura, largura;
    private boolean pgmPPM; //se pgm 0 senao 1 (ppm)
    int imagemCinza[][];
    rgb imagemRGB[][];
    int tamanho[];
    
    /**
     * Creates new form iu_principal
     */
    public iu_principal() {
        initComponents();
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        reduzCanalR = new javax.swing.JMenuItem();
        reduzCanalG = new javax.swing.JMenuItem();
        reduzCanalB = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        extrairCanalR = new javax.swing.JMenuItem();
        extrairCanalG = new javax.swing.JMenuItem();
        extrairCanalB = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        gerarHistograma = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setViewportView(jLabel_imagem);

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Salvar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator3);

        jMenuItem2.setText("Restaurar Imagem");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("RGB");

        reduzCanalR.setText("Reduzir Canal R");
        reduzCanalR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduzCanalRActionPerformed(evt);
            }
        });
        jMenu2.add(reduzCanalR);

        reduzCanalG.setText("Reduzir Canal G");
        reduzCanalG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduzCanalGActionPerformed(evt);
            }
        });
        jMenu2.add(reduzCanalG);

        reduzCanalB.setText("Reduzir Canal B");
        reduzCanalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduzCanalBActionPerformed(evt);
            }
        });
        jMenu2.add(reduzCanalB);
        jMenu2.add(jSeparator1);

        extrairCanalR.setText("Extrair Canal R");
        extrairCanalR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrairCanalRActionPerformed(evt);
            }
        });
        jMenu2.add(extrairCanalR);

        extrairCanalG.setText("Extrair Canal G");
        extrairCanalG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrairCanalGActionPerformed(evt);
            }
        });
        jMenu2.add(extrairCanalG);

        extrairCanalB.setText("Extrair Canal B");
        extrairCanalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrairCanalBActionPerformed(evt);
            }
        });
        jMenu2.add(extrairCanalB);
        jMenu2.add(jSeparator2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cinza");

        gerarHistograma.setText("Gerar Histograma");
        gerarHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarHistogramaActionPerformed(evt);
            }
        });
        jMenu3.add(gerarHistograma);

        jMenuItem4.setText("Média (3x3, 5x5, ...)");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Girar 90º");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Binarizar");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Zoom In");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Zoom Out");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Laplaciano");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser jfc = new JFileChooser();
        String medidas[];
        int retorno = jfc.showOpenDialog(null);
        if(retorno == JFileChooser.APPROVE_OPTION){
            File aux = jfc.getSelectedFile();

            String a[] = aux.getAbsolutePath().split("\\.");

            if("ppm".equals(a[a.length-1])){
                pgmPPM = true;
                try{    
                    FileInputStream stream = new FileInputStream(aux.getAbsolutePath());
                    InputStreamReader reader = new InputStreamReader(stream);
                    BufferedReader br = new BufferedReader(reader);

                    //Lendo cabeçalho
                    String linha = br.readLine(); //Linha P2
                    linha = br.readLine(); //Comentário
                    linha = br.readLine(); //Tamanho - Largura - Altura
                    
                    medidas = linha.split(" ");
                    largura = Integer.parseInt(medidas[0]);
                    altura = Integer.parseInt(medidas[1]);

                    br.readLine();  //lendo maior valor
                    matrizRGB = rgb.leituraRGB(aux.getAbsolutePath(), Integer.parseInt(medidas[0]), Integer.parseInt(medidas[1]));

                    imagem_ppm = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);
                    int r,g,b,rgb;

                    for(int i = 0; i < altura; i++)
                        for(int j = 0; j < largura; j++){
                            r = Integer.valueOf(br.readLine()); // lendo r
                            g = Integer.valueOf(br.readLine()); // lendo g
                            b = Integer.valueOf(br.readLine()); // lendo b

                            Color myColor = new Color(r,g,b);
                            rgb = myColor.getRGB();

                            imagem_ppm.setRGB(j, i, rgb);
                    }

                    jScrollPane1.setSize(imagem_ppm.getWidth()+80, imagem_ppm.getHeight()+80);            
                    setSize(imagem_ppm.getWidth()+80, imagem_ppm.getHeight()+110);        
                    jLabel_imagem.setIcon(new ImageIcon(imagem_ppm));
                    }   catch (FileNotFoundException ex) {
                            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
            }else if("pgm".equals(a[a.length-1])){
                pgmPPM = false;
                try{
                    FileInputStream stream = new FileInputStream(aux.getAbsolutePath());
                    InputStreamReader reader = new InputStreamReader(stream);
                    BufferedReader br = new BufferedReader(reader);
                    
                    //Lendo cabeçalho
                    String linha = br.readLine(); //Linha P2
                    linha = br.readLine(); //Comentário
                    linha = br.readLine(); //Tamanho - Largura - Altura
                    
                    medidas = linha.split(" ");
                    largura = Integer.parseInt(medidas[0]);
                    altura = Integer.parseInt(medidas[1]);

                    br.readLine();  //lendo maior valor
                    matrizCinza = cinza.lerCinza(aux.getAbsolutePath(), altura, largura);
                    
                    imagem_pgm = new BufferedImage(largura, altura, BufferedImage.TYPE_BYTE_GRAY);
                    WritableRaster raster = imagem_pgm.getRaster();
                    int num;

                    for(int i = 0; i < altura; i++)
                        for(int j = 0; j < largura; j++){
                            num = Integer.valueOf(br.readLine());
                            raster.setSample(j, i, 0, num);
                    }
                    
                    jScrollPane1.setSize(imagem_pgm.getWidth()+80, imagem_pgm.getHeight()+80);            
                    setSize(imagem_pgm.getWidth()+80, imagem_pgm.getHeight()+110);        
                    jLabel_imagem.setIcon(new ImageIcon(imagem_pgm));
                }catch (FileNotFoundException ex) {
                            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Extensão de arquivo inválida!");
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void gerarHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarHistogramaActionPerformed
        try {
            PDI.salvarHistograma(PDI.histograma(imagemCinza,tamanho[0],tamanho[1]),"E:\\histograma.txt");
        } catch (IOException ex) {
            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gerarHistogramaActionPerformed

    private void reduzCanalRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduzCanalRActionPerformed
        rgb rgbAuxiliar[][];
        int valor = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor a ser reduzido"));
        
        rgbAuxiliar = rgb.reduzirCanalR(imagemRGB, tamanho[0], tamanho[1], valor);
        
        try {
            rgb.salvarMatriz(rgbAuxiliar, tamanho[0], tamanho[1], "C:\\novaImagem.pbm");
        } catch (IOException ex) {
            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reduzCanalRActionPerformed

    private void reduzCanalGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduzCanalGActionPerformed
                rgb rgbAuxiliar[][];
        int valor = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor a ser reduzido"));
        
        rgbAuxiliar = rgb.reduzirCanalG(imagemRGB, tamanho[0], tamanho[1], valor);
        
        try {
            rgb.salvarMatriz(rgbAuxiliar, tamanho[0], tamanho[1], "C:\\novaImagem.pbm");
        } catch (IOException ex) {
            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reduzCanalGActionPerformed

    private void reduzCanalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduzCanalBActionPerformed
        rgb rgbAuxiliar[][];
        int valor = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor a ser reduzido"));
        
        rgbAuxiliar = rgb.reduzirCanalB(imagemRGB, tamanho[0], tamanho[1], valor);
        
        try {
            rgb.salvarMatriz(rgbAuxiliar, tamanho[0], tamanho[1], "C:\\novaImagem.pbm");
        } catch (IOException ex) {
            Logger.getLogger(iu_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
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
        }        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void exibirImagemCinza(int matriz[][]){ 
        System.out.println(largura);
        System.out.println(altura);
        imagem_pgm = new BufferedImage(largura, altura, BufferedImage.TYPE_BYTE_GRAY);
        WritableRaster raster = imagem_pgm.getRaster();
        int num;

        for(int i = 0; i < altura; i++)
            for(int j = 0; j < largura; j++){
                num = matriz[i][j];
                raster.setSample(j, i, 0, num);
        }
        jScrollPane1.setSize(imagem_pgm.getWidth()+80, imagem_pgm.getHeight()+80);           
        setSize(imagem_pgm.getWidth()+80, imagem_pgm.getHeight()+110);        
        jLabel_imagem.setIcon(new ImageIcon(imagem_pgm));
    }
    
    private void exibirImagemCinzaGiro(int matriz[][]){ 
        imagem_pgm = new BufferedImage(altura, largura, BufferedImage.TYPE_BYTE_GRAY);
        WritableRaster raster = imagem_pgm.getRaster();
        int num;

        for(int i = 0; i < largura; i++)
            for(int j = 0; j < altura; j++){
                num = matriz[i][j];
                raster.setSample(j, i, 0, num);
        }
        jScrollPane1.setSize(imagem_pgm.getWidth()+80, imagem_pgm.getHeight()+80);           
        setSize(imagem_pgm.getWidth()+80, imagem_pgm.getHeight()+110);        
        jLabel_imagem.setIcon(new ImageIcon(imagem_pgm));
    }
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        int matrizNova[][];
        matrizNova = cinza.filtroLaplaciano(matrizCinza, altura, largura);
        exibirImagemCinza(matrizNova);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        int matrizNova[][];
        matrizNova = cinza.girarNovGraus(matrizCinza, altura, largura);
        exibirImagemCinzaGiro(matrizNova);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
    private javax.swing.JMenuItem extrairCanalB;
    private javax.swing.JMenuItem extrairCanalG;
    private javax.swing.JMenuItem extrairCanalR;
    private javax.swing.JMenuItem gerarHistograma;
    private javax.swing.JLabel jLabel_imagem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem reduzCanalB;
    private javax.swing.JMenuItem reduzCanalG;
    private javax.swing.JMenuItem reduzCanalR;
    // End of variables declaration//GEN-END:variables
}
