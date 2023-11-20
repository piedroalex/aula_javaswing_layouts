package aula_javaswing_layouts;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Pedro Alex
 */
public class ExemploBorderLayout {
	public static void main(String[] args) {
		//Criando os botões
        JButton btnNorth = new JButton("Norte");
        JButton btnSouth = new JButton("Sul");
        JButton btnEast = new JButton("Leste");
        JButton btnWest = new JButton("Oeste");
        JButton btnCenter = new JButton("Centro");

        //Criando o frame e adicionando um layout
        JFrame frame = new JFrame("Exemplo BorderLayout");        
        frame.getContentPane().setLayout(new BorderLayout());
        
        //Posicionando os botões no frame através do layout
        frame.getContentPane().add(btnNorth, BorderLayout.NORTH);
        frame.getContentPane().add(btnSouth, BorderLayout.SOUTH);
        frame.getContentPane().add(btnEast, BorderLayout.EAST);
        frame.getContentPane().add(btnWest, BorderLayout.WEST);
        frame.getContentPane().add(btnCenter, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
