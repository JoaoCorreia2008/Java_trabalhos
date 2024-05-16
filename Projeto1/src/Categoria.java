
public class Categoria {
    /*
     * slug da categoria 
     * nome da categoria 
     * nome da categoria pai ** se tiver !!!
     */
    private String slug ;
    private String name;
    private Categoria pai;
    

    public String getslug() {
        return slug;
    }

    public void setslug(String slug) {
        this.slug = slug;
    }

    public String getname() {
        return name;
    }

    public void setSobrenome(String name) {
        this.name = name;
    }
    public Categoria getpai() {
        return pai;
    }

    public void setpai(Categoria pai) {
        this.pai = pai;
    }


    public Categoria(String nome, String sobrenome,Categoria pai)
     {
        this.name = "";
        this.slug = "";
        this.pai = null;
    }
    public Categoria() {
    }

    @Override
    public String toString() {
        return "Categoria [slug=" + slug + ", name=" + name + ", pai=" + pai + "]";
    }

    
}
