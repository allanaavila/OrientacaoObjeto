
public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String genero;
	private String cpf;
	private String dataNascimento;
	
	
	public Pessoa(){
		System.out.println("Pessoa Gerada!");
	}

	
	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getCPF() {
		return this.cpf;
	}
	
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	
	
	
}
