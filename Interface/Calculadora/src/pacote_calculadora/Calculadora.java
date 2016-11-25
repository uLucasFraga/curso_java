package pacote_calculadora;

import java.awt.*;           // importa as classes awt
import java.awt.event.*;     // importa as classes awt.event

import javax.swing.*;        // importa as classes swing
 
// declaração classe extendendo a Classe JFrame
@SuppressWarnings("serial")
public class Calculadora extends JFrame {
 
  // nas linhas abaixo eu declaro os objetos da classe JLabel
  private JLabel lbl_texto1;
  private JLabel lbl_texto2;
  private JLabel lbl_resultado;
     
  // nas linhas abaixo eu declaro os objetos da classe JTextField
  private JTextField txt_valor1;
  private JTextField txt_valor2;
  private JTextField txt_resultado;
     
  // nas linhas abaixo eu declaro os objetos da classe JButton
  private JButton btn_somar;
  private JButton btn_subtrair;
  private JButton btn_multiplicar;
  private JButton btn_dividir;
     
  // na linha abaixo eu declaro as variáveis do tipo Double
  private double valor1, valor2;
     
  // crio o método construtor da classe Calculadora
  // que inicializa a classe
  public Calculadora(){
    setTitle("Calculadora");       // defino o titula da janela
    setSize(286,300);              // defino o tamanho da janela
    setLocation(400,200);          // defino a localição da janela
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // método que fecha a aplicação
           
    // nas linhas abaixo eu instancio os objetos
    // declarados da classe JLabel
    lbl_texto1          = new JLabel("Valor 1");
    lbl_texto2          = new JLabel("Valor 2");
    lbl_resultado       = new JLabel("Resultado");
           
    // nas linhas abaixo eu instancio
    // os objetos declarados da classe JTextField
    txt_valor1          = new JTextField(10);
    txt_valor2          = new JTextField(10);
    txt_resultado       = new JTextField(10);
           
    // nas linhas abaixo eu instancio os
    // objetos declarados da classe JButton
    btn_somar           = new JButton("+");
    btn_subtrair  		= new JButton("-");
    btn_multiplicar     = new JButton("*");
    btn_dividir         = new JButton("/");
           
    // na linha abaixo eu declaro e instancio
    // o objeto da classe Operacoes
    Operacoes op  = new Operacoes();
            
    // nas linhas abaixo eu defino quais os
    // objetos irão executar um evento
    btn_somar           .addActionListener(op);
    btn_subtrair        .addActionListener(op);
    btn_multiplicar     .addActionListener(op);
    btn_dividir         .addActionListener(op);
  }
     
  // crio o método que inicializa os objetos na Janela
  public void inicia(){
    // na linha abaixo eu defino o
    // tipo de layout que será utilizado
    getContentPane().setLayout(null);
 
    // na linha abaixo eu defino a cor de fundo do layout
    getContentPane().setBackground(new Color(255,215,000));
           
    // nas linhas abaixo eu adiciono os objetos na Janela
    getContentPane().add(lbl_texto1);
    getContentPane().add(txt_valor1);
    getContentPane().add(lbl_texto2);
    getContentPane().add(txt_valor2);
    getContentPane().add(btn_somar);
    getContentPane().add(btn_subtrair);
    getContentPane().add(btn_multiplicar);
    getContentPane().add(btn_dividir);
    getContentPane().add(lbl_resultado);
    getContentPane().add(txt_resultado);
           
    // nas linhas abaixo eu posiciono os
    // objetos na Janela através do setBounds
    // definindo a posição na coluna, linha, largura, altura
    lbl_texto1          .setBounds(40,50,100,25);
    txt_valor1          .setBounds(100,50,140,25);
    lbl_texto2          .setBounds(40,80,100,25);
    txt_valor2          .setBounds(100,80,140,25);
    btn_somar           .setBounds(20,120,50,25);
    btn_subtrair        .setBounds(80,120,50,25);
    btn_multiplicar     .setBounds(140,120,50,25);
    btn_dividir         .setBounds(200,120,50,25);
    lbl_resultado       .setBounds(100,170,100,25);
    txt_resultado       .setBounds(10,200,250,25);
           
    // na linha abaixo eu torno a janela visível
    setVisible(true);
  }
     
