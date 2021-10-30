package GerenciadorDeFilmes;

public class Categoria extends Filme {
		
		private String categoriaDoFilme;
		private String paisOrigem;
		private String diretor;
		private String anoLancamento;
		private String classificacaoIndicativa;
		
		public Categoria(String titulo, String sinopse, String categoriaDoFilme, String paisOrigem, String diretor, String classificacaoIndicativa, String anoLançamento, String classificacaoIndicativa1) {
		super();
		this.titulo=titulo;
		this.sinopse=sinopse;
		this.categoriaDoFilme=categoriaDoFilme;
		this.paisOrigem=paisOrigem;
		this.diretor=diretor;
		this.anoLancamento=anoLançamento;
		this.classificacaoIndicativa=classificacaoIndicativa1;
		}
		
		public String getCategoriaDoFilme() {
			return categoriaDoFilme;
		}

		public void setCategoriaDoFilme(String categoriaDoFilme) {
			this.categoriaDoFilme = categoriaDoFilme;
		}

		public String getPaisOrigem() {
			return paisOrigem;
		}

		public void setPaisOrigem(String paisOrigem) {
			this.paisOrigem = paisOrigem;
		}

		public String getDiretor() {
			return diretor;
		}

		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}

		public String getAnoLancamento() {
			return anoLancamento;
		}

		public void setAnoLancamento(String anoLançamento) {
			this.anoLancamento = anoLançamento;
		}

		public String getClassificacaoIndicativa() {
			return classificacaoIndicativa;
		}

		public void setClassificacaoIndicativa(String classificacaoIndicativa) {
			this.classificacaoIndicativa = classificacaoIndicativa;
		}

}