package br.com.aula4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio_troca_posição {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> elementos = new ArrayList<Integer>();
		
		String tamanho = JOptionPane.showInputDialog("Escreva o tamanho da Lista");
		int tamanhoDaLista = Integer.parseInt(tamanho);
		
		for (int i = 0; i < tamanhoDaLista; i++) {
			elementos.add(Integer.parseInt(JOptionPane.showInputDialog("Escreva o elemento")));
				
				//Acrescenta o elemento na lista			
		}
		
		int aux = elementos.get(0);
		
		elementos.set(0,elementos.get(elementos.size() -1)); //pega o ultimo elemento da lista
		elementos.set(elementos.size() -1, aux); // informa o ultimo elemento da lista
		
		for (int i = 0; i < elementos.size(); i++) {
			System.out.println(elementos.get(i));
			
		}

	}

}
