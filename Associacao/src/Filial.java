
public class Filial {
	
	private String nomeFilial;
	
	
	private Endereco  endereco;
	
	
	
	//construtor
	public Filial(String nomeFilial, Endereco endereco) {
		
		this.nomeFilial = nomeFilial;
		this.endereco = endereco;
	}
	
	
	//getters e setters
	
	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
	}
	
	public String getNomeFilial() {
		return this.nomeFilial;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	

}
