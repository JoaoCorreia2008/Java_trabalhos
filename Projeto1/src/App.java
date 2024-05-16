import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner txtEntrada = new Scanner(System.in);

        List<Artigo> livros = new ArrayList<Artigo>();

        Categoria acao = new Categoria ("acao", "Acção",null);
        
        Categoria animacao = new Categoria("animacao", "Animação",acao);
        /*System.out.print("Escreva o seu nome: ");
        String nome = txtEntrada.nextLine();
        System.out.print("Qual a sua idade: ");
        int idade = txtEntrada.nextInt();
        System.out.print("O seu nome é : " + nome+ ", e tem " + idade + "anos.");
        */

        int op = 1;
        while (op !=0){
            System.out.print("Quer inserir livro ? (0 - Nao / 1 - Sim) Re: ");
            op = txtEntrada.nextInt();
            txtEntrada.nextLine();

            if (op != 0){
                System.out.println("Nome do livro");
                String nomeLivro = txtEntrada.nextLine();

                System.out.println("Nome do Autor");
                String autor1nomeLivro = txtEntrada.nextLine();

                System.out.print("Sobrenome do Autor");
                String autor2nomeLivro = txtEntrada.nextLine();

                System.out.print("Data de publicação ? (ex: 2022-04-25) Re: ");
                String dataLivro = txtEntrada.nextLine();

                livros.add(new Artigo(nomeLivro,new Autor (autor1nomeLivro,autor2nomeLivro), LocalDate.parse(dataLivro), acao));
            }
        }

        
        //System.out.println(animacao);
        //System.out.println("Hello, World!");
        
        //List<Artigo> livros = new ArrayList<Artigo>();
        Artigo livroX = new Artigo("ABC DEF", new Autor("Joao", "Correia"), LocalDate.of(2024,05,07), animacao);
        
        livros.add(livroX);
        livros.add(new Artigo("Novo Livro", new Autor("Rei", "Rima"), LocalDate.of(2024,05,07), acao));
        System.out.println(livros);

        for(Artigo artigo : livros){
            System.out.println(artigo);
        }

        ArtigoWeb livroWeb1 = new ArtigoWeb("Robin em Collants", new Autor("Joao", "Correia"), LocalDate.of(2024,05,07), animacao);
        System.out.println(livroWeb1);
        
    }
}
