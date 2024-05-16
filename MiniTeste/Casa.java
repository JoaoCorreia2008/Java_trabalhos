public class Casa {
    // atributos da classe casa 
    private String tipodecasa = "";
    private int numandares = 0;
    private int numquartos = 0;
    private int numWcs = 0;
    private int areaBruta = 0;
    private int areaUtil = 0;

    // set Tipo de Casa
    public void settipocasa (String txt){
        this.tipodecasa = txt;
    }
     // get Tipo de Casa
     public String gettipocasa (){
        return this.tipodecasa;
    }
    // set NumAndares
    public void setnumandares (int num){
        this.numandares = num;
    }
     // get NumAndares
     public int getnumandares (){
        return this.numandares;
    }
     // set NumQuartos
     public void setnumquartos (int num){
        this.numquartos = num;
    }
     // get NumQuartos
     public int getnumquartos (){
        return this.numquartos;
    }
     // set NumWcs
     public void setnumWcs (int num){
        this.numWcs = num;
    }
     // get NumWcs
     public int getnumWcs (){
        return this.numWcs;
    }
     // set areaBruta
     public void setareaBruta (int num){
        this.areaBruta = num;
    }
     // get areaBruta
     public int getareaBruta (){
        return this.areaBruta;
    }
     // set areaUtil
     public void setareaUtil (int num){
        this.areaUtil = num;
    }
     // get areaUtil
     public int getareaUtil (){
        return this.areaUtil;
    }
    public void mostrarInfo (){
        System.out.println("Tipo de casa: " + this.gettipocasa());
        System.out.println("Numeros de Andares: " + this.getnumandares());
        System.out.println("Numeros de Quartos: " + this.getnumquartos());
        System.out.println("Numeros de Wcs: " + this.getnumWcs());
        System.out.println("Area Bruta: " + this.getareaBruta());
        System.out.println("Area Util: " + this.getareaUtil());
    }
    public Casa (String tipocasax, int numandaresx, int numquartosx, int numWcsx,int areaBrutax, int areaUtilx ){
        this.tipodecasa = tipocasax;
        this.numandares = numandaresx;
        this.numquartos = numquartosx;
        this.numWcs = numWcsx;
        this.areaBruta = areaBrutax;
        this.areaUtil = areaUtilx;
    }
}
