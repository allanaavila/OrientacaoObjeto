
public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Allana");
		pessoa.setSobrenome("Avila");
		pessoa.setGenero("Feminino");
		pessoa.setDataNascimento("28/10/1995");
		pessoa.setCPF("111.111.111-00");
		
		System.out.println("Nome Completo: " + pessoa.getNome() + " " + pessoa.getSobrenome());
		System.out.println("Genero: " + pessoa.getGenero());
		System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
		System.out.println("CPF: " + pessoa.getCPF());
		
		
	}

}
