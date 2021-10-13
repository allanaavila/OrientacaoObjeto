
public class Main {

	public static void main(String[] args) {
		
	    Empregado e = new Empregado("Allana", "Avila", 10000.00);

	    //Empregado e1 = new Empregado("Mariana", "Mendes", 5000);

	    System.out.println(e.getSalarioMensal()* 12);

	    e.setSalarioMensal(e.getSalarioMensal()*1.1);

	    System.out.println(e.getSalarioMensal());

	}

}
