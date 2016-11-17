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
	
	JLabel etiqueta = new JLabel("Informações: Sol");
	Object[][] linhas = {{ "A Massa do sol é:" + sol.mass, "O raio do Sol é:" + sol.radius, "A Aceleração da gravidade na superfície do sol é:" + sol.surfaceGravity()}};
	Object[] cabecalho = {"Massa", "Raio", "Aceleração da Gravidade"};
	JTable tabela = new JTable(linhas, cabecalho);
	
	JLabel etiqueta2 = new JLabel("Informações: Terra");
	Object[][] outraslinhas = {{ "A Massa da Terra é:" + terra.mass, "O raio da Terra é:" + terra.radius, "A Aceleração da gravidade na superfície da Terra é:" + terra.surfaceGravity()}};
	Object[] outrocabecalho = {"Massa", "Raio", "Aceleração da Gravidade"};
	JTable tabela2 = new JTable(outraslinhas, outrocabecalho);
	public void fazAsParadas(){
		
		JFrame janela = new JFrame("Título");
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
