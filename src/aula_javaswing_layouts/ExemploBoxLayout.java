package aula_javaswing_layouts;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Pedro Alex
 */
public class ExemploBoxLayout {
	public static void main(String[] args) {
		//Criando os botões
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        JButton btn3 = new JButton("Botão 3");
        
        //Criando o box e definindo a direção dos componentes
        Box box = Box.createVerticalBox();
        
        //Adicionando os botões no box
        box.add(btn1);
        box.add(btn2);
        box.add(btn3);

        JFrame frame = new JFrame("Exemplo BoxLayout");
        
        //Adicionando o box no frame
        frame.getContentPane().add(box);

        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
