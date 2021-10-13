
public class Main {

	public static void main(String[] args) {
		
		
		Voo v = new Voo(3254, new Data(30,4,2020,12,18));

	    System.out.println(v.vagas() + " vagas");
	    v.ocupa(53);
	    v.ocupa(24);

	    System.out.println(v.vagas() + " vagas");

	    System.out.println(v.proximoLivre() + " proximo livre");

	    System.out.println(v.ocupa(1));

	    System.out.println(v.proximoLivre() + " proximo livre");

	    System.out.println(v.ocupa(1));

	}

}
