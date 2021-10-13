
public class Voo {
	
	private int numeroVoo;
	private Data data;
	private int assentos[];
	
	
	public Voo(int numeroVoo, Data data) {
		this.numeroVoo = numeroVoo;
		this.data = data;
		
		//configuracao dos assentos
		assentos = new int[100];
		for(int i = 0; i < 100; i++) {
			this.assentos[i] = 0;
		}
	}
	
	public int proximoLivre() {
		
		for(int i = 0; i < 100; i++) {
			if(this.assentos[i] == 0) {
				return i + 1;
			}
		}
		return - 1 ;
	}
	
	public boolean ocupa(int assento) {
		
		if(assento >= 1 && assento <= 100) {
			if(assentos[assento - 1] == 0) {
				this.assentos[assento - 1] = 1;
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public int vagas() {
		
		int cont = 0;
		
		for(int i = 0; i < 100; i++) {
			if(this.assentos[i] == 0) {
				cont++;
			}
		}
		return cont;
	}
	
	public int getVoo() {
		return this.numeroVoo;
	}
	
	public Data getData() {
		return this.data;
	}
	
	public Voo clone() {
		
		// copia data
		
		Data dataClone = new Data(this.data.getDia(), this.data.getMes(), this.data.getAno(), 
									this.data.getHoras(), this.data.getMinuto());
		
		// copia assentos
		
		return new Voo(this.numeroVoo, dataClone);
	}

}

	
