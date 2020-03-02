import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel {

	JButton okButton, goodbyeButton;
	
	public Toolbar() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		okButton = new JButton("Ok");
		add(okButton);
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				area.append("OK\n");
				System.out.println("OK\n");
				
			}
		});
		goodbyeButton = new JButton("Goodbye");
		add(goodbyeButton);
		goodbyeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				area.append("Goodbye\n");
				System.out.println("Goodbye\n");				
			}
		});
		
		// TODO Auto-generated constructor stub
	}
}
