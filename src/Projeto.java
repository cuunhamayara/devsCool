import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Projeto {

	static List <Pessoa> listaDePessoas= new ArrayList<Pessoa>();

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	    
		int opcao = 0;

        	do {
			System.out.println("\n---MENU---");
			System.out.println("1- Cadastrar pessoa");
			System.out.println("2- Lista de pessoas ordenada por idade");
			System.out.println("3- Lista de pessoas por ordem alfabética");
			System.out.println("0- Finalizar");

            		try {
				System.out.println("Escolha uma opção: ");
				opcao = ler.nextInt();
		    	}
		    	catch (Exception e) {
				System.out.println("\n>>> erro! a opção deve ser numérica!<<< \n");
				ler.nextLine();
				continue;
		    	}

		    	switch (opcao) {

				case 1: 
					System.out.println("---Cadastrar pessoa---");
					System.out.println("Digite o nome: ");
			    		ler.nextLine();
					String nome = ler.nextLine();

					int idade;

			    		do {                    	
						System.out.println("Digite a idade: ");                    	
						try {
				    			idade = ler.nextInt();
				    			if (idade < 0 || idade > 120) {
								System.out.println("\n>>> erro! idade inválida<<< \n");
				    			} else {
								break;
				    			}
						} catch (Exception e) {
				    			System.out.println("\n>>> erro! a idade deve ser numérica!<<< \n");
				    			ler.nextLine();
						}
			    		} while (true);                                       

			    		Pessoa pessoaAux = new Pessoa(nome, idade);
			    		listaDePessoas.add(pessoaAux);            	    
			    		System.out.println("\nPessoa cadastrada com sucesso!");
			    		break;

				case 2:
					listaVazia();
			    		System.out.println("---Lista de pessoas por ordem de idade---");                          	           	                    
			    		ordenarIdade();
			    		for (Pessoa pessoa : listaDePessoas) {
						System.out.println(pessoa.toString());
			    		}
			    		break;                	

				case 3:
					listaVazia();
			    		System.out.println("---Lista de pessoas por ordem alfabética---");                                         
			    		ordenarNome();                    
			    		for (Pessoa pessoa : listaDePessoas) {
						System.out.println(pessoa.toString());
			    		}
			    		break;

				case 0:
			    		System.out.println("\n>>> sistema finalizado <<<\n");
			    		return;

				default:
			    		System.out.println("\n>>> opção inválida! <<<\n");
			    		break;   	                	
		    	}                                    
		} while (true);        
	}

public static void listaVazia() {
	if (listaDePessoas.size() == 0) {
		System.out.println("\"\\n>>> erro! não tem nenhuma pessoa cadastrada!<<< \\n\"");
	}
}

public static void ordenarIdade() {
    Comparator<Pessoa> compIdade = new Comparator<Pessoa>() {
		@Override
		public int compare(Pessoa o1, Pessoa o2) {
			return (o1.getIdade() - o2.getIdade());
		}
    };	
    listaDePessoas.sort(compIdade);	
}

public static void ordenarNome() {
    Comparator<Pessoa> compNome = new Comparator<Pessoa>() {
		@Override
		public int compare(Pessoa o1, Pessoa o2) {
			return o1.getNome().compareTo(o2.getNome());
		}                                      	
    };
    listaDePessoas.sort(compNome);	
}
}
