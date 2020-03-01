import javax.swing.JFrame;

public class App {

	JFrame frame;

	public App() {
		frame = new JFrame("Hello, World!");
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		new App();

	}

}
