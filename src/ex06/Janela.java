package ex06;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Janela extends JFrame {
	private JLabel label;
	private JTextField txtField1, txtField2, txtField3;
	private JButton btnOK;
	
	public Janela() {
		super("Janela");
		setLayout(new FlowLayout());
		
		configureTxtField1();
		configureTxtField2();
		configureTxtField3();
		configureBtnOK();
		
		setSize(640, 360);
		setVisible(true);
	}

	private void configureTxtField1() {
		setTxtField1(new JTextField("Juros ao Mês %"));
		getContentPane().add(getTxtField1());
	}

	private void configureTxtField2() {
		setTxtField2(new JTextField("Numero de Anos"));
		getContentPane().add(getTxtField2());
	}

	private void configureTxtField3() {
		setTxtField3(new JTextField("Depósito mensal"));
		getContentPane().add(getTxtField3());
	}
	
	private void configureBtnOK() {
		setBtnOK(new JButton("Calcular"));
		getContentPane().add(getBtnOK());
	}
	
	
	// getters and setters
	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JTextField getTxtField1() {
		return txtField1;
	}

	public void setTxtField1(JTextField txtField1) {
		this.txtField1 = txtField1;
	}

	public JTextField getTxtField2() {
		return txtField2;
	}

	public void setTxtField2(JTextField txtField2) {
		this.txtField2 = txtField2;
	}

	public JTextField getTxtField3() {
		return txtField3;
	}

	public void setTxtField3(JTextField txtField3) {
		this.txtField3 = txtField3;
	}

	public JButton getBtnOK() {
		return btnOK;
	}

	public void setBtnOK(JButton btnOK) {
		this.btnOK = btnOK;
	}
	

}
