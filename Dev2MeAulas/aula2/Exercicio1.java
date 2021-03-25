package br.com.aula2;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
			
		// TODO Auto-generated method stub
		int opcao = 0;
		int voto =0;
		String candidato1 = "Código: 1 \n Nome: Angela Pepino \n Partido: PMDB \n\n\n";
		int qtdeVotoCandidato1 =0;
		String candidato2 = "Código: 2 \n Nome: Gean Silva \n Partido: PT \n\n\n";
		int qtdeVotoCandidato2 =0;	
		String candidato3 = "Código: 3 \n Nome: Cesar Souza Neto \n Partido: PMDB \n\n\n";
		int qtdeVotoCandidato3 =0;	
		String nulo = "Código: 4 \n Voto Nulo \n\n\n";
		int qtdeVotoNulo =0;
		String branco = "Código: 5 \n Voto em Branco \n\n\n";
		int qtdeVotoBranco =0;
		int somaVotos = 0;
		
		do {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("O que deseja Fazer, digite:\n\n 1- Preparar o Sistema \n 2- Finalizar o sistema"));
			
			if (opcao == 1 ) {
				System.out.println("Preparando Sistema");
			    voto = Integer.parseInt(JOptionPane.showInputDialog("Lista de Candidados:\n \n"+ candidato1 +candidato2 + candidato3+ nulo + branco));
			   
			    if (voto ==1) {
			    	qtdeVotoCandidato1 = qtdeVotoCandidato1 + 1;
			    }
			    	
			    else if (voto ==2) {
				   qtdeVotoCandidato2 = qtdeVotoCandidato2 + 1;
			    }
			    
			    else if (voto ==3) {
			    	qtdeVotoCandidato3 = qtdeVotoCandidato3 + 1; //=qtdeVotoCandidato3++
			    }
			    
			    else if (voto ==4) {
			    	qtdeVotoNulo++;	    			    	
			    }
			    else if (voto ==5) {
			    	qtdeVotoBranco++;
			    }
			    
			    else {
			    	System.out.println("Escolha uma opção valida");
			    }
			  		    
			
			}
		}
		while (opcao != 2);
		    System.out.println("Quantidade de votos :\n Angela Pepino: " +qtdeVotoCandidato1 + "\n Gean da Silva: " +qtdeVotoCandidato2 +"\n Cesar Souza Neto: "+qtdeVotoCandidato3 +"\n Votos Nulos :"+qtdeVotoNulo+ "\n Votos em Branco: "+qtdeVotoBranco);
			somaVotos = qtdeVotoCandidato1 + qtdeVotoCandidato2 + qtdeVotoCandidato3 + qtdeVotoNulo + qtdeVotoBranco;
		    System.out.println("Quantidade de votos: "+somaVotos);
		    System.out.println("Sistema Finalizado");
		
		

	
	
}
}