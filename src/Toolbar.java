import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Toolbar extends JPanel {

	JButton okButton, goodbyeButton;
	JTextArea area;

	public Toolbar() {

		setLayout(new FlowLayout(FlowLayout.LEFT));
		okButton = new JButton("Ok");
		add(okButton);
		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.append("Ok\n");

			}
		});
		goodbyeButton = new JButton("Goodbye");
		add(goodbyeButton);
		goodbyeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.append("Goodbye\n");
			}
		});

	}

	public void setTextArea(JTextArea area) {
		this.area = area;
	}

}
