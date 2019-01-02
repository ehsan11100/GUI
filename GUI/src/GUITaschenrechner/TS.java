package GUITaschenrechner;

public class TS {

	/**
	 * Einstiegspunkt
	 * 
	 * @param args Parameter, von der Kommandozeile
	 */
	public static void main(String[] args) {
		// Frame wird erstellt
		GuiTaschenrechner meinTaschenrechner = new GuiTaschenrechner("Project X", "*");
		// Frame wird sichbar gemacht
		meinTaschenrechner.setVisible(true);
	}
}
