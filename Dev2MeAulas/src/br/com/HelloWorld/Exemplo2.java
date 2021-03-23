package br.com.HelloWorld;

import javax.swing.JOptionPane;

/**
 * @author bruno
 *
 */
public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o seu numero 1"));
		int n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o seu numero 2"));
		
		int soma = 0;
		
		soma = n1 + n2;
				
		System.out.println(soma);

	}

}
