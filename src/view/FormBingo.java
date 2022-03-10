
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Leite de Sá
 */
public class FormBingo {
    private JFrame form;
    private JLabel lblValor1, lblValor2, lblInfoNumAtual, lblInfoNumAnterior;
    private JButton btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn10;
    private JButton btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;
    private JButton btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30;
    private JButton btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38, btn39, btn40;
    private JButton btn41, btn42, btn43, btn44, btn45, btn46, btn47, btn48, btn49, btn50;
    private JButton btn51, btn52, btn53, btn54, btn55, btn56, btn57, btn58, btn59, btn60;
    private JButton btn61, btn62, btn63, btn64, btn65, btn66, btn67, btn68, btn69, btn70;
    private JButton btn71, btn72, btn73, btn74, btn75, btn76, btn77, btn78, btn79, btn80;
    private JButton btn81, btn82, btn83, btn84, btn85, btn86, btn87, btn88, btn89, btn90;
    private JButton btn91, btn92, btn93, btn94, btn95, btn96, btn97, btn98, btn99, btn100;
    private JButton btnReset;
    FileWriter arquivo;
    public String valor;
    Font num = new Font("SansSerif", Font.BOLD, 20);
    Font texto = new Font("SansSerif", Font.BOLD, 20); 
    
    public FormBingo() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // instancia objeto JFrame
        form = new JFrame("Bingo");
        // configura posição (x, y) e tamanho (width, height)
        form.setBounds(500, 250, 660, 500);
        // configura operação padrão ao fechar o formulário
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // elimina pré-configurações de layout
        form.setLayout(null);
        // obtém objeto do painel (área) de conteúdo do form
        Container painelDeConteudo = form.getContentPane();
        
        //reseta numeros
        try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write("00");
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
        
        // instancia e configura JLabel
        lblValor1 = new JLabel("00");
        lblValor1.setBounds(115, 5, 60, 30);
        lblValor1.setForeground(Color.BLUE);
        lblValor1.setFont(num);
        painelDeConteudo.add(lblValor1);
        
        lblValor2 = new JLabel("00");
        lblValor2.setBounds(255, 5, 60, 30);
        lblValor2.setForeground(Color.RED);
        lblValor2.setFont(num);
        painelDeConteudo.add(lblValor2);
        
        lblInfoNumAtual = new JLabel("Bola Atual: ");
        lblInfoNumAtual.setBounds(50, 5, 80, 30);
        lblValor2.setFont(texto);
        painelDeConteudo.add(lblInfoNumAtual);
        
        lblInfoNumAnterior = new JLabel("Bola Anterior: ");
        lblInfoNumAnterior.setBounds(170, 5, 150, 30);
        lblValor2.setFont(texto);
        painelDeConteudo.add(lblInfoNumAnterior);
        
        btnReset = new JButton("RESETAR BOLAS");
        btnReset.setBounds(480, 5, 140, 30);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int certeza = JOptionPane.showConfirmDialog(null,"Tem certeza? essa ação é irreversivel.");
                
