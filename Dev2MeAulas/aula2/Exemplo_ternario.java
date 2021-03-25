package br.com.aula2;

import javax.swing.JOptionPane;

public class Exemplo_ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		System.out.println((n > 5) ? "Maior que 5" : "Menor que 5");

	}

}
