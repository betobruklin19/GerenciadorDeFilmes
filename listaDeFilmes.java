package GerenciadorDeFilmes;

import java.util.ArrayList;
import java.util.Scanner;

public class listaDeFilmes {

			private static ArrayList<AcervoFilmes> acervo = new ArrayList<>();

			////////////////////////// CADASTRAR FILME(S) ///////////////////////////////
			
			public static void cadastrarFilme() {
				
				try (Scanner input = new Scanner(System.in)) {
					System.out.println("|---------------------------------------|");
					System.out.println("|---- CADASTRAR FILME ----|");
					System.out.println("|---------------------------------------|");
					System.out.println("-- Informe o t�tulo do filme: --");
					String titulo = input.nextLine();

					System.out.println("|---------------------------------------|");
					System.out.println("-- Informe a sinopse do filme: --");
					System.out.println("|---------------------------------------|");
					String sinopse = input.nextLine();

					System.out.println("|---------------------------------------|");
					System.out.println("-- Informe a AcervoFilmes do filme: --");
					System.out.println("|---------------------------------------|");
					String AcervoFilmesDoFilme = input.nextLine();

					System.out.println("|---------------------------------------|");
					System.out.println("-- Informe o pa�s de origem do filme: --");
					System.out.println("|---------------------------------------|");
					String paisOrigem = input.nextLine();

					System.out.println("|---------------------------------------|");
					System.out.println("-- Informe o nome do diretor do filme: --");
					System.out.println("|---------------------------------------|");
					String diretor = input.nextLine();
					
					System.out.println("|---------------------------------------|");
					System.out.println("-- Informe o ano de lan�amento do filme: --");
					System.out.println("|---------------------------------------|");
					String anoLancamento = input.nextLine();
					
					String classificacaoIndicativa = input.nextLine();
					
					AcervoFilmes AcervoFilmes = new AcervoFilmes(titulo, sinopse, AcervoFilmesDoFilme, paisOrigem, diretor, anoLancamento, classificacaoIndicativa, classificacaoIndicativa);

					acervo.add(AcervoFilmes);
				}

				System.out.println("|---------------------------------------|");
				System.out.println("-- FILME CADASTRADO COM SUCESSO!!!: --");
				System.out.println("|---------------------------------------|");
			}
			
			//////////////////////////LISTAR FILME(S) ///////////////////////////////
			
			public static void listarFilme() {

				System.out.println("|---------------------------------------|");
				System.out.println("-- OP��O LISTAR FILMES SELECIONADA!!!: --");
				System.out.println("|---------------------------------------|");
				
				for (AcervoFilmes AcervoFilmes : acervo) {
					System.out.println("|--------------------------------------------------------|\n");
					System.out.println(" Titulo do filme :" + acervo.getTitulo());
					System.out.println(" Sinopse :" + acervo.getSinopse());
					System.out.println(" AcervoFilmes :" + acervo.getAcervoFilmesDoFilme());
					System.out.println(" Pa�s de origem :" + acervo.getPaisDeOrigem());
					System.out.println(" Diretor :" + acervo.getDiretor());
					System.out.println(" Ano de Lan�amento :" + acervo.getAnoDeLancamento());
					System.out.println(" Classifica��o Indicativa : " + acervo.getClassificacaoIndicativa);
					System.out.println("|--------------------------------------------------------|\n");
				}
			}
			//////////////////////////PESQUISAR FILME(S) ///////////////////////////////
			
