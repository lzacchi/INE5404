package visao;

import java.awt.Color;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import modelo.Planet;
import modelo.Star;

public class PainelInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	Star sol = new Star(1.989E30, 695.7E6);
	Planet terra = new Planet(5.972E24, 6.371E6);
	
	JLabel etiqueta = new JLabel("Informa��es: Sol");
	Object[][] linhas = {{ "A Massa do sol �:" + sol.mass, "O raio do Sol �:" + sol.radius, "A Acelera��o da gravidade na superf�cie do sol �:" + sol.surfaceGravity()}};
	Object[] cabecalho = {"Massa", "Raio", "Acelera��o da Gravidade"};
	JTable tabela = new JTable(linhas, cabecalho);
	
	JLabel etiqueta2 = new JLabel("Informa��es: Terra");
	Object[][] outraslinhas = {{ "A Massa da Terra �:" + terra.mass, "O raio da Terra �:" + terra.radius, "A Acelera��o da gravidade na superf�cie da Terra �:" + terra.surfaceGravity()}};
	Object[] outrocabecalho = {"Massa", "Raio", "Acelera��o da Gravidade"};
	JTable tabela2 = new JTable(outraslinhas, outrocabecalho);
	public void fazAsParadas(){
		
		JFrame janela = new JFrame("T�tulo");
		janela.add(new JScrollPane(tabela));
		//janela.add(new JScrollPane(tabela2));
		//janela.add(etiqueta);
		//janela.add(etiqueta2);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//janela.add(new JScrollPane(tabela));
		janela.pack();
		janela.setSize(500, 200);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}
	
}
