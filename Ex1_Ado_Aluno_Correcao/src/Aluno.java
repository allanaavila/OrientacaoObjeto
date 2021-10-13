import java.lang.*;
import java.util.*;


public class Aluno{

   private String nomeAluno;
   private String nomeFaculdade;
   private String curso;
   private Data dataNascimento;
   private Data dataIngresso;

   public Aluno(String nomeAluno, String nomeFaculdade, String curso, Data dataNascimento, Data dataIngresso){
      this.nomeAluno = nomeAluno;
      this.nomeFaculdade = nomeFaculdade;
      this.curso = curso;
      this.dataNascimento = dataNascimento;
      this.dataIngresso = dataIngresso;

   }  

  public void setNomeAluno(String nomeAluno){
    this.nomeAluno = nomeAluno;
  }

  public void setNomeFaculdade(String nomeFaculdade){
    this.nomeFaculdade = nomeFaculdade;
  }

  public void setCurso(String curso){
    this.curso = curso;
  }

  public void setDataNascimento(Data dataNascimento){
    this.dataNascimento = dataNascimento;
  }

  public void setDataIngrssso(Data dataIngresso){
    this.dataNascimento = dataNascimento;
  }

  public String getAll(){
    String saida = "";
    saida += this.nomeAluno + "\n";
    saida += this.nomeFaculdade + "\n";
    saida += this.curso + "\n";
    saida += Integer.toString(this.dataNascimento.getDia()) + "/";
    saida += Integer.toString(this.dataNascimento.getMes()) + "/";
    saida += Integer.toString(this.dataNascimento.getAno()) + "\n";
    saida += Integer.toString(this.dataIngresso.getDia()) + "/";
    saida += Integer.toString(this.dataIngresso.getMes()) + "/";
    saida += Integer.toString(this.dataIngresso.getAno()) + "\n";
    saida += Integer.toString(this.numeroMeses()) + " meses";

    return saida;

  }

  private int numeroMeses(){
    //timestamp
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);

    int anoAtual = calendar.get(Calendar.YEAR);
    int mesAtual = calendar.get(Calendar.MONTH) + 1;

    int contador = 0;
    int mesesAnoIngresso = 0;
    int mesesAnoAtual = 0; 

    //mesesAnoIngresso
    for(int i = this.dataIngresso.getMes() + 1; i <= 12 ; i++){
        mesesAnoIngresso++;
    }

   //mesesAnoAutal
    for(int i = 1; i <= mesAtual; i++){
      mesesAnoAtual++;
    }

    //anos 
    for(int i = this.dataIngresso.getAno() + 1; i < anoAtual; i++){
      contador++;
    }

    return contador * 12 + mesesAnoAtual + mesesAnoIngresso;
  }
   



}