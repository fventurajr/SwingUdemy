import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {

	Toolbar toolbar;
	JTextArea area;

	public TextPanel() {
		setLayout(new BorderLayout());
		area = new JTextArea();
		add(area, BorderLayout.CENTER);
		toolbar = new Toolbar();
		add(toolbar, BorderLayout.SOUTH);
		toolbar.setTextArea(area);
	}

}
