
public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	private int horas;
	private int minuto;
	
	
	public Data(int dia, int mes, int ano) {
		if((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && ano >0) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			this.horas = 0;
			this.minuto = 0;
		}
		else {
			this.dia = 0;
			this.mes = 0;
			this.ano = 0;
			this.horas = 0;
			this.minuto = 0;
		}
	}
	
	public Data(int dia, int mes, int ano, int horas, int minuto) {
		
		if((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && ano > 0 && horas > 0 && minuto > 0) {
			
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			this.horas = horas;
			this.minuto = minuto;
		}
		else {
			this.dia = 0;
			this.mes = 0;
			this.ano = 0;
			this.horas = 0;
			this.minuto = 0;
		}
		
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getDia() {
		return this.dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getMes() {
		return this.mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return this.ano;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getHoras() {
		return this.horas;
	}
	
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getMinuto() {
		return this.minuto;
	}
	

}
