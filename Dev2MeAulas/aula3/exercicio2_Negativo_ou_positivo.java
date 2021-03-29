package br.com.aula3;

import javax.swing.JOptionPane;

public class exercicio2_Negativo_ou_positivo {

	public static void main(String[] args) {
		
		double valor = 0;
		verificarValor(valor);
		// TODO Auto-generated method stub

	}
	
	public static double verificarValor (double valor) {
		
		double valor1 = Double.valueOf(JOptionPane.showInputDialog("informe um valor"));
		
		if (valor1 > 0) {
			System.out.println("O valor é 1");
		}
		else {
			System.out.println("O valor é -1");
		}
		
		return valor;
		
	}

}
