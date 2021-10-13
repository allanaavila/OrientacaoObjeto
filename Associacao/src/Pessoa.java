
public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String genero;
	
	private CPF cpf;
	private RG rg;
	private Endereco endereco;
	
	
	// Construtor
	public Pessoa(String nome, String sobrenome, String genero, CPF cpf, RG rg, Endereco endereco) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.genero = genero;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}
	
	
	// Getters e Setters
	
	public void setNome(String nome) {
		this.nome  = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGenero() {
		return this.genero;
	}
	
	public void setCPF(CPF cpf) {
		this.cpf = cpf;
	}
	public CPF getCPF() {
		return this.cpf;
	}
	
	public void setRG(RG rg) {
		this.rg = rg;
	}
	public RG getRG() {
		return this.rg;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	
}