  // crio a classe que conterá o métodos de
  // calculos que serão invocados
  private class Calculos {
           
    // método que soma dois valores
    public double somar(double v1, double v2) {
      return (v1 + v2);
    }
           
    // método que retorna a subtração de dois valores
    public double subtrair(double v1, double v2) {
      return (v1 - v2);
    }
           
    // método que retorna a multiplicação de dois valores
    public double multiplicar(double v1, double v2) {
      return (v1 * v2);
    }
           
    // método que retorna a divisão de dois valores
    public double dividir(double v1, double v2) {
      return (v1 / v2);
    }
  }
 
  // Crio a classe Operações onde serão
  // implementados os eventos do ActionListener
  private class Operacoes implements ActionListener {
     
    // implementação do método que executa os eventos
    public void actionPerformed(ActionEvent elemento){
                 
      // declaro e instancio o objeto da classe Calculos
      Calculos c = new Calculos();
                 
      // verifica se o objeto sofreu ação é o
      // botão de Somar e executa o evento
      if(elemento.getSource() == btn_somar){
 
        // verifica se digitou algo
        if((txt_valor1.getText().equals("")) || (txt_valor2.getText().equals(""))){
          JOptionPane.showMessageDialog(null,"Prencha os campos!");
        } else {
 
          // as variáveis recebem os valores
          // digitados na caixa de textos
          //convertendo a string digitada para double
          valor1 = Double.parseDouble(txt_valor1.getText());
          valor2 = Double.parseDouble(txt_valor2.getText());
 
          // seta o campo texto de resultado com o
          // retorno do valor da chamada do método da classe Calculos
          txt_resultado.setText("" + c.somar(valor1,valor2));
        }
      }
 
      // verifica se o objeto sofreu ação é o
      // botão de Subtrair e executa o evento
      if(elemento.getSource() == btn_subtrair){
 
        // verifica se digitou algo
        if((txt_valor1.getText().equals("")) || (txt_valor2.getText().equals(""))){
          JOptionPane.showMessageDialog(null,"Prencha os camposs!");
        } else {
          
          //convertendo a string digitada para double
          valor1 = Double.parseDouble(txt_valor1.getText());
          valor2 = Double.parseDouble(txt_valor2.getText());
 
          // seta o campo texto de resultado com o
          // retorno do valor da chamada do método da classe Calculos
          txt_resultado.setText("" + c.subtrair(valor1,valor2));
        }
      }
 
      // verifica se o objeto sofreu ação é o
      // botão de Multiplicar e executa o evento
      if(elemento.getSource() == btn_multiplicar){
 
        // verifica se digitou algo
        if((txt_valor1.getText().equals("")) || (txt_valor2.getText().equals(""))){
          JOptionPane.showMessageDialog(null,"Prencha os campos!");
        } else {
 
          // as variáveis recebem os valores
          // digitados na caixa de textos
          //convertendo a string digitada para double
          valor1 = Double.parseDouble(txt_valor1.getText());
          valor2 = Double.parseDouble(txt_valor2.getText());
 
          // seta o campo texto de resultado com o
          // retorno do valor da chamada do método da classe Calculos
          txt_resultado.setText("" + c. multiplicar (valor1,valor2));
        }
      }
 
      // verifica se o objeto sofreu ação é o
      // botão de Dividir e executa o evento
      if(elemento.getSource() == btn_dividir){
 
        // verifica se digitou algo
        if((txt_valor1.getText().equals("")) || (txt_valor2.getText().equals(""))){
          JOptionPane.showMessageDialog(null,"Prencha os campos!");
        } else {
 
          // as variáveis recebem os valores
          // digitados na caixa de textos
          //convertendo a string digitada para double
          valor1 = Double.parseDouble(txt_valor1.getText());
          valor2 = Double.parseDouble(txt_valor2.getText());
 
          // seta o campo texto de resultado com o
          // retorno do valor da chamada do método da classe Calculos
          txt_resultado.setText("" + c.dividir(valor1,valor2));
        }
      }
    }
  }
     
  // método principal que executa a aplicação Calculadora
  public static void main(String args[]){
 
    // declaro e istancio o objeto da classe Calculadora
    Calculadora p = new Calculadora();
 
    // invoco o método da classe Calculadora que
    // inicializa os objetos na Janela
    p.inicia();
  }
}
