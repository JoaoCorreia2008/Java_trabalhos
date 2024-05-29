import java.time.LocalDate;

public class Mota extends Veiculo {
    private  boolean pagaIuc;
    private String suporteMalas;

    public boolean isPagaIuc() {
        return pagaIuc;
    }
    public void setPagaIuc(boolean pagaIuc) {
        this.pagaIuc = pagaIuc;
        if(pagaIuc == false) this.setIuc(0.0f);
    }
    public String getSuporteMalas() {
        return suporteMalas;
    }
    public void setSuporteMalas(String suporteMalas) {
        this.suporteMalas = suporteMalas;
    }
    public void getInfo (){
        System.out.println("Codigo: " + this.isPagaIuc());
        System.out.println("Nome Curso : " + this.getSuporteMalas());
       
    }
    public Mota(String matricula, LocalDate dataDaMatricula, String marca, String modelo, int numeroderodas, float iuc,
            String tipoDeVeiculo, String combustivel, float kms, boolean pagaIuc, String suporteMalas) {
        super(matricula, dataDaMatricula, marca, modelo, numeroderodas, iuc, tipoDeVeiculo, combustivel, kms);
        this.pagaIuc = pagaIuc;
        this.suporteMalas = suporteMalas;
    }
    public Mota(boolean pagaIuc, String suporteMalas) {
        this.pagaIuc = false;
        this.suporteMalas = "";
    }

    @Override
    public String toString() {
        return "Mota [pagaIuc=" + pagaIuc + ", suporteMalas=" + suporteMalas + "]";
    }
    

    
    
}
