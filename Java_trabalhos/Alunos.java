// javac Main.java
// java -cp . Main
public class Alunos {
    // atributos da classe !!
        public int numero = 0;
        public String nome = "";
        private int telefone = 0;
        private String morada = "";

        //  set Nome
        public void setnome (String txt) {
            this.nome = txt;
        }
        //  get Nome
        public String getnome () {
            return this.nome;
        }
         //  set Morada
         public void setmorada (String txt) {
            this.morada = txt;
        }
        //  get Morada
        public String getmorada () {
            return this.morada;
        }
        
         //  set num
         public void setnumero (int num) {
            this.numero = num;
        }
        //  get num
        public int getnumero () {
            return this.numero;
        }
        //  set tele
          public void settelefone (int num) {
            this.telefone = num;
        }
        //  get tele
        public int gettelefone () {
            return this.telefone;
        }
        public void mostrarInfo (){
            System.out.println("Numero Aluno: " + this.getnumero());
            System.out.println("Nome Aluno: " + this.getnome());
            System.out.println("Telefone Aluno: " + this.gettelefone());
            System.out.println("Morada: " + this.getmorada());
        }
        public Alunos(int numeroX, String nomeX, int telefoneX, String moradaX){
            this.numero = numeroX;
            this.nome = nomeX;
            this.telefone = telefoneX;
            this.morada = moradaX;
            
        }
        
     }