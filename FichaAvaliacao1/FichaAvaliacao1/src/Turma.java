public class Turma {
    private String codigo;
    private String nomeCurso;
    private int anoInicio;
	private int anoFim;
    
    // get de todos os atributos
    public String getCodigo() {
        return codigo;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public int getAnoInicio() {
        return anoInicio;
    }
    public int getAnoFim() {
        return anoFim;
    }

    // set de todos os atributos 
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }
    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }
    
    public Turma() {

        this("", "", 0,0);
        
    }
    
    public Turma(String codigo, String nomeCurso, int anoInicio, int anoFim) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
    }
    // informacao da Turma 
    public void getInfoTurma (){
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Nome Curso : " + this.getNomeCurso());
        System.out.println("Ano Inicio: " + this.getAnoInicio());
        System.out.println("Ano fim: " + this.getAnoFim());
        
    }
    @Override
    public String toString() {
        return "Turma [codigo=" + codigo + ", nomeCurso=" + nomeCurso + ", anoInicio=" + anoInicio + ", anoFim="
                + anoFim + "]";
    }

    

}
