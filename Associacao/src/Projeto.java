
public class Projeto {
	
	private String nomeProjeto;
	private String tipoProjeto;
	
	
	
	//construtor
	public Projeto(String nomeProjeto, String tipoProjeto) {
		
		this.nomeProjeto = nomeProjeto;
		this.tipoProjeto = tipoProjeto;
	}
	
	
	//getters e setters
	
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	public String getNomeProjeto() {
		return this.nomeProjeto;
	}
	
	public void setTipoProjeto(String tipoProjeto) {
		this.tipoProjeto = tipoProjeto;
	}
	public String getTipoProjeto() {
		return this.tipoProjeto;
	}

}