                if(certeza == 0){
                    lblValor2.setText(String.format("00"));
                    lblValor1.setText(String.format("00"));
                    btn01.setBackground(null);
                    btn02.setBackground(null);
                    btn03.setBackground(null);
                    btn04.setBackground(null);
                    btn05.setBackground(null);
                    btn06.setBackground(null);
                    btn07.setBackground(null);
                    btn08.setBackground(null);
                    btn09.setBackground(null);
                    btn10.setBackground(null);
                    btn11.setBackground(null);
                    btn12.setBackground(null);
                    btn13.setBackground(null);
                    btn14.setBackground(null);
                    btn15.setBackground(null);
                    btn16.setBackground(null);
                    btn17.setBackground(null);
                    btn18.setBackground(null);
                    btn19.setBackground(null);
                    btn20.setBackground(null);
                    btn21.setBackground(null);
                    btn22.setBackground(null);
                    btn23.setBackground(null);
                    btn24.setBackground(null);
                    btn25.setBackground(null);
                    btn26.setBackground(null);
                    btn27.setBackground(null);
                    btn28.setBackground(null);
                    btn29.setBackground(null);
                    btn30.setBackground(null);
                    btn31.setBackground(null);
                    btn32.setBackground(null);
                    btn33.setBackground(null);
                    btn34.setBackground(null);
                    btn35.setBackground(null);
                    btn36.setBackground(null);
                    btn37.setBackground(null);
                    btn38.setBackground(null);
                    btn39.setBackground(null);
                    btn40.setBackground(null);
                    btn41.setBackground(null);
                    btn42.setBackground(null);
                    btn43.setBackground(null);
                    btn44.setBackground(null);
                    btn45.setBackground(null);
                    btn46.setBackground(null);
                    btn47.setBackground(null);
                    btn48.setBackground(null);
                    btn49.setBackground(null);
                    btn50.setBackground(null);
                    btn51.setBackground(null);
                    btn52.setBackground(null);
                    btn53.setBackground(null);
                    btn54.setBackground(null);
                    btn55.setBackground(null);
                    btn56.setBackground(null);
                    btn57.setBackground(null);
                    btn58.setBackground(null);
                    btn59.setBackground(null);
                    btn60.setBackground(null);
                    btn61.setBackground(null);
                    btn62.setBackground(null);
                    btn63.setBackground(null);
                    btn64.setBackground(null);
                    btn65.setBackground(null);
                    btn66.setBackground(null);
                    btn67.setBackground(null);
                    btn68.setBackground(null);
                    btn69.setBackground(null);
                    btn70.setBackground(null);
                    btn71.setBackground(null);
                    btn72.setBackground(null);
                    btn73.setBackground(null);
                    btn74.setBackground(null);
                    btn75.setBackground(null);
                    btn76.setBackground(null);
                    btn77.setBackground(null);
                    btn78.setBackground(null);
                    btn79.setBackground(null);
                    btn80.setBackground(null);
                    btn81.setBackground(null);
                    btn82.setBackground(null);
                    btn83.setBackground(null);
                    btn84.setBackground(null);
                    btn85.setBackground(null);
                    btn86.setBackground(null);
                    btn87.setBackground(null);
                    btn88.setBackground(null);
                    btn89.setBackground(null);
                    btn90.setBackground(null);
                    btn91.setBackground(null);
                    btn92.setBackground(null);
                    btn93.setBackground(null);
                    btn94.setBackground(null);
                    btn95.setBackground(null);
                    btn96.setBackground(null);
                    btn97.setBackground(null);
                    btn98.setBackground(null);
                    btn99.setBackground(null);
                    btn100.setBackground(null);
                    

                    try{
                            arquivo = new FileWriter(new File("bingo.txt"));
                            arquivo.write("00");
                            arquivo.close();
                    } 
                    catch (IOException j){
                    System.out.println("An error occurred.");
                    j.printStackTrace();
                    }
                }
            }
        });
        painelDeConteudo.add(btnReset);

        // 01-10
        
        btn01 = new JButton("01");
        btn01.setBounds(30, 60, 50, 30);
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn01.getText()));
                btn01.setBackground(Color.GRAY);
	
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn01);

        btn02 = new JButton("02");
        btn02.setBounds(90, 60, 50, 30);
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn02.getText()));
                btn02.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn02);
        
        btn03 = new JButton("03");
        btn03.setBounds(150, 60, 50, 30);
        btn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn03.getText()));
                btn03.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn03);

        btn04 = new JButton("04");
        btn04.setBounds(210, 60, 50, 30);
        btn04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn04.getText()));
                btn04.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn04);
        
        btn05 = new JButton("05");
        btn05.setBounds(270, 60, 50, 30);
        btn05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn05.getText()));
                btn05.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn05);
        
        btn06 = new JButton("06");
        btn06.setBounds(330, 60, 50, 30);
        btn06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn06.getText()));
                btn06.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn06);
        
        btn07 = new JButton("07");
        btn07.setBounds(390, 60, 50, 30);
        btn07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn07.getText()));
                btn07.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn07);
        
        btn08 = new JButton("08");
        btn08.setBounds(450, 60, 50, 30);
        btn08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn08.getText()));
                btn08.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn08);
        
        btn09 = new JButton("09");
        btn09.setBounds(510, 60, 50, 30);
        btn09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn09.getText()));
                btn09.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn09);
        
        btn10 = new JButton("10");
        btn10.setBounds(570, 60, 50, 30);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn10.getText()));
                btn10.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn10);
        
        // 11-20
        
        btn11 = new JButton("11");
        btn11.setBounds(30, 100, 50, 30);
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn11.getText()));
                btn11.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn11);

        btn12 = new JButton("12");
        btn12.setBounds(90, 100, 50, 30);
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn12.getText()));
                btn12.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn12);
        
        btn13 = new JButton("13");
        btn13.setBounds(150, 100, 50, 30);
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn13.getText()));
                btn13.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn13);

        btn14 = new JButton("14");
        btn14.setBounds(210, 100, 50, 30);
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn14.getText()));
                btn14.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn14);
        
        btn15 = new JButton("15");
        btn15.setBounds(270, 100, 50, 30);
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn15.getText()));
                btn15.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn15);
        
        btn16 = new JButton("16");
        btn16.setBounds(330, 100, 50, 30);
        btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn16.getText()));
                btn16.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn16);
        
        btn17 = new JButton("17");
        btn17.setBounds(390, 100, 50, 30);
        btn17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn17.getText()));
                btn17.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn17);
        
        btn18 = new JButton("18");
        btn18.setBounds(450, 100, 50, 30);
        btn18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn18.getText()));
                btn18.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn18);
        
        btn19 = new JButton("19");
        btn19.setBounds(510, 100, 50, 30);
        btn19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn19.getText()));
                btn19.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn19);
        
        btn20 = new JButton("20");
        btn20.setBounds(570, 100, 50, 30);
        btn20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn20.getText()));
                btn20.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn20);
        
        //21-30
        
        btn21 = new JButton("21");
        btn21.setBounds(30, 140, 50, 30);
        btn21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn21.getText()));
                btn21.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn21);

        btn22 = new JButton("22");
        btn22.setBounds(90, 140, 50, 30);
        btn22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn22.getText()));
                btn22.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn22);
        
        btn23 = new JButton("23");
        btn23.setBounds(150, 140, 50, 30);
        btn23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn23.getText()));
                btn23.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn23);

        btn24 = new JButton("24");
        btn24.setBounds(210, 140, 50, 30);
        btn24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn24.getText()));
                btn24.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn24);
        
        btn25 = new JButton("25");
        btn25.setBounds(270, 140, 50, 30);
        btn25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn25.getText()));
                btn25.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn25);
        
        btn26 = new JButton("26");
        btn26.setBounds(330, 140, 50, 30);
        btn26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn26.getText()));
                btn26.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn26);
        
        btn27 = new JButton("27");
        btn27.setBounds(390, 140, 50, 30);
        btn27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn27.getText()));
                btn27.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn27);
        
        btn28 = new JButton("28");
        btn28.setBounds(450, 140, 50, 30);
        btn28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn28.getText()));
                btn28.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn28);
        
        btn29 = new JButton("29");
        btn29.setBounds(510, 140, 50, 30);
        btn29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn29.getText()));
                btn29.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn29);
        
        btn30 = new JButton("30");
        btn30.setBounds(570, 140, 50, 30);
        btn30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn30.getText()));
                btn30.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn30);
        
        // 31-40
        
        btn31 = new JButton("31");
        btn31.setBounds(30, 180, 50, 30);
        btn31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn31.getText()));
                btn31.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn31);

        btn32 = new JButton("32");
        btn32.setBounds(90, 180, 50, 30);
        btn32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn32.getText()));
                btn32.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn32);
        
        btn33 = new JButton("33");
        btn33.setBounds(150, 180, 50, 30);
        btn33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn33.getText()));
                btn33.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn33);

        btn34 = new JButton("34");
        btn34.setBounds(210, 180, 50, 30);
        btn34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn34.getText()));
                btn34.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn34);
        
        btn35 = new JButton("35");
        btn35.setBounds(270, 180, 50, 30);
        btn35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn35.getText()));
                btn35.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn35);
        
        btn36 = new JButton("36");
        btn36.setBounds(330, 180, 50, 30);
        btn36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn36.getText()));
                btn36.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn36);
        
        btn37 = new JButton("37");
        btn37.setBounds(390, 180, 50, 30);
        btn37.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn37.getText()));
                btn37.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn37);
        
        btn38 = new JButton("38");
        btn38.setBounds(450, 180, 50, 30);
        btn38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn38.getText()));
                btn38.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn38);
        
        btn39 = new JButton("39");
        btn39.setBounds(510, 180, 50, 30);
        btn39.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn39.getText()));
                btn39.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn39);
        
        btn40 = new JButton("40");
        btn40.setBounds(570, 180, 50, 30);
        btn40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn40.getText()));
                btn40.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn40);
        
        // 41-50
        
        btn41 = new JButton("41");
        btn41.setBounds(30, 220, 50, 30);
        btn41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn41.getText()));
                btn41.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn41);

        btn42 = new JButton("42");
        btn42.setBounds(90, 220, 50, 30);
        btn42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn42.getText()));
                btn42.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn42);
        
        btn43 = new JButton("43");
        btn43.setBounds(150, 220, 50, 30);
        btn43.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn43.getText()));
                btn43.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn43);

        btn44 = new JButton("44");
        btn44.setBounds(210, 220, 50, 30);
        btn44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn44.getText()));
                btn44.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn44);
        
        btn45 = new JButton("45");
        btn45.setBounds(270, 220, 50, 30);
        btn45.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn45.getText()));
                btn45.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn45);
        
        btn46 = new JButton("46");
        btn46.setBounds(330, 220, 50, 30);
        btn46.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn46.getText()));
                btn46.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn46);
        
        btn47 = new JButton("47");
        btn47.setBounds(390, 220, 50, 30);
        btn47.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn47.getText()));
                btn47.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn47);
        
        btn48 = new JButton("48");
        btn48.setBounds(450, 220, 50, 30);
        btn48.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn48.getText()));
                btn48.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn48);
        
        btn49 = new JButton("49");
        btn49.setBounds(510, 220, 50, 30);
        btn49.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn49.getText()));
                btn49.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn49);
        
        btn50 = new JButton("50");
        btn50.setBounds(570, 220, 50, 30);
        btn50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn50.getText()));
                btn50.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn50);
        
        // 51-60
       
        btn51 = new JButton("51");
        btn51.setBounds(30, 260, 50, 30);
        btn51.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn51.getText()));
                btn51.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn51);

        btn52 = new JButton("52");
        btn52.setBounds(90, 260, 50, 30);
        btn52.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn52.getText()));
                btn52.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn52);
        
        btn53 = new JButton("53");
        btn53.setBounds(150, 260, 50, 30);
        btn53.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn53.getText()));
                btn53.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn53);

        btn54 = new JButton("54");
        btn54.setBounds(210, 260, 50, 30);
        btn54.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn54.getText()));
                btn54.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn54);
        
        btn55 = new JButton("55");
        btn55.setBounds(270, 260, 50, 30);
        btn55.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn55.getText()));
                btn55.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn55);
        
        btn56 = new JButton("56");
        btn56.setBounds(330, 260, 50, 30);
        btn56.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn56.getText()));
                btn56.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn56);
        
        btn57 = new JButton("57");
        btn57.setBounds(390, 260, 50, 30);
        btn57.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn57.getText()));
                btn57.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn57);
        
        btn58 = new JButton("58");
        btn58.setBounds(450, 260, 50, 30);
        btn58.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn58.getText()));
                btn58.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn58);
        
        btn59 = new JButton("59");
        btn59.setBounds(510, 260, 50, 30);
        btn59.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn59.getText()));
                btn59.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn59);
        
        btn60 = new JButton("60");
        btn60.setBounds(570, 260, 50, 30);
        btn60.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn60.getText()));
                btn60.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn60);
        
        //61-70
        
        btn61 = new JButton("61");
        btn61.setBounds(30, 300, 50, 30);
        btn61.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn61.getText()));
                btn61.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn61);

        btn62 = new JButton("62");
        btn62.setBounds(90, 300, 50, 30);
        btn62.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn62.getText()));
                btn62.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn62);
        
        btn63 = new JButton("63");
        btn63.setBounds(150, 300, 50, 30);
        btn63.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn63.getText()));
                btn63.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn63);

        btn64 = new JButton("64");
        btn64.setBounds(210, 300, 50, 30);
        btn64.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn64.getText()));
                btn64.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn64);
        
        btn65 = new JButton("65");
        btn65.setBounds(270, 300, 50, 30);
        btn65.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn65.getText()));
                btn65.setBackground(Color.GRAY);
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn65);
        
        btn66 = new JButton("66");
        btn66.setBounds(330, 300, 50, 30);
        btn66.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn66.getText()));
                btn66.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn66);
        
        btn67 = new JButton("67");
        btn67.setBounds(390, 300, 50, 30);
        btn67.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn67.getText()));
                btn67.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn67);
        
        btn68 = new JButton("68");
        btn68.setBounds(450, 300, 50, 30);
        btn68.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn68.getText()));
                btn68.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn68);
        
        btn69 = new JButton("69");
        btn69.setBounds(510, 300, 50, 30);
        btn69.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn69.getText()));
                btn69.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn69);
        
        btn70 = new JButton("70");
        btn70.setBounds(570, 300, 50, 30);
        btn70.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn70.getText()));
                btn70.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn70);
        
            //71-80
            
        btn71 = new JButton("71");
        btn71.setBounds(30, 340, 50, 30);
        btn71.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn71.getText()));
                btn71.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn71);

        btn72 = new JButton("72");
        btn72.setBounds(90, 340, 50, 30);
        btn72.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn72.getText()));
                btn72.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn72);
        
        btn73 = new JButton("73");
        btn73.setBounds(150, 340, 50, 30);
        btn73.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn73.getText()));
                btn73.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn73);

        btn74 = new JButton("74");
        btn74.setBounds(210, 340, 50, 30);
        btn74.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn74.getText()));
                btn74.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn74);
        
        btn75 = new JButton("75");
        btn75.setBounds(270, 340, 50, 30);
        btn75.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn75.getText()));
                btn75.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn75);
        
        btn76 = new JButton("76");
        btn76.setBounds(330, 340, 50, 30);
        btn76.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn76.getText()));
                btn76.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn76);
        
        btn77 = new JButton("77");
        btn77.setBounds(390, 340, 50, 30);
        btn77.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn77.getText()));
                btn77.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn77);
        
        btn78 = new JButton("78");
        btn78.setBounds(450, 340, 50, 30);
        btn78.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn78.getText()));
                btn78.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn78);
        
        btn79 = new JButton("79");
        btn79.setBounds(510, 340, 50, 30);
        btn79.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn79.getText()));
                btn79.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn79);
        
        btn80 = new JButton("80");
        btn80.setBounds(570, 340, 50, 30);
        btn80.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn80.getText()));
                btn80.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn80);
        
            //81-90
            
        btn81 = new JButton("81");
        btn81.setBounds(30, 380, 50, 30);
        btn81.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn81.getText()));
                btn81.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn81);

        btn82 = new JButton("82");
        btn82.setBounds(90, 380, 50, 30);
        btn82.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn82.getText()));
                btn82.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn82);
        
        btn83 = new JButton("83");
        btn83.setBounds(150, 380, 50, 30);
        btn83.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn83.getText()));
                btn83.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn83);

        btn84 = new JButton("84");
        btn84.setBounds(210, 380, 50, 30);
        btn84.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn84.getText()));
                btn84.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn84);
        
        btn85 = new JButton("85");
        btn85.setBounds(270, 380, 50, 30);
        btn85.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn85.getText()));
                btn85.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn85);
        
        btn86 = new JButton("86");
        btn86.setBounds(330, 380, 50, 30);
        btn86.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn86.getText()));
                btn86.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn86);
        
        btn87 = new JButton("87");
        btn87.setBounds(390, 380, 50, 30);
        btn87.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn87.getText()));
                btn87.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn87);
        
        btn88 = new JButton("88");
        btn88.setBounds(450, 380, 50, 30);
        btn88.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn88.getText()));
                btn88.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn88);
        
        btn89 = new JButton("89");
        btn89.setBounds(510, 380, 50, 30);
        btn89.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn89.getText()));
                btn89.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn89);
        
        btn90 = new JButton("90");
        btn90.setBounds(570, 380, 50, 30);
        btn90.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn90.getText()));
                btn90.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn90);
        
            //91-100
            
        btn91 = new JButton("91");
        btn91.setBounds(30, 420, 50, 30);
        btn91.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn91.getText()));
                btn91.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn91);

        btn92 = new JButton("92");
        btn92.setBounds(90, 420, 50, 30);
        btn92.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn92.getText()));
                btn92.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn92);
        
        btn93 = new JButton("93");
        btn93.setBounds(150, 420, 50, 30);
        btn93.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn93.getText()));
                btn93.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn93);

        btn94 = new JButton("94");
        btn94.setBounds(210, 420, 50, 30);
        btn94.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn94.getText()));
                btn94.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn94);
        
        btn95 = new JButton("95");
        btn95.setBounds(270, 420, 50, 30);
        btn95.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn95.getText()));
                btn95.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn95);
        
        btn96 = new JButton("96");
        btn96.setBounds(330, 420, 50, 30);
        btn96.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn96.getText()));
                btn96.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn96);
        
        btn97 = new JButton("97");
        btn97.setBounds(390, 420, 50, 30);
        btn97.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn97.getText()));
                btn97.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn97);
        
        btn98 = new JButton("98");
        btn98.setBounds(450, 420, 50, 30);
        btn98.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn98.getText()));
                btn98.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn98);
        
        btn99 = new JButton("99");
        btn99.setBounds(510, 420, 50, 30);
        btn99.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn99.getText()));
                btn99.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn99);
        
        btn100 = new JButton("100");
        btn100.setBounds(570, 420, 53, 30);
        btn100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblValor2.setText(String.format("%s", lblValor1.getText()));
                lblValor1.setText(String.format("%s", btn100.getText()));
                btn100.setBackground(Color.GRAY);
                
                try{
                        arquivo = new FileWriter(new File("bingo.txt"));
                        arquivo.write(lblValor1.getText());
                        arquivo.close();
                } 
                catch (IOException j){
                System.out.println("An error occurred.");
                j.printStackTrace();
                }
            }
        });
        painelDeConteudo.add(btn100);
        
        form.setVisible(true);
    }
    
}