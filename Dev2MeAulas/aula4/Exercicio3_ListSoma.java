package br.com.aula4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio3_ListSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> elementos = new ArrayList<Integer>();
		
		int tamanhoDaLista = Integer.parseInt(JOptionPane.showInputDialog("Escreva o tamanho da Lista"));
		
		for (int i = 0; i < tamanhoDaLista; i++) {
			elementos.add(Integer.parseInt(JOptionPane.showInputDialog("Escreva o elemento")));
				
				//Acrescenta o elemento na lista			
		}
		int soma =0; 
		for (int i = 0; i < elementos.size(); i++) {
			soma = soma + elementos.get(i);
			//Soma os valores dos elementos da lista
		}
		
		System.out.println(soma);

	}

}
