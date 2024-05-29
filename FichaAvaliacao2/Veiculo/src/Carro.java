import java.time.LocalDate;

public class Carro extends Veiculo {
    private boolean classico;
    private int numerodeLugares;

    //Classico
    public boolean isClassico() {
        return classico;
    }
    public void setClassico(boolean classico) {
        this.classico = classico;
    }
    // get e set de NumerodeLugares
    public int getNumerodeLugares() {
        return numerodeLugares;
    }
    public void setNumerodeLugares(int numerodeLugares) {
        this.numerodeLugares = numerodeLugares;
    }
    public Carro(String matricula, LocalDate dataDaMatricula, String marca, String modelo, int numeroderodas, float iuc,
            String tipoDeVeiculo, String combustivel, float kms, boolean classico, int numerodeLugares) {
        super(matricula, dataDaMatricula, marca, modelo, numeroderodas, iuc, tipoDeVeiculo, combustivel, kms);
        this.classico = classico;
        this.numerodeLugares = numerodeLugares;
    }
    
    public Carro() {
        this.classico = false;
        this.numerodeLugares = 0;
    }
    public void getInfo (){
        System.out.println("Classico: " + this.isClassico());
        System.out.println("Nome Curso : " + this.getNumerodeLugares());
        
        
    }
    @Override
    public String toString() {
        return "Carro [classico=" + classico + ", numerodeLugares=" + numerodeLugares + "]";
    }
    

    
}
