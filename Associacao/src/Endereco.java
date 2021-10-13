
public class Endereco {
	
	private String endereco;
	private String complemento;
	private int numero;
	private String tipoEndereco;
	private String cep;
	private String cidade;
	private String estado;
	
	
	//construtor
	
	public Endereco(String endereco, String tipoEndereco, String cep,
						 int numero, String complemento, String cidade, String estado) {
		
		this.endereco = endereco;
		this.tipoEndereco = tipoEndereco;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	
	//getters e setters
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	public String getTipoEndereco() {
		return this.tipoEndereco;
	}
	
	public void setCEP(String cep) {
		this.cep = cep;
	}
	public String getCEP() {
		return this.cep;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return this.numero;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getComplemento() {
		return this.complemento;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return this.cidade;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstado() {
		return this.estado;
	}
}
