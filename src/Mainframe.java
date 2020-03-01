import javax.swing.JFrame;

public class Mainframe extends JFrame {
	
	public Mainframe(String titulo) {
		super(titulo);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
