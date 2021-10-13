import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

public static void main(String[] args) throws ParseException {
        
        System.out.println("----------------------EXERCICIO - 2-------------------------");
        System.out.println("------------------------------------------------------------");
        
        // Defini formato para trablhar com datas
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        // Inseri Data do Voo
        Date dataVoo = formato.parse("23/11/2015");
       
        System.out.println("------------------------------------------------------------");
        
        // Cria objeto voo
        Voo metodo = new Voo(1,dataVoo,"12:00");
        // Indica proxima vaga livre
        System.out.println("Proximo vaga no voo livre: "+metodo.proximoLivre());
        // Ocupa vaga
        System.out.println("Ocupar vaga?: "+metodo.ocupa(1));
        //verifica vaga
        System.out.println("Vaga ocupada?: "+metodo.verifica(1));
        // Mostra quantidade de vagas
        System.out.println("Quantidade de vagas livres: "+metodo.vagas());
        // Mostra Voo
        System.out.println("Numero do Voo: "+metodo.getVoo());
        // Mostra Data do Voo
        System.out.println("Data do Voo: "+metodo.getData());
        // Clona Voo
        System.out.println("Identificação da passagem igual: "+metodo.clone(metodo));
       
        System.out.println("------------------------------------------------------------");
    }
}

