package GUITaschenrechner;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
// Elternklasse JFrame
public class GuiTaschenrechner extends JFrame {

	// Koponenten
	private JLabel labelOperand1;
	private JLabel labelOperand2;

	// Textfelder
	private JTextField fieldOperand1;
	private JTextField fieldOperand2;
	private JTextField fieldOperand;

	private JButton buttonRechnen;

	private String operator;

	/**
	 * Kostruktor
	 * 
	 * @param titel    Titel des Frames
	 * @param operator Voreingestellter Operator
	 */
	public GuiTaschenrechner(String titel, String operator) {
		this.operator = operator;

		// Titel setzen
		setTitle(titel);
		// Frame wird beendet, wenn auf X gedrückt wird
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Layout der ContentPane des Frames
		setLayout(new FlowLayout());

		// Größe des Frames
		setSize(300, 150);
		// Die Größe des Frames kann vom Benutzer geändert werden
		setResizable(true);

		// Komponenten Initialisieren, dazu mehr weiter unten
		initComponents();

		// Komponenten werden dem Frame hinzugefügt
		add(labelOperand1);
		add(labelOperand2);
		add(fieldOperand1);
		add(fieldOperand);
		add(fieldOperand2);
		add(buttonRechnen);

		// Frame wird in der Mitte des Bildschirms angezeigt
		setLocationRelativeTo(null);
		// Frame wird sichtbar gemacht
		setVisible(true);

	}

	/**
	 * Komponenten initialisieren
	 */
	private void initComponents() {
		// Beschreibungen der Textfelder
		labelOperand1 = new JLabel("1. Zahl                      ");
		labelOperand2 = new JLabel("2. Zahl                      ");

		// 1. Zahl, vom Benutzer angegeben
		fieldOperand1 = new JTextField(10);
		// 2. Zahl, vom Benutzer angegeben
		fieldOperand2 = new JTextField(10);
		// Operator kann vom Benutzer bestimmt werden
		fieldOperand = new JTextField(operator);

		// Button mit dem Titel "Rechnen"
		buttonRechnen = new JButton("Rechnen");
		// Button reagiert auf einen Mausklick
		buttonRechnen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float op1;
				float op2;
				// Wenn etwas anderes als Zahlen oder gar nichts eingegeben werden, wird nicht
				// gerechnet
				try {
					op1 = Float.parseFloat(fieldOperand1.getText());
					op2 = Float.parseFloat(fieldOperand2.getText());
				} catch (NumberFormatException exception) {
					JOptionPane.showMessageDialog(GuiTaschenrechner.this, "Keine Zahlen", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				float ergibniss;

				// Operator bestimmen
				if (fieldOperand.getText().equals("+")) {
					ergibniss = op1 + op2;
				} else if (fieldOperand.getText().equals("-")) {
					ergibniss = op1 - op2;
				} else if (fieldOperand.getText().equals("/")) {
					ergibniss = op1 / op2;
				} else if (fieldOperand.getText().equals("*")) {
					ergibniss = op1 * op2;
				} else {
					ergibniss = 666;
				}
				// Ergebnis wird in Dialog ausgegeben
				JOptionPane.showMessageDialog(GuiTaschenrechner.this, "Ergebnis: " + ergibniss, "",
						JOptionPane.INFORMATION_MESSAGE);
				// Zahlen werden resettet
				fieldOperand1.setText("");
				fieldOperand2.setText("");

			}

		});
	}
}
