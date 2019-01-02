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
public class GuiTaschenrechner extends JFrame {

	private JTextField labelOperand;
	private JLabel labelOperand1;
	private JLabel labelOperand2;

	private JTextField fieldOperand1;
	private JTextField fieldOperand2;

	private JButton buttonRechnen;

	private String operator;

	public GuiTaschenrechner(String titel, String operator) {

		this.operator = operator;

		setTitle(titel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		setSize(300, 150);
		setResizable(true);

		initComponents();

		add(labelOperand1);
		add(labelOperand2);
		add(fieldOperand1);
		add(labelOperand);
		add(fieldOperand2);
		add(buttonRechnen);

		setLocationRelativeTo(null);
		setVisible(true);

	}

	private void initComponents() {

		labelOperand = new JTextField(operator);
		labelOperand1 = new JLabel("1. Zahl                      ");
		labelOperand2 = new JLabel("2. Zahl                      ");

		fieldOperand1 = new JTextField(10);
		fieldOperand2 = new JTextField(10);

		buttonRechnen = new JButton("Rechnen");
		buttonRechnen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				float op1 = Float.parseFloat(fieldOperand1.getText());
				float op2 = Float.parseFloat(fieldOperand2.getText());

				float ergibniss;

				if (labelOperand.getText().equals("+")) {
					ergibniss = op1 + op2;
				} else if (labelOperand.getText().equals("-")) {
					ergibniss = op1 - op2;
				} else if (labelOperand.getText().equals("/")) {
					ergibniss = op1 / op2;
				} else if (labelOperand.getText().equals("*")) {
					ergibniss = op1 * op2;
				} else {
					ergibniss = 666;
				}

				JOptionPane.showMessageDialog(GuiTaschenrechner.this, "Ergebnis: " + ergibniss, "",
						JOptionPane.INFORMATION_MESSAGE);
				fieldOperand1.setText("");
				fieldOperand2.setText("");

			}

		});
	}
}
