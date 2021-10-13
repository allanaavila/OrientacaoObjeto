
public class Geladeira {
	
	private int capacidade;
	private int tensao;
	private int temperatura;
	private boolean degelo;
	
	public void informarCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void informarTensao(int tensao) {
		this.tensao = tensao;
	}
	
	public void informarTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public void informarDeGelo(boolean valor){
		 this.degelo = valor;
	}
	
	public void finalGeladeira() {
		
		System.out.println("Capacidade em Litros: " + this.capacidade);
		System.out.println("Tensao Eletrica: " + this.tensao);
		System.out.println("Temperatura: " + this.temperatura);
		
		if(this.degelo) {
			System.out.println("Degelo Ligado!");
		}
		else {
			System.out.println("Degelo Desligado!");
		}
	}

}
