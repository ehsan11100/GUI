package aufgaben;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * F�ge ein Textfeld hinzu, dass vor dem Label angezeigt wird.
 */
public class Aufgabe4 {
	public static void main(String... args) {
		JFrame jframe1 = new JFrame();
		jframe1.setSize(500, 500);
		jframe1.setTitle("GUI mit Swing");
		JLabel label1 = new JLabel("Dies ist ein Label");
		JTextField textfield1 = new JTextField(20);
		JPanel panel1 = new JPanel();
		panel1.add(textfield1);
		panel1.add(label1);
		jframe1.add(panel1);
		jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe1.setVisible(true);
	}
}