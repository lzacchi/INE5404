package visao;


import java.awt.Color;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Planet;
import modelo.Star;

public class PainelPrincipal implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private JFrame janela;
	int red;
	int green;
	int blue;
	Color mycolor = new Color(red, green, blue);
	
	public void criaJanela(){
		//double mass = Double.parseDouble(JOptionPane.showInputDialog("Inform the Star's mass"));
		//double radius = Double.parseDouble(JOptionPane.showInputDialog("Inform the Star's radius"));
		//Star sol = new Star(mass, radius);
		JPanel painelzinho = new JPanel();
		//JLabel etiqueta = new JLabel("S³");
		JLabel etiqueta2 = new JLabel("Welcome to Solar System SimulatorPlease, choose one of the options below");
		JButton info= new JButton("Obter informações");
		//JButton botaozinho1 = new JButton("View our Solar System informations");
		//JButton botaozinho2 = new JButton("Generate Solar System Model");
		//JButton botaozinho3 = new JButton("Create your own System");
		
		info.addActionListener(new MouseClick());
		
		
									//Painel-----------------------------------//
		
		//painelzinho.add(etiqueta);
		painelzinho.add(etiqueta2);
		//painelzinho.add(botaozinho1);
		//painelzinho.add(botaozinho2);
		//painelzinho.add(botaozinho3);
		
		
		
		
									//Janela-------------------------------------//
		janela = new JFrame("Solar System Simulator");
		janela.setSize(500, 200);
		janela.setLocationRelativeTo(null); // setta a posição do Frame pro meio da tela
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.add(painelzinho);
		janela.add(info);
		//janela.pack();
		janela.setVisible(true);
	}
}

