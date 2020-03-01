import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {

	JButton okButton, goodbyeButton;
	JTextArea area;

	public TextPanel() {
		setLayout(new BorderLayout());
		okButton = new JButton("Ok");
		add(okButton, BorderLayout.WEST);
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.append("OK\n");
				
			}
		});
		goodbyeButton = new JButton("Goodbye");
		add(goodbyeButton, BorderLayout.EAST);
		goodbyeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.append("Goodbye\n");
				
			}
		});
		area = new JTextArea();
		add(area, BorderLayout.CENTER);
	}

}
