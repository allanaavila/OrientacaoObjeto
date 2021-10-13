public class TV {
	
	public int polegadas;
	public int volume;
	public int canal;
	
	
	public void ajustarPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	
	public void ajustarCanal(int canal) {
		this.canal = canal;
	}
	
	public void ajustarVolume(int volume) {
		this.volume = volume;
	}
	
	
	public void quemSouEu() {
		
		System.out.println("Polegadas: " + this.polegadas);
		System.out.println("Canal: " + this.canal);
		System.out.println("Volume: " + this.volume);
	}
}
