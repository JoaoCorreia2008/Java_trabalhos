public class Main {
    public static void main(String[] args) {
        if (args.length>0){
            System.out.println("Recebi os seguintes argumentos:");
            for (String i: args ){
                System.out.println(i);
            }
        }
        System.out.println("A Minha classe de Alunos ");
        Alunos aMinhainf = new Alunos (14597, "Joao Correia", 962044207, "Roriz ");
        aMinhainf.mostrarInfo();

        System.out.println("A Minha Classe Carro ");
        Carro oMeuCarro = new Carro("Ferrari", "F40", "01-OP-82" , 1995,0);
        // comprei o meu carro em 2024-04-24 ... tem 0 kms
        System.out.println("Novo*****************");
        oMeuCarro.mostrarInfo();
        oMeuCarro.buzinar();

        
    }

}
