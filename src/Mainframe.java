import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Mainframe extends JFrame {
	
	TextPanel textPanel;
	
	public Mainframe(String titulo) {
		super(titulo);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textPanel = new TextPanel();
		add(textPanel, BorderLayout.CENTER);
		setVisible(true);
	}
}
