package GerenciadorDeFilmes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		listaDeFilmes categoria = new listaDeFilmes();

		Scanner teclado = new Scanner(System.in);
		int opcao;
		opcao = 1;

		do {
			
			System.out.println(
					  "\n|---------------------------------------------|"
					+ "\n|            Menu do Acervo de Filmes         |"
					+ "\n|---------------------------------------------|"
					+ "\n|---------------------------------------------|"
					+ "\n|             1 - Cadastrar Filme             |"
					+ "\n|---------------------------------------------|"
					+ "\n|             2 - Listar Filmes               |"
					+ "\n|---------------------------------------------|"
					+ "\n|          3 - Pesquisar Filme por Nome       |"
					+ "\n|---------------------------------------------|"
					+ "\n|               4 - Encerrar                  |"
					+ "\n|---------------------------------------------|"
					+ "\n|---------------------------------------------|");

			
			System.out.print("Informe a opção desejada: ");
			opcao = teclado.nextInt();
			
			switch (opcao) {

			case 1:
				listaDeFilmes.cadastrarFilme();
				break;

			case 2:
				listaDeFilmes.listarFilme();
				break;

			case 3:
               listaDeFilmes.pesquisar();
				break;

			case 4:
				System.out.println("|----------------------|");
				System.out.println("Obrigado(a) e até logo! ");
				System.out.println("|----------------------|");
				break;
			default:
				System.out.println("|-------------------------------------|");
				System.err.println("Essa opção é invalida, tente novamente!");
				System.out.println("|-------------------------------------|");
				break;
			}

		} while (opcao != 4);
			
	}

}
