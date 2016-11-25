package pacote_acesso_arquivos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
@SuppressWarnings("serial")
public class CadastroComArquivoTexto extends JFrame {
    private JLabel label1, label2, label3;
    private JButton btAbrir, btGravar, btLimpar;
    private JTextField tfCodigo, tfNome, tfEmail;

    public static void main(String[] args) {
        JFrame frame = new CadastroComArquivoTexto();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public CadastroComArquivoTexto() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
    	// Define o título da janela
        setTitle("Cadastro usando arquivo texto");
        // setBonds(x,y,largura, altura)
        setBounds(250, 50, 340, 160);
        setBackground(new Color(150, 150, 150));
        label1 = new JLabel("Codigo");
        label2 = new JLabel("Nome");
        label3 = new JLabel("Email");
        btAbrir = new JButton("Abrir");
        btGravar = new JButton("Gravar");
        btLimpar = new JButton("Limpar");
        tfCodigo = new JTextField();
        tfNome = new JTextField();
        tfEmail = new JTextField();
        setLayout(null);
        label1.setBounds(10, 15, 40, 20);
        label2.setBounds(10, 40, 45, 20);
        label3.setBounds(10, 65, 45, 20);
        btAbrir.setBounds(10, 100, 75, 20);
        btGravar.setBounds(95, 100, 75, 20);
        btLimpar.setBounds(180, 100, 75, 20);
        tfCodigo.setBounds(60, 15, 55, 20);
        tfNome.setBounds(60, 40, 255, 20);
        tfEmail.setBounds(60, 65, 255, 20);
        add(label1);
        add(label2);
        add(label3);
        add(btAbrir);
        add(btGravar);
        add(btLimpar);
        add(tfCodigo);
        add(tfNome);
        add(tfEmail);
    }

    public void definirEventos() {
    	/*ActionListener:
         * Você chama o ActionListener e esse usa o método ActionPerformed para adicionar uma ação ao seu botão. 
         */
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	// setText:Armazena dados de texto, especificados como uma seqüência de caracteres neste objeto de dados.
                // Executa setText vazio para os campos
            	tfCodigo.setText("");
                tfNome.setText("");
                tfEmail.setText("");
            }
        });
        // Realizam a validação das caixas de texto
        /*ActionListener:
         * Você chama o ActionListener e esse usa o método ActionPerformed para adicionar uma ação ao seu botão. 
         */
        btGravar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tfCodigo.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O codigo nao pode estar vazio!");
                    tfCodigo.requestFocus();
                } else if (tfNome.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O nome nao pode estar vazio!");
                    tfNome.requestFocus();
                } else if (tfEmail.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O email nao pode estar vazio!");
                    tfEmail.requestFocus();
         
      // Realizam a validação das caixas de texto
                } else {
                    try {
      //PrintWriter:Classe utilizada para criar o arquivo de texto
                        PrintWriter out = new PrintWriter(tfCodigo.getText() + ".txt");
                        // Escreve o conteúdo dos campos em um arquivo de texto
                        out.println(tfCodigo.getText());
                        out.println(tfNome.getText());
                        out.println(tfEmail.getText());
                        out.close();
    // Componente que consiste em uma caixa de diálogo. Existem quatro tipos de caixa de diálogo:
                        // MessageDialog
                        // ConfirmDialog
                        // InputDialog
                        // OptionDialog
                        JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!");
                    } catch (IOException erro) {
                        JOptionPane.showMessageDialog(null, "Erro ao gravar no arquivo " + erro);
                    }
                }
            }
        });
        btAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String arq = JOptionPane.showInputDialog(null, "Forneca o codigo para abrir:");
                    // FileReader: Leitura de um arquivo de texto
                    BufferedReader br = new BufferedReader(new FileReader(arq + ".txt"));
                    tfCodigo.setText(br.readLine());
                    tfNome.setText(br.readLine());
                    tfEmail.setText(br.readLine());
                    br.close();
                } catch (IOException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo " + erro);
                }
            }
        });
    }
}

