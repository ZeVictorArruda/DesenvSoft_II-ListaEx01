package ex02;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class AdivinhaGui extends JFrame {
	
	 private JLabel label;
	    private JTextField textField;
	    private JButton jBSend, jBRestart;
	    private AdivinhaHandler ah;

	    public AdivinhaGui() {
	        super("Advinhe o n�mero!");
	        setLayout(null);
	        setSize(500, 200);
	        configureLabel();
	        configureTextField();
	        setAh(new AdivinhaHandler(getLabel(),getTextField()));
	        configureJBSend();
	        configureJBRestart();
	        setVisible(true);
	    }

	    private void configureLabel() {
	        setLabel(new JLabel());
	        getLabel().setSize(20, 20);
	        getLabel().setText("Eu tenho um n�mero entre 1 e 1000,"
	                + "voc� pode adivinh�-lo? Entre com seu chute.");
	        getLabel().setBounds(10, 10, 500, 20);
	        getLabel().setOpaque(true);
	        getLabel().setBackground(Color.GRAY);
	        getContentPane().add(getLabel());
	    }

	    private void configureJBSend() {
	        setjBSend(new JButton());
	        getjBSend().setText("enviar");
	        getjBSend().setBounds(10, 100, 100, 50);
	        getjBSend().addActionListener(getAh());
	        getContentPane().add(getjBSend());
	    }

	    private void configureJBRestart() {
	        setjBRestart(new JButton());
	        getjBRestart().setText("reiniciar");
	        getjBRestart().setBounds(110, 100, 100, 50);
	        getjBRestart().addActionListener(getAh());
	        getContentPane().add(getjBRestart());
	        
	    }
	    
	    private void configureTextField(){
	        setTextField(new JTextField());
	        getTextField().setText("0");
	        getTextField().setBounds(10, 50, 150, 30);
	        //getTextField().addActionListener(getAh());
	        getContentPane().add(getTextField());
	    }
	    public JLabel getLabel() {
	        return label;
	    }

	    public void setLabel(JLabel label) {
	        this.label = label;
	    }

	    public JTextField getTextField() {
	        return textField;
	    }

	    public void setTextField(JTextField textField) {
	        this.textField = textField;
	    }

	    public JButton getjBSend() {
	        return jBSend;
	    }

	    public void setjBSend(JButton jBSend) {
	        this.jBSend = jBSend;
	    }

	    public JButton getjBRestart() {
	        return jBRestart;
	    }

	    public void setjBRestart(JButton jBRestart) {
	        this.jBRestart = jBRestart;
	    }

	    public AdivinhaHandler getAh() {
	        return ah;
	    }

	    public void setAh(AdivinhaHandler ah) {
	        this.ah = ah;
	    }

	}


