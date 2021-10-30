package GerenciadorDeFilmes;

import java.util.ArrayList;
import java.util.Scanner;

public class listaDeFilmes {
		
			private static ArrayList<Categoria> acervos = new ArrayList<>();

			////////////////////////// CADASTRAR FILME(S) ///////////////////////////////
			
			public static void cadastrarFilme() {
				
				 Scanner input = new Scanner(System.in);
					
					System.out.println("|---------------------------------------------|");
					System.out.println("|              CADASTRAR FILME                |");
					System.out.println("|---------------------------------------------|");
					System.out.println(" Informe o t�tulo do filme: ");
					String titulo = input.nextLine();

					
					System.out.println(" Informe a sinopse do filme: ");
					String sinopse = input.nextLine();

					
					System.out.println(" Informe a categoria do filme: ");
					String categoriaDoFilme = input.nextLine();

					
					System.out.println(" Informe o pa�s de origem do filme: ");
					String paisOrigem = input.nextLine();

					System.out.println(" Informe o nome do diretor do filme: ");
					String diretor = input.nextLine();
					
					System.out.println(" Informe o ano de lan�amento do filme: ");
					String anoLancamento = input.nextLine();
					
					System.out.println(" Informe o ano de classifica��o indicativa do filme: |");
					String classificacaoIndicativa = input.nextLine();
					
					Categoria AcervoFilmes = new Categoria(titulo, sinopse, categoriaDoFilme, paisOrigem, diretor, anoLancamento, classificacaoIndicativa, classificacaoIndicativa);

				acervos.add(AcervoFilmes);	
				System.out.println("|---------------------------------------------|");
				System.out.println("|        FILME CADASTRADO COM SUCESSO!!!      |");
				System.out.println("|---------------------------------------------|");

				input.close();
		}
			
			//////////////////////////LISTAR FILME(S) ///////////////////////////////
			
			public static void listarFilme() {

				System.out.println("|---------------------------------------------|");
				System.out.println("|      OP��O LISTAR FILMES SELECIONADA!!!     |");
				System.out.println("|---------------------------------------------|");
									
					for (Categoria AcervoFilmes : acervos) {
						System.out.println("|---------------------------------------------------------------------------|\n");
						System.out.println(" Titulo do filme: " + AcervoFilmes.getTitulo());
						System.out.println(" Sinopse: " + AcervoFilmes.getSinopse() + 
								" ");
						System.out.println(" Categoria: " + AcervoFilmes.getCategoriaDoFilme());
						System.out.println(" Pa�s de origem: " + AcervoFilmes.getPaisOrigem());
						System.out.println(" Diretor: " + AcervoFilmes.getDiretor());
						System.out.println(" Ano de Lan�amento: " + AcervoFilmes.getAnoLancamento());
						System.out.println(" Classifica��o Indicativa: " + AcervoFilmes.getClassificacaoIndicativa());
						System.out.println("|---------------------------------------------------------------------------|\n");
					}
				
					System.out.println(" Lista de filmes acima. ");
			}	
		
			//////////////////////////PESQUISAR FILME(S) ///////////////////////////////
			
