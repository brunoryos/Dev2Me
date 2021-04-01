package br.com.aula4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio4_listadeNumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> elementos = new ArrayList<Integer>();
		
		String tamanho = JOptionPane.showInputDialog("Escreva o tamanho da Lista");
		int tamanhoDaLista = Integer.parseInt(tamanho);
		
		for (int i = 0; i < tamanhoDaLista; i++) {
			elementos.add(Integer.parseInt(JOptionPane.showInputDialog("Escreva o elemento")));
				
				//Acrescenta o elemento na lista			
		}
		
		int soma = 0;
		for (int i = 0; i < tamanhoDaLista; i++) {
			
			if ((elementos.get(i) % 2) ==0) {
				soma ++;
				System.out.println("O numero " + elementos.get(i) + " é par");
				
				
			}
			
			else {
				System.out.println("O numero " + elementos.get(i) + " é impar");}
									
		}
		
		System.out.println("Quantos são pares" + soma);

	}

}
