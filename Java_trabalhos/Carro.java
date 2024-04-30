// javac Main.java
// java -cp . Main
class Viatura {
    protected String brand = "Ford";

    public void buzinar(){
        System.out.println("Tuut, Tuut!");
    }
}
public class Carro  extends Viatura  {
    // atributos da classe !!
        private String marca = "";
        private String modelo = "";
        private String matricula = "";
        private int ano = 0;
        private int kms = 0;

        //  set Marca
        public void setmarca (String txt) {
            this.marca = txt;
        }
        //  get Marca
        public String getmarca () {
            return this.marca;
        }
         //  set Modelo
         public void setmodelo (String txt) {
            this.modelo = txt;
        }
        //  get Modelo
        public String getmodelo () {
            return this.modelo;
        }
         //  set Matricula
         public void setmatricula (String txt) {
            this.matricula = txt;
        }
        //  get Matricula
        public String getmatricula () {
            return this.matricula;
        }
         //  set Ano
         public void setano (int num) {
            this.ano = num;
        }
        //  get Ano
        public int getano () {
            return this.ano;
        }
        //  set Kms
          public void setkms (int num) {
            this.kms = num;
        }
        //  get Kms
        public int getkms () {
            return this.kms;
        }
        public void mostrarInfo (){
            System.out.println("Marca: " + this.getmarca());
            System.out.println("Modelo: " + this.getmodelo());
            System.out.println("Matricula: " + this.getmatricula());
            System.out.println("Ano: " + this.getano());
            System.out.println("Kms: " + this.getkms());
        }
        public Carro(String marcaX, String modeloX, String matriculaX, int anoX, int kmsX){
            this.marca = marcaX;
            this.modelo = modeloX;
            this.matricula = matriculaX;
            this.ano = anoX;
            this.kms = kmsX;
        }
        //Metodo para buzinar !!!
        public void buzinar(){
            System.out.println("Beep, Beep!");
        }
        
     }