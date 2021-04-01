package br.com.aula4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio1_LIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> elementos = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			elementos.add(Integer.parseInt(JOptionPane.showInputDialog("Escreva o elemento")));
				
				//Acrescenta o elemento na lista			
		}
		
		int posição = Integer.parseInt(JOptionPane.showInputDialog("encontre o elemento"));
		System.out.println(elementos.get(posição));
		// Encontra o elemento pelo indice
		
             
		

	}

}
