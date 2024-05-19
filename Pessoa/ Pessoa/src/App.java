import java.time.LocalDate;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Pessoa pessoa1 =  new Pessoa("Joao Correia",2008,2,9,null,"Eva");
        Pessoa  Pessoa =  new Pessoa("Joao Correia",2008,2,9,null,"Eva");
        System.out.println(pessoa1);
        System.out.println(Pessoa);
        System.out.println(LocalDate.now());
        
    }
}
