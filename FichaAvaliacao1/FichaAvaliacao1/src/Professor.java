public class Professor {
    private int numero;
    private String nomeProprio;
    private String nomeApelido;
    private int anoNascimento;
    private String area;

    //get de todos os atributos 
    public int getNumero() {
        return numero;
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
    public String getArea() {
        return area;
    }

    // set de todos os atributos 
    public void setNumero(int numero) {
        this.numero = numero;
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
    public void setArea(String area) {
        this.area = area;
    }

    public void getNomeCompleto(){
        System.out.println("Nome completo : " + this.getNomeProprio()+ this.getNomeApelido());
    }
    public Professor() {
        this(0,"","",0,"");
    }
    public Professor(int numero, String nomeProprio, String nomeApelido, int anoNascimento, String area) {
        this.numero = numero;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.area = area;
    }
    
    @Override
    public String toString() {
        return "Professor [numero=" + numero + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", area=" + area + "]";
    }
    
}
