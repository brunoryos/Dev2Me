package br.com.aula4;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class Exercicio_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> elementos = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
				elementos.add(Integer.parseInt(JOptionPane.showInputDialog("Escreva o elemento")));
				int n = elementos.get(i);
				System.out.println(n);
			
		}
		
		int comparacao = Integer.parseInt(JOptionPane.showInputDialog("encontre o elemento"));
		boolean localizado = false;
        
		for (int i = 0; i < elementos.size(); i++) {
			if (elementos.get(i) == comparacao ) {
			System.out.println("elemento encontrado");
			localizado = true;
			System.out.println("Elemento Localizado em " +elementos.get(i));
			}
			if (!localizado) {
					System.out.println("elemento não encontrado");
					
				}
			
		}
		
		
		
	
		
		
	}

}
