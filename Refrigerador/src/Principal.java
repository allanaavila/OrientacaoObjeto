
public class Principal {

	public static void main(String[] args) {
		
		
		Geladeira geladeira = new Geladeira();
		
		
		geladeira.informarCapacidade(450);
		geladeira.informarTensao(220);
		geladeira.informarTemperatura(18);
		geladeira.informarDeGelo(true);
		
		
		geladeira.finalGeladeira();

	}

}
