import java.time.LocalDate;
import java.time.Period;
public class Veiculo {
    private String matricula;
    private LocalDate dataDaMatricula;
    private String marca;
    private String modelo;
    private int numeroderodas;
    private float iuc;
    private String tipoDeVeiculo;
    private String combustivel;
    private float kms;

    //get e set Matricula
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Data Matricula
    public LocalDate getDataDaMatricula() {
        return dataDaMatricula;
    }
    public void setDataDaMatricula(LocalDate dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }

    //get e set Marca
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //get e set Modelo
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //get e set Num Rodas
    public int getNumeroderodas() {
        return numeroderodas;
    }
    public void setNumeroderodas(int numeroderodas) {
        this.numeroderodas = numeroderodas;
    }

    //iuc
    public float isIuc() {
        return iuc;
    }
    public void setIuc(float iuc) {
        this.iuc = iuc;
    }
    //get e set tipo de Veiculo
    public String getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }
    public void setTipoDeVeiculo(String tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }
    //get e set Combustivel
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    //KMS
    public float isKms() {
        return kms;
    }
    public void setKms(float kms) {
        this.kms = kms;
    }

    public int getIdade(){
            LocalDate dataAtual = LocalDate.now();
            Period periodo = Period.between(dataDaMatricula, dataAtual);
            return periodo.getYears();
        }
    
    public Veiculo(String matricula, LocalDate dataDaMatricula, String marca, String modelo, int numeroderodas,
            float iuc, String tipoDeVeiculo, String combustivel, float kms) {
        this.matricula = matricula;
        this.dataDaMatricula = dataDaMatricula;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroderodas = numeroderodas;
        this.iuc = iuc;
        this.tipoDeVeiculo = tipoDeVeiculo;
        this.combustivel = combustivel;
        this.kms = kms;
    }
    public Veiculo() {
        this.matricula = "";
        this.dataDaMatricula = null;
        this.marca = "";
        this.modelo = "";
        this.numeroderodas = 0;
        this.iuc = 0;
        this.tipoDeVeiculo = "";
        this.combustivel = "";
        this.kms = 0;
    }

    @Override
    public String toString() {
        return "Veiculo [matricula=" + matricula + ", dataDaMatricula=" + dataDaMatricula + ", marca=" + marca
                + ", modelo=" + modelo + ", numeroderodas=" + numeroderodas + ", iuc=" + iuc + ", tipoDeVeiculo="
                + tipoDeVeiculo + ", combustivel=" + combustivel + ", kms=" + kms + "]";
    }
    

    

    
}
