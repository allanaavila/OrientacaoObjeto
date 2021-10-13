
public class Main {

	public static void main(String[] args) {
		
		
		CPF documentoCPF = new CPF("123.456.789-00","01/02/2019");
		
		RG meuRG = new RG("123123-89", "SSP", "Viviane Helena Mendes", "Alfenas - MG", "28/10/2000");
		
		Endereco meuEnd = new Endereco("Rua Mil Oitocentos e Vinte Dois", "Residencial", "04216-001",
											895, "Apto 405", "Sao Paulo", "SP");
		
		
		Pessoa pessoa = new Pessoa("Allana", "Avila", "Feminino", documentoCPF, meuRG, meuEnd);
		
		
		System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome() + "\n" + "CPF: " +
							pessoa.getCPF().getNumero() + "\n" + "RG: " +pessoa.getRG().getNumero() +
							"\n" + "Endereco:  " + pessoa.getEndereco().getEndereco());
		
		
		Endereco endFilial  = new Endereco("Rua Professora Aurea Engel", "Residencial", "03199-000", 55, 
				"Casa", "Minas Gerais", "MG");
		
		Filial filial = new Filial("Avila Modas" , endFilial);
		
		Projeto projeto = new Projeto("Roupas Promocao", "Vendas");
		
		Funcionario funcionario = new Funcionario("123457", "CLT", pessoa, filial, projeto);
		
		
		System.out.println("Nome Filial: " + filial.getNomeFilial() + "\n" + "Endereco Filial: " + 
							endFilial.getEndereco() +	"\n" + "Projeto: " + projeto.getNomeProjeto());
		
		
	}

}
