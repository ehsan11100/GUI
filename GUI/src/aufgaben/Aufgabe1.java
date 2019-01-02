package aufgaben;

import javax.swing.JFrame;

/**
 * Erstelle eine einfaches Fenster mit dem Titel "GUI mit Swing"
 */
public class Aufgabe1 {
	public static void main(String... args) {
		JFrame jframe1 = new JFrame();
		jframe1.setSize(500, 500);
		jframe1.setTitle("GUI mit Swing");
		jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe1.setVisible(true);
	}
}
