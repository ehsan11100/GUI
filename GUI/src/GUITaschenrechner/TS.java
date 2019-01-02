package GUITaschenrechner;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TS {

	/**
	 * Einstiegspunkt
	 * 
	 * @param args Parameter, von der Kommandozeile
	 */
	public static void main(String[] args) {
		// Anpassung des Designs an das Betriebssystem
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		// Frame wird erstellt
		GuiTaschenrechner meinTaschenrechner = new GuiTaschenrechner("Project X", "*");
		// Frame wird sichbar gemacht
		meinTaschenrechner.setVisible(true);
	}
}
