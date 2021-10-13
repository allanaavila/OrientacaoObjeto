
public class RG {
	
	private String numero;
	private String orgaoEmissor;
	private String filiacao;
	private String cidadeNascimento;
	private String dataEmissao;
	
	
	//construtor
	public RG(String numero, String orgaoEmissor, String filiacao, String cidadeNascimento,
			String dataEmissao) {
		
		this.numero = numero;
		this.orgaoEmissor = orgaoEmissor;
		this.filiacao = filiacao;
		this.cidadeNascimento = cidadeNascimento;
		this.dataEmissao = dataEmissao;
		
	}
	
	//getters e setters
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return this.numero;
	}
	
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
	public String getOrgaoEmissor() {
		return this.orgaoEmissor;
	}
	
	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}
	public String getFiliacao() {
		return this.filiacao;
	}
	
	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
	public String getCidadeNascimento() {
		return this.cidadeNascimento;
	}
	
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getDataEmissao() {
		return this.dataEmissao;
	}
}