			public static void pesquisar() {

				System.out.println("|---------------------------------------|");
				System.out.println("-- OP��O PESQUISAR FILME SELECIONADA!!!: --");
				System.out.println("|---------------------------------------|");

				Scanner input = new Scanner(System.in);

				System.out.println("* Informe o titulo do filme que quer pesquisar: *");
				String titulo = input.nextLine();
				
				//////////////////////////SUBMENU DE EDI��O E EXCLUS�O///////////////////////////////
				
				for (AcervoFilmes acervo : acervo) {
					if (acervo.getTitulo().equals(titulo)) {
						int opc = 1;
						
						do {

							System.out.println("|------------------------------------------------|"
									+ "\n|-------------------------------------------------------|"
									+ "\n| 					1 - Editar Filme                     |"
									+ "\n|-------------------------------------------------------|"
									+ "\n|-------------------------------------------------------|"
									+ "\n| 					2 - Remover Filme                    |"
									+ "\n|-------------------------------------------------------|"
									+ "\n|-------------------------------------------------------|"
									+ "\n| 					3 - Encerrar                         |"
									+ "\n|-------------------------------------------------------|"
									+ "\n|-------------------------------------------------------|");

							System.out.println(" Informe a op��o desejada: ");
							opc = input.nextInt();

							switch (opc) {
							////////////////////////// OP��O DE EDI��O DO FILME(S) ///////////////////////////////
								case 1:
								Scanner entrada = new Scanner(System.in);
								int escolherOpcao = 1;
								do {

									System.out.println("|-----------------------------------------------------|"
											+ "\n|     			Escolha qual op��o deseja editar?             |"
											+ "\n|------------------------------------------------------------|"								
											+ "\n|        			1 - Titulo                                |"
											+ "\n|            		2 - Sinopse                               |"
											+ "\n|		            3 - AcervoFilmes                             |"
											+ "\n|                  4 - Pa�s de Origem                        |"
											+ "\n|         			5 - Diretor                               |"
											+ "\n| 			        6 - Ano de Lan�amento                     |"
											+ "\n|                  7 - Classifica��o Indicativa              |"
											+ "\n|------------------------------------------------------------|");

									System.out.println(" Informe a op��o desejada: ");
									escolherOpcao = input.nextInt();

									switch (escolherOpcao) {
									case 1:
										System.out.println(" Informe o novo titulo do filme: ");
										String novoTitulo = entrada.nextLine();
										acervo.setTitulo(novoTitulo);
										System.out.println("T�TULO DO FILME ATUALIZADO!!!");
										break;
									case 2:
										System.out.println(" Informe a nova sinopse do filme: ");
										String novaSinopse = entrada.nextLine();
										acervo.setSinopse(novaSinopse);
										System.out.println("SINOPSE ATUALIZADA!");
										break;
									case 3:
										System.out.println(" Informe a nova AcervoFilmes do filme: ");
										String novaAcervoFilmes = entrada.nextLine();
										acervo.setAcervoFilmesDoFilme(novaAcervoFilmes);
										System.out.println("AcervoFilmes ATUALIZADA!");
										break;
									case 4:
										System.out.println(" Informe o novo pa�s de origem do filme: ");
										String novoPaisOrigem = entrada.nextLine();
										acervo.setPaisOrigem(novoPaisOrigem);
										System.out.println("PA�S DE ORIGEM ATUALIZADO!");
										break;
									case 5:
										System.out.println(" Informe o novo diretor do filme: ");
										String novoDiretor = entrada.nextLine();
										acervo.setDiretor(novoDiretor);
										System.out.println("DIRETOR ATUALIZADO!");
									case 6:
										System.out.println(" Informe o novo ano de lan�amento do filme: ");
										String novoAnoLancamento = entrada.nextLine();
										acervo.setAnoLancamento(novoAnoLancamento);
										System.out.println("ANO DE LAN�AMENTO ATUALIZADO!");
										break;
									case 7:
										System.out.println(" Informe a nova classifica��o indicativa do filme: ");
										String novaClassificacaoIndicativa = entrada.nextLine();
										acervo.setClassificacaoIndicativa(novaClassificacaoIndicativa);
										System.out.println("CLASSIFICA��O INDICATIVA ATUALIZADA!");
										break;
									default:
										break;
									}
								} while (escolherOpcao != 7);
								break;
							////////////////////////// OP��O DE REMOVER FILME(S) ///////////////////////////////
							case 2:
								System.out.println("|---------------------------------------|");
								System.out.println("-- OP��O DE REMOVER FILME SELECIONADA!!!: --");
								System.out.println("|---------------------------------------|");
								Scanner remover = new Scanner(System.in);
								System.out.println("Informe o titulo do filme: ");
								String removerfilme = remover.nextLine();

								for (AcervoFilmes acervoRemover : acervo) {
									if (acervoRemover.getTitulo().equals(removerfilme)) {
										acervo.remove(removerfilme);
										System.out.println("filme removido com sucesso! ");
									} else {
										System.err.println("O titulo est� incorreto, tente novamente!");
									}
								}
								break;
							
							default:
								
								break;
							}

						} while (opc != 3);

					} else {
						System.err.println(
								"Esse filme n�o foi encontrado no acervo, informe novamente o titulo corretamente!");
					}
				}
			}

		}
