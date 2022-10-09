package ex03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ConversorGUI extends JFrame{
	private JTextField txtField;
	private JComboBox <String> comboBox;
	private JLabel label;
	private JButton converter;
	
	public ConversorGUI() {
		setLayout(new FlowLayout());
		setSize(320, 180);
		
		configureTxtField();
		configureComboBox();
		configureLabel();
		configureConverter();
		
		setVisible(true);
	}
	
	
	private void configureTxtField() {
		setTxtField(new JTextField(10));
		getTxtField().setBounds(10, 100, 100, 15);
		getContentPane().add(getTxtField());
		
	}


	private void configureComboBox() {
		setComboBox(new JComboBox<String>());
		getContentPane().add(getComboBox());
		
	}


	private void configureLabel() {
		setLabel(new JLabel());
		getContentPane().add(getLabel());
		
	}


	private void configureConverter() {
		setConverter(new JButton("Converter"));
		getContentPane().add(getConverter());
		
	}


	public JTextField getTxtField() {
		return txtField;
	}
	public void setTxtField(JTextField txtField) {
		this.txtField = txtField;
	}
	public JComboBox<String> getComboBox() {
		return comboBox;
	}
	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}
	public JLabel getLabel() {
		return label;
	}
	public void setLabel(JLabel label) {
		this.label = label;
	}
	public JButton getConverter() {
		return converter;
	}
	public void setConverter(JButton converter) {
		this.converter = converter;
	}

}
