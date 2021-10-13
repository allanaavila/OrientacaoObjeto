
public class CPF {
	
	private String numero;
	private String dataEmissao;
	
	
	//Construtor
	public CPF(String numero, String dataEmissao) {
		this.numero = numero;
		this.dataEmissao = dataEmissao;
	}
	
	//Getters e Setters
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return this.numero;
	}
	
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getDataEmissao() {
		return this.dataEmissao;
	}

}
