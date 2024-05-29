public class App {
    public static void main(String[] args) throws Exception {

        Professor professor = new Professor(14596,"Vasco","Ruas",1993,"Porfessor");
        //System.out.println(professor);
        System.out.println("Professor");
        professor.getNomeCompleto();

        Turma turma = new Turma("CX12345","Programacao",2024,2026);
        //System.out.println(professor);
        System.out.println("Infomacao da Turma");
        turma.getInfoTurma();

        Aluno aluno1 = new Aluno("a14597","Joao","Correia",2008,null);
        //System.out.println(professor);
        System.out.println("Aluno1");
        aluno1.getNomeCompleto();
        aluno1.getAnoNascimento();

        Aluno aluno2 = new Aluno("a14594","Vasco","Ruas",2008,null);
        //System.out.println(professor);
        System.out.println("Aluno2");
        aluno2.getNomeCompleto();
        aluno2.getAnoNascimento();

        Aluno aluno3 = new Aluno("a14565","Leonardo","Machado",2008,null);
        //System.out.println(professor);
        System.out.println("Aluno3");
        aluno3.getNomeCompleto();
        aluno3.getAnoNascimento();

        
    }
}
