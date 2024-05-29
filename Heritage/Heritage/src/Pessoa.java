import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Pessoa {
    private String nomeProprio;
    private String sobreNome;
    private LocalDate dataNascimento;
    private boolean falecido;
    private LocalDate dataFalacimento;
    private Pessoa pai;
    private Pessoa mae; 

    //get de todos os atributos 
    public String getNomeProprio() {
        return nomeProprio;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public Pessoa getPai() {
        return pai;
    }
    public Pessoa getMae() {
        return mae;
    }
    public LocalDate getDataFalacimento() {
        return dataFalacimento;
    }
    public boolean isFalecido() {
        return falecido;
    }
    
    //set de todos os atributos 
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    public void setDataFalacimento(LocalDate dataFalacimento) {
        this.dataFalacimento = dataFalacimento;
    }
    public void setFalecido(boolean falecido) {
        this.falecido = falecido;
    }
    //construtor com todos os atributos
    public Pessoa(String nomeProprio, String sobreNome, LocalDate dataNascimento,boolean falecido,LocalDate dataFalacimento, Pessoa pai, Pessoa mae) {
        this.nomeProprio = nomeProprio;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.falecido = falecido;
        this.dataFalacimento = dataFalacimento;
        this.pai = pai;
        this.mae = mae;
    }
    //construtor com os atributos vasios
    public Pessoa(){
            this.nomeProprio = ""; 
            this.sobreNome = "";
            this.dataNascimento = null;
            this.falecido = false;
            this.dataFalacimento = null;
            this.mae = null; 
            this.pai = null;
        }
        
        //to_string
        /*@Override
        public String toString() {
            String aux = "";
            aux += "Pessoa [nomeProprio=" + nomeProprio + ", ";
            aux += "sobreNome=" + sobreNome + ", ";
            aux += "dataNascimento=" + dataNascimento + "";

            aux += "\n\t pai de("+nomeProprio+""+sobreNome+ ")";
            aux += "\n\t pai=" + pai + "\t mae= " + mae + "\n";
            return aux ;
        }*/
        //IDADE
        public int getIdade(){
            LocalDate dataAtual = LocalDate.now();
            Period periodo = Period.between(dataNascimento, dataAtual);
            return periodo.getYears();
        }
        // FALACIMENTO
        public int getIdadeFalacimento(){
            Period periodo = Period.between(dataFalacimento,dataNascimento);
            return periodo.getYears();
        }
        // DESCENDENCIA
        public String mostraDescendencia(int nivel){
            String aux = "\n";
            for (int i=0; i<nivel; i++) aux += "\t ";
            aux += nomeProprio + "("; //+ this.getIdade() + ")";
            if(this.falecido){
                aux += "faleceu com " + this.getIdadeFalacimento();
            }else {
                aux += this.getIdade();
            }
            aux += "anos)";
            if(pai != null) {
                aux += pai.mostraDescendencia(nivel +1);
            }
            if(mae != null) {
                aux += mae.mostraDescendencia(nivel +1);
            }
            return aux ;   
        }
        
       
        
        
        /*metodo para calcular a idade
        public int getIdade (){
            LocalDate nascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
            LocalDate hoje = LocalDate.now();
            return Period.between(nascimento, hoje).getYears(); 
        }*/

        /*@Override
        public String toString() {
        String paiNome = (pai != null) ? pai.getnomeProprio() : "";
        String maeNome = (mae != null) ? mae.getnomeProprio() : "";
        return "Nome: " + nome + ", Idade: " + getIdade() + ", Pai: " + paiNome + ", Mae: " + maeNome;

        }*/    
        
}
