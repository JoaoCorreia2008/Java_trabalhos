public class Leitor {
    private int numero;
    private String nome;
    private String morada;
    private int telefone;
    private String email;
    private String genero;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Leitor() {
        this.numero = 0;
        this.nome = "";
        this.morada = "";
        this.telefone = 0;
        this.email = "";
        this.genero = "";
    }
    
    
    @Override
    public String toString() {
        return "Leitore [numero=" + numero + ", nome=" + nome + ", morada=" + morada + ", telefone=" + telefone + ", email=" + email + ", genero=" + genero + "]";
    }
    
    
}
