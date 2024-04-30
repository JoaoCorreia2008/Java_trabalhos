// javac Main.java
// java -cp . MainTeste
public class MainTeste {

    static int calculaNumerosBiDimensionais() {
        int [][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7} };
        //int myNumbers1 = 0, myNumbers2 = 0; 
        int somaTotal = 0;

        /*for (int numero : myNumbers[0]) {
            myNumbers1 += numero;
        } */
        /*for (int numero : myNumbers[1]) {
            myNumbers2 += numero;
        }*/
        //System.out.println(myNumbers1);
        //System.out.println(myNumbers2);
        for (int[] arrayNum : myNumbers) {
            for (int numero : arrayNum){
                somaTotal+=numero;
            }
            
        } 
        return somaTotal; 
    }
    public static int fatorial (int k) {
        if(k >= 2){
            return (k * fatorial(k - 1));
        }else {
            return k;
        }
        
    }
    static void mostraSoma(int numero){// recebe inteiro como parametro
        System.out.println("O Resoltado e: " + numero );
    }

    static void mostraSoma(double numero){// recebe double como parametro
        System.out.println("O Resoltado e: " + numero );
    }

    public static void main(String [] agrs){
        mostraSoma(calculaNumerosBiDimensionais());
        //System.out.println(calculaNumerosBiDimensionais());

        /*String name = "Joao Correia"; 
        name = name.concat("Correia");
        int pos = name.indexOf("Correia");
        if (pos >= 0){
            System.out.println("Encontrei na pos: " + pos);
        }else{
            System.out.println("Nao Encontrei");
        }*/
       /*String[] alunos = {"Leonardo","Rodrigo","Vasco","Joao"};
       for (String dados : alunos){
            System.out.println(dados);
       }*/
              
    }
    //System.out.println(myNumbers [0][1]+ myNumbers [0][2] + myNumbers [0][3] + myNumbers [0][4]);
 }