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
					System.out.println(" Informe o título do filme: ");
					String titulo = input.nextLine();

					
					System.out.println(" Informe a sinopse do filme: ");
					String sinopse = input.nextLine();

					
					System.out.println(" Informe a categoria do filme: ");
					String categoriaDoFilme = input.nextLine();

					
					System.out.println(" Informe o país de origem do filme: ");
					String paisOrigem = input.nextLine();

					System.out.println(" Informe o nome do diretor do filme: ");
					String diretor = input.nextLine();
					
					System.out.println(" Informe o ano de lançamento do filme: ");
					String anoLancamento = input.nextLine();
					
					System.out.println(" Informe o ano de classificação indicativa do filme: |");
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
				System.out.println("|      OPÇÃO LISTAR FILMES SELECIONADA!!!     |");
				System.out.println("|---------------------------------------------|");
									
					for (Categoria AcervoFilmes : acervos) {
						System.out.println("|---------------------------------------------------------------------------|\n");
						System.out.println(" Titulo do filme: " + AcervoFilmes.getTitulo());
						System.out.println(" Sinopse: " + AcervoFilmes.getSinopse() + 
								" ");
						System.out.println(" Categoria: " + AcervoFilmes.getCategoriaDoFilme());
						System.out.println(" País de origem: " + AcervoFilmes.getPaisOrigem());
						System.out.println(" Diretor: " + AcervoFilmes.getDiretor());
						System.out.println(" Ano de Lançamento: " + AcervoFilmes.getAnoLancamento());
						System.out.println(" Classificação Indicativa: " + AcervoFilmes.getClassificacaoIndicativa());
						System.out.println("|---------------------------------------------------------------------------|\n");
					}
				
					System.out.println(" Lista de filmes acima. ");
			}	
		
			//////////////////////////PESQUISAR FILME(S) ///////////////////////////////
			
			public static void pesquisar() {

				System.out.println("|---------------------------------------------|");
				System.out.println("|     OPÇÃO PESQUISAR FILME SELECIONADA!!!    |");
				System.out.println("|---------------------------------------------|");

				Scanner input = new Scanner(System.in);

				System.out.println(" Informe o titulo do filme que quer pesquisar: ");
				String titulo = input.nextLine();
				
		
			//////////////////////////SUBMENU DE EDIÇÃO E EXCLUSÃO///////////////////////////////
				
					for(int i=0; i<acervos.size();i++) {
						if (acervos.get(i).getTitulo().equals(titulo)) {
							int opc;
							
							do {
								System.out.println(
										  "\n|---------------------------------------------|"
										+ "\n|            Menu de Edição de Filme          |"
										+ "\n|---------------------------------------------|"
										+ "\n|---------------------------------------------|"
										+ "\n|              1 - Editar Filme               |"
										+ "\n|---------------------------------------------|"
										+ "\n|              2 - Remover Filme              |"
										+ "\n|---------------------------------------------|"
										+ "\n|              3 - Encerrar                   |"
										+ "\n|---------------------------------------------|"
										+ "\n|---------------------------------------------|");

								System.out.println(" Informe a opção desejada: ");
								opc = input.nextInt();

								switch (opc) {
								////////////////////////// OPÇÃO DE EDIÇÃO DO FILME(S) ///////////////////////////////
									case 1:
									Scanner entrada = new Scanner(System.in);
									int escolherOpcao;
									do {

										System.out.println("|-------------------------------------|"
												+ "\n| Escolha qual opção deseja editar?   |"
												+ "\n|-------------------------------------|"								
												+ "\n| 1 - Titulo                          |"
												+ "\n| 2 - Sinopse                         |"
												+ "\n| 3 - Categoria                       |"
												+ "\n| 4 - País de Origem                  |"
												+ "\n| 5 - Diretor                         |"
												+ "\n| 6 - Ano de Lançamento               |"
												+ "\n| 7 - Classificação Indicativa        |"
												+ "\n|                                     |"
												+ "\n| 8 - Sair                            |"
												+ "\n|-------------------------------------|");

										System.out.println(" Informe a opção desejada: ");
										escolherOpcao = input.nextInt();

										switch (escolherOpcao) {
										case 1:
											System.out.println(" Informe o novo titulo do filme: ");
											String novoTitulo = entrada.nextLine();
											acervos.get(i).setTitulo(novoTitulo);
											System.out.println("TÍTULO DO FILME ATUALIZADO!!!");
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
											System.out.println(" Informe o novo país de origem do filme: ");
											String novoPaisOrigem = entrada.nextLine();
											acervos.get(i).setPaisOrigem(novoPaisOrigem);
											System.out.println("PAÍS DE ORIGEM ATUALIZADO!");
											break;
										case 5:
											System.out.println(" Informe o novo diretor do filme: ");
											String novoDiretor = entrada.nextLine();
											acervos.get(i).setDiretor(novoDiretor);
											System.out.println("DIRETOR ATUALIZADO!");
											break;
										case 6:
											System.out.println(" Informe o novo ano de lançamento do filme: ");
											String novoAnoLancamento = entrada.nextLine();
											acervos.get(i).setAnoLancamento(novoAnoLancamento);
											System.out.println("ANO DE LANÇAMENTO ATUALIZADO!");
											break;
										case 7:
											System.out.println(" Informe a nova classificação indicativa do filme: ");
											String novaClassificacaoIndicativa = entrada.nextLine();
											acervos.get(i).setClassificacaoIndicativa(novaClassificacaoIndicativa);
											System.out.println("CLASSIFICAÇÃO INDICATIVA ATUALIZADA!");
											break;
										case 8:
											System.out.println("VOCÊ SAIU DA OPÇÃO DE EDIÇÃO DO FILME");
											break;
										default: 
											break;
										}
									} while (escolherOpcao !=8);
									break;
								////////////////////////// OPÇÃO DE REMOVER FILME(S) ///////////////////////////////
								case 2:
									System.out.println("|---------------------------------------|");
									System.out.println(" OPÇÃO DE REMOVER FILME SELECIONADA!!!  ");
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
											System.err.println("O titulo está incorreto, tente novamente!");
									break;		
										}
									}							
								
								default:
									
									break;
								}

							} while (opc != 3);

						} else {
							System.err.println("Esse filme não foi encontrado no acervo, informe novamente o titulo corretamente!");
					
					}
				}
				
			
		}
	}
