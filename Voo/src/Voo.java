import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Voo {
	
	 private int idVoo;
	    private Date dataVoo;
	    private String horarioVoo;
	    private int ocupacaoVoo;
	    private LinkedList<String> vagaLivre = new LinkedList<String>();
	    
	    Voo(int idVoo, Date dataVoo, String horarioVoo) {
	    
	        this.idVoo = idVoo;
	        this.dataVoo = dataVoo;
	        this.horarioVoo = horarioVoo;
	        this.ocupacaoVoo = 0;
	        
	        for (int i = 0; i < 100; i++) {
	            vagaLivre.add(Integer.toString(i + 1));
	        }
	      
	    }
	    
	    public int getVoo() {
	        return this.idVoo;
	    }
	    
	    public void setVoo(int idVoo) {
	        this.idVoo = idVoo;
	    }
	    
	    public String getData() {
	        // Defini formato para trablhar com datas
	        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        // Inseri Data do Voo
	        return formato.format(this.dataVoo);
	    }
	    
	    public void setData(int dataVoo) {
	        this.idVoo = dataVoo;
	    }
	    
	    // Metodo para verificar proxima vaga livre 
	    public int proximoLivre() {
	    
	        if (this.ocupacaoVoo < 100) {
	            return Integer.parseInt(vagaLivre.getFirst());
	        }
	        return 0;
	    }
	    
	    // Metodo para verificar se a vaga está ocupada ou livre
	    public String verifica(int vaga) {
	    
	        if (vaga <= 0 || vaga > 100) {
	            return "Essa vaga não existe!";
	        } else {
	            if (vagaLivre.contains(Integer.toString(vaga))) {
	                return "Vaga livre.";
	            } else {
	                return "Vaga ocupada.";
	            }
	        }
	    }
	    
	    // Metodo para ocupar a vaga 
	    public boolean ocupa(int vaga) {
	    
	        if (verifica(vaga).equals("Essa vaga não existe!")|| verifica(vaga).equals("Vaga Ocupada.")) { 
	            return false;  
	        } else {  
	            this.vagaLivre.remove(Integer.toString(vaga));
	            this.ocupacaoVoo++;
	            return true;  
	        }
	            
	    }
	 
	    // Metodo para mostrar as vagas disponiveis
	    public int vagas() {
	        return 100 - this.ocupacaoVoo;  
	    }
	    
	    // Metodo para clonar voo
	    public Voo clone(Voo voo) {
	        Voo novo = new Voo(voo.idVoo, voo.dataVoo, voo.horarioVoo);
	        novo.ocupacaoVoo = voo.ocupacaoVoo;
	        novo.vagaLivre = voo.vagaLivre;
	        return novo;
	    }
	    
	}