			public static void pesquisar() {

				System.out.println("|---------------------------------------------|");
				System.out.println("|     OP��O PESQUISAR FILME SELECIONADA!!!    |");
				System.out.println("|---------------------------------------------|");

				Scanner input = new Scanner(System.in);

				System.out.println(" Informe o titulo do filme que quer pesquisar: ");
				String titulo = input.nextLine();
				
		
			//////////////////////////SUBMENU DE EDI��O E EXCLUS�O///////////////////////////////
				
					for(int i=0; i<acervos.size();i++) {
						if (acervos.get(i).getTitulo().equals(titulo)) {
							int opc;
							
							do {
								System.out.println(
										  "\n|---------------------------------------------|"
										+ "\n|            Menu de Edi��o de Filme          |"
										+ "\n|---------------------------------------------|"
										+ "\n|---------------------------------------------|"
										+ "\n|              1 - Editar Filme               |"
										+ "\n|---------------------------------------------|"
										+ "\n|              2 - Remover Filme              |"
										+ "\n|---------------------------------------------|"
										+ "\n|              3 - Encerrar                   |"
										+ "\n|---------------------------------------------|"
										+ "\n|---------------------------------------------|");

								System.out.println(" Informe a op��o desejada: ");
								opc = input.nextInt();

								switch (opc) {
								////////////////////////// OP��O DE EDI��O DO FILME(S) ///////////////////////////////
									case 1:
									Scanner entrada = new Scanner(System.in);
									int escolherOpcao;
									do {

										System.out.println("|-------------------------------------|"
												+ "\n| Escolha qual op��o deseja editar?   |"
												+ "\n|-------------------------------------|"								
												+ "\n| 1 - Titulo                          |"
												+ "\n| 2 - Sinopse                         |"
												+ "\n| 3 - Categoria                       |"
												+ "\n| 4 - Pa�s de Origem                  |"
												+ "\n| 5 - Diretor                         |"
												+ "\n| 6 - Ano de Lan�amento               |"
												+ "\n| 7 - Classifica��o Indicativa        |"
												+ "\n|                                     |"
												+ "\n| 8 - Sair                            |"
												+ "\n|-------------------------------------|");

										System.out.println(" Informe a op��o desejada: ");
										escolherOpcao = input.nextInt();

										switch (escolherOpcao) {
										case 1:
											System.out.println(" Informe o novo titulo do filme: ");
											String novoTitulo = entrada.nextLine();
											acervos.get(i).setTitulo(novoTitulo);
											System.out.println("T�TULO DO FILME ATUALIZADO!!!");
											break;
										case 2:
											System.out.println(" Informe a nova sinopse do filme: ");
											String novaSinopse = entrada.nextLine();
											acervos.get(i).setSinopse(novaSinopse);
											System.out.println("SINOPSE ATUALIZADA!");
											break;
										case 3:
											System.out.println(" Informe a nova categoria do filme: ");
											String novaAcervoFilmes = entrada.nextLine();
											acervos.get(i).setCategoriaDoFilme(novaAcervoFilmes);
											System.out.println("CATEGORIA ATUALIZADA!");
											break;
										case 4:
											System.out.println(" Informe o novo pa�s de origem do filme: ");
											String novoPaisOrigem = entrada.nextLine();
											acervos.get(i).setPaisOrigem(novoPaisOrigem);
											System.out.println("PA�S DE ORIGEM ATUALIZADO!");
											break;
										case 5:
											System.out.println(" Informe o novo diretor do filme: ");
											String novoDiretor = entrada.nextLine();
											acervos.get(i).setDiretor(novoDiretor);
											System.out.println("DIRETOR ATUALIZADO!");
											break;
										case 6:
											System.out.println(" Informe o novo ano de lan�amento do filme: ");
											String novoAnoLancamento = entrada.nextLine();
											acervos.get(i).setAnoLancamento(novoAnoLancamento);
											System.out.println("ANO DE LAN�AMENTO ATUALIZADO!");
											break;
										case 7:
											System.out.println(" Informe a nova classifica��o indicativa do filme: ");
											String novaClassificacaoIndicativa = entrada.nextLine();
											acervos.get(i).setClassificacaoIndicativa(novaClassificacaoIndicativa);
											System.out.println("CLASSIFICA��O INDICATIVA ATUALIZADA!");
											break;
										case 8:
											System.out.println("VOC� SAIU DA OP��O DE EDI��O DO FILME");
											break;
										default: 
											break;
										}
									} while (escolherOpcao !=8);
									break;
								////////////////////////// OP��O DE REMOVER FILME(S) ///////////////////////////////
								case 2:
									System.out.println("|---------------------------------------|");
									System.out.println(" OP��O DE REMOVER FILME SELECIONADA!!!  ");
									System.out.println("|---------------------------------------|");
									Scanner remover = new Scanner(System.in);
									System.out.println("Informe o titulo do filme: ");
									String removerfilme = remover.nextLine();
									
									for(int j=0; j < acervos.size(); j++) {
										Categoria filme = acervos.get(j);
										if(filme.getTitulo().equals(removerfilme)){
											acervos.remove(filme);
											System.out.println("Filme " + "'"+filme.getTitulo()+"'" + " removido com sucesso!");
										} else {
											System.err.println("O titulo est� incorreto, tente novamente!");
									break;		
										}
									}							
								
								default:
									
									break;
								}

							} while (opc != 3);

						} else {
							System.err.println("Esse filme n�o foi encontrado no acervo, informe novamente o titulo corretamente!");
					
					}
				}
				
			
		}
	}
