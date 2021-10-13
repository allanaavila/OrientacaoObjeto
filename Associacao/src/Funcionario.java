
public class Funcionario {
	
	private String numeroMatricula;
	private String regimeTrabalho;
	
	private Pessoa pessoa;
	private Filial filial;
	private Projeto projeto;
	
	
	
	//construtor
	public Funcionario(String numeroMatricula, String regimeTrabalho, Pessoa pessoa, Filial filial,
								Projeto projeto) {
		
		this.numeroMatricula = numeroMatricula;
		this.regimeTrabalho = regimeTrabalho;
		this.pessoa = pessoa;
		this.filial = filial;
		this.projeto = projeto;
	}
	
	
	//getters e setters
	
	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getNumeroMatricula() {
		return this.numeroMatricula;
	}
	
	public void setRegimeTrabalho(String regimeTrabalho) {
		 this.regimeTrabalho = regimeTrabalho;
	}
	public String getRegimeTrabalho() {
		return this.regimeTrabalho;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Pessoa getPessoa() {
		return this.pessoa;
	}
	
	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	public Filial getFilial() {
		return this.filial;
	}
	
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public Projeto getProjeto() {
		return this.projeto;
	}
}
