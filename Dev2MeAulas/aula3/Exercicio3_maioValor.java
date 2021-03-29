package br.com.aula3;

import javax.swing.JOptionPane;

public class Exercicio3_maioValor {

	public static void main(String[] args) {
		
		int valor = 0;
		verificarMaior(valor);		
		// TODO Auto-generated method stub

	}
	
	public static int verificarMaior (int valor) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o numero 1"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o numero 2"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o numero 3"));
		int valor1 = 0;
		
		if (n1 > n2 && n1> n3) {
			valor1 = n1;
		}
		else if (n2 > n1 && n2 > n3) {
			valor1 = n2;
		}
		else {
			valor1 = n3;
		}
		System.out.println("O maior valor é "+ valor1);
		return valor;
		
	}

}
