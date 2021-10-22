package GerenciadorDeFilmes;

public abstract class Filme {
		
		protected int id;
		
			public int getId() {
			return id;
			}
			public void setId(int id) {
			this.id = id;
			}
		protected String titulo;
			 
			 public String getTitulo() {
				return titulo;
			}
			public void setTitulo(String titulo) {
				this.titulo = titulo;
			}
		
		protected String sinopse;
			
			public String getSinopse() {
				return sinopse;
			}
			public void setSinopse(String sinopse) {
				this.sinopse = sinopse;
			}			
}
			
			
			 
			 
			 
			
		
