package ex01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CalcGuiHandler implements ActionListener {
	private JTextField display;
	private Calculadora calculadora;
	
	public CalcGuiHandler(JTextField display) {
		setDisplay(display);
		setCalculadora(new Calculadora());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String displayText = getDisplay().getText();
		String buttonText = (((JButton) e.getSource()).getText());
		
		// Para quando se clicar em número:
		if ((buttonText == "0") || (buttonText == "1") || (buttonText == "2") || (buttonText == "3") || (buttonText == "4")
				|| (buttonText == "5") || (buttonText == "6") || (buttonText == "7") || (buttonText == "8")
				|| (buttonText == "9")) {
			
			getDisplay().setText(displayText + buttonText);
		
			
		} else if (buttonText == ".") {
			if (displayText.indexOf('.') == -1) {
                getDisplay().setText(displayText + buttonText);
                
            }
			
			
		} else if ((buttonText == "+") ||(buttonText == "-") || (buttonText == "*") || (buttonText == "/")) {
			// Convertendo o texto do display para double e atribuindo a primeira parcela para Calculadora
			getCalculadora().setParcela1(Double.parseDouble(getDisplay().getText()));
			
			// Atribuindo a operação para a calculadora
			getCalculadora().setOperation(buttonText.toCharArray()[0]);
			
			// limpando o display
			getDisplay().setText("0");
			
			
		} else if (buttonText == "="){
			// quando o sinal for de igual: converter o texto no display para double e atribuir o valor da segunda parcela
			getCalculadora().setParcela2(Double.parseDouble(getDisplay().getText()));
			
			// chamar a função para calcular, converter o resultado para string e atribuí-lo no display
			getDisplay().setText(Double.toString(getCalculadora().calculate()));
		}
	}
	
	
	// getters and setters
	public JTextField getDisplay() {
		return display;
	}


	public void setDisplay(JTextField display) {
		this.display = display;
	}


	public Calculadora getCalculadora() {
		return calculadora;
	}


	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
	// fim dos getters and setters

}
