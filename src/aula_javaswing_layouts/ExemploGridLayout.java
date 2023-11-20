package aula_javaswing_layouts;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Pedro Alex
 */
public class ExemploGridLayout {
	public static void main(String[] args) {
		//Criando os botões
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        JButton btn3 = new JButton("Botão 3");
        JButton btn4 = new JButton("Botão 4");

        //Criando o frame e adicionando um layout
        JFrame frame = new JFrame("Exemplo GridLayout");
        frame.getContentPane().setLayout(new GridLayout(2, 2));

        //Adicionando os botões no frame
        frame.getContentPane().add(btn1);
        frame.getContentPane().add(btn2);
        frame.getContentPane().add(btn3);
        frame.getContentPane().add(btn4);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
