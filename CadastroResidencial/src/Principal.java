
public class Principal {

	public static void main(String[] args) {
		
		Cadastro cadastro = new Cadastro();
		
		
		cadastro.setTipoResidencia("Casa");
		cadastro.setCEP("04216-001");
		cadastro.setEndereco("Rua Mil Oitocentos e Vinte e Dois");
		cadastro.setNumeroEnd("895");
		cadastro.setComplemento("Apto 405");
		cadastro.setNumComodos("5");
		
		
		System.out.println("Cadastro Residencial! \n");
		
		System.out.println("Tipo Residencia: " + cadastro.getTipoResidencia());
		System.out.println("CEP: " + cadastro.getCEP());
		System.out.println("Endereco: " + cadastro.getEndereco());
		System.out.println("Numero: " + cadastro.getNumeroEnd());
		System.out.println("Complemento: " + cadastro.getComplemento());
		System.out.println("Numero de Comodos: " + cadastro.getNumComodos());

	}
}
