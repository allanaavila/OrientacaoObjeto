public class Data{

  private int dia;
  private int mes;
  private int ano;

  public Data(int dia, int mes, int ano){
      if((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && ano > 0){

        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
      }
      else{
        
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
      }
  }

  public int getDia(){
    return this.dia;
  }

  public int getMes(){
    return this.mes;
  }

  public int getAno(){
    return this.ano;
  }

  public void setDia(int dia){
    this.dia = dia;
  }

  public void setMes(int mes){
    this.mes = mes;
  }

  public void setAno(int ano){
    this.ano = ano;
  }




}