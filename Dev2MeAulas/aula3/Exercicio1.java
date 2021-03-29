package br.com.aula3;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int insere = 0;
		int aluno = 0;
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		double mediaFinal = 0;
		String nome;
		
		do {
			
			insere = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir uma nota"));
		    aluno++;
				if (insere == 1) {
				nome = JOptionPane.showInputDialog("Escreva o nome do aluno");
				nota1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota 1"));
				nota2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota 2"));
				nota3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota 3"));
				calcularMedia(nota1, nota2, nota3, nome);
				mediaFinal = calcularMedia(nota1, nota2, nota3, nome);
				System.out.println("A media do " + nome +" é de :" +mediaFinal);
				}
				else {
					
					System.out.println("Escreva uma opção válida");}				
				}
		
		while (insere != 2);
		
	System.out.println("Programa Finalizado");
				
	}
	
	public static double calcularMedia (int nota1, int nota2, int nota3, String Aluno) {
		
		double media = (nota1 + nota2 +nota3)/3;
		return media;
	}

}
