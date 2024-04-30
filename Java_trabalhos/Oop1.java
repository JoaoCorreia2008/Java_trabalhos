// javac Main.java
// java -cp . Main
public class Oop1 {
// atributos da classe !!
    private int x = 5;
    int y = 10;
    // metodo estatico
    static void metodoEstatico () {
        System.out.println("Metodo estatico");
    }
    // metodo publico
    public void metodoPublico () {
        System.out.println("Metodo Publico");
    }
    //set x do objeto !
    public void setx (int numero){
        this.x = numero;
    }
     //get x do objeto !
     public int getx (){
        return this.x;
    }
    public Oop1(){
        this.x = 33;
    }
    public static void main(String[] args) {
        Oop1 myObj1 = new Oop1();
        Oop1 myObj2 = new Oop1();

        System.out.println(myObj1.getx()); // verificar o construtor
        myObj1.setx(13);
        //myObj1.getx(13);
        //System.out.println(myObj1.x);
        System.out.println(myObj1.getx()); // ver o x depois do set
        myObj1.y=15;
        myObj2.y=35;

        System.out.println(myObj1.y + myObj2.y);
        metodoEstatico();
        myObj1.metodoPublico();
       
    }
 }