import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Calendar;
public class Aluno {
    private String codigo;
    private String nomeProprio;
    private String nomeApelido;
    private int anoNascimento;
    private Turma turma;

    // get de todos os atributos 
    public String getCodigo() {
        return codigo;
    }
    public String getNomeProprio() {
        return nomeProprio;
    }
    public String getNomeApelido() {
        return nomeApelido;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public Turma getTurma() {
        return turma;
    }

    // set de todos de atributos 
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public void getNomeCompleto(){
        System.out.println("Nome completo : " + this.getNomeProprio()+" "+this.getNomeApelido());
    }
    // Funcao de getIdade
    public int getIdade (){
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            //Calendar nascimento = Calendar.of(anoNascimento);
            //Calendar hoje = Calendar.now();
            return Calendar.getInstance().get(anoNascimento); 
        
    }
    
    public Aluno() {
        this("","","",0,null);
    }
    public Aluno(String codigo, String nomeProprio, String nomeApelido, int anoNascimento, Turma turma) {
        this.codigo = codigo;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno [codigo=" + codigo + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", turma=" + turma + "]";
    } 

    

    
    
    
}
