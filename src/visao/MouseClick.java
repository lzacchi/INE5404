package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MouseClick implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent click) {
		PainelInfo coiso = new PainelInfo();
		coiso.fazAsParadas();
	}
}
