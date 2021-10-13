
public class TipoTV {

	public static void main(String[] args) {
		
		TV minhaTV = new TV();
		
		minhaTV.ajustarPolegadas(50);
		minhaTV.ajustarCanal(27);
		minhaTV.ajustarVolume(15);
		
		
		
		minhaTV.quemSouEu();
		
		
		System.out.println("______________________ \n");
		
		
		TV minhaNovaTV = minhaTV;
		
		minhaTV.ajustarPolegadas(55);
		minhaTV.ajustarCanal(15);
		minhaTV.ajustarVolume(10);
		
		minhaNovaTV.quemSouEu();
		
		
	}

}
