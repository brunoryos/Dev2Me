package br.com.aula2;

import javax.swing.JOptionPane;

public class Exemplo_Cadastro_aluno_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0;
	       do {  
	    	 opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção    - 1) Cadastrar Aluno, 2) Cadastrar Professor, 9) Sair do programa."));
	    	
	    	if (opcao == 1) {
	    		System.out.println("Cadastrar Aluno");
	    	}
	    	if (opcao == 2) {
	    		System.out.println("Cadastrar Professor");
	    	}	    	
	    } 
	       while(opcao != 9);
	    
	       		System.out.println("Programa finalizado.");

		

	}

}
