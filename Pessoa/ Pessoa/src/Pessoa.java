import java.time.LocalDate;
public class Pessoa {
    private String nome;   // ex: Luis Santos
    private int anoNascimento;    // ex: 1978
    private int mesNascimento;   // ex: 2
    private int diaNascimento;    // ex: 30
    private String pai;   // ex: objeto da classe Pessoa que pode ter ou não
    private String mae;   // ex: objeto da classe Pessoa 
    private int Idade;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    public String getPai() {
        return pai;
    }
    public void setPai(String pai) {
        this.pai = pai;
    }
    public String getMae() {
        return mae;
    }
    public void setMae(String mae) {
        this.mae = mae;
    }
    public Pessoa(String nome, int anoNascimento, int mesNascimento, int diaNascimento, String pai, String mae) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
        this.pai = pai;
        this.mae = mae;
    }
    public String Pessoa1(String nome, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
        return nome;
    }
    public int getIdade(int Idade,int anoNascimento,int mesNascimento,int diaNascimento){
        return Idade = anoNascimento - LocalDate(Idade);

    }

    private int LocalDate(int idade2) {
        
        throw new UnsupportedOperationException("Unimplemented method 'LocalDate'");
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", anoNascimento=" + anoNascimento + ", mesNascimento=" + mesNascimento
                + ", diaNascimento=" + diaNascimento + "]";
    }
    
}
