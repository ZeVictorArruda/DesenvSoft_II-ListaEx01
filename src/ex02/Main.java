package ex02;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		AdivinhaGui adivinhaGui = new AdivinhaGui();
		adivinhaGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.print(adivinhaGui.getAh().getAdvinhador().getGr().getNum());

	}

}
