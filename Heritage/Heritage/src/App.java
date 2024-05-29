import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class App {
    public static void main(String[] args) throws Exception {    
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String dnPaiPai = "1939/01/01";
        String dnMaePai = "1952/02/10";
        String dnPaiMae = "1952/04/16";
        String dnMaeMae = "1953/07/23";
        String dnMae = "1971/06/22";
        String dnPai = "1971/12/18";
        String dnFilho = "2008/02/09";
    /*try{
        LocalDate data = LocalDate.parse(dataStr, formato);
        System.out.println("Data convertida: "+ dataStr);
    } catch(DateTimeParseException e){
        e.printStackTrace();
    }*/
        Pessoa paimae = new Pessoa("Joze","Marques",LocalDate.parse(dnPaiMae,formato),false,null,null,null);
        Pessoa maemae = new Pessoa("Emilia","Marques",LocalDate.parse(dnMaeMae,formato),false,null,null,null);
        Pessoa maepai = new Pessoa("Florinda","Correia",LocalDate.parse(dnMaePai,formato),false,null,null,null);
        Pessoa paipai = new Pessoa("David","Correia",LocalDate.parse(dnPaiPai,formato),false,null,null,null);
        Pessoa mae = new Pessoa("Florbela","Marques",LocalDate.parse(dnMae,formato),false,null,paimae,maemae);
        Pessoa pai = new Pessoa("Paulo","Correia",LocalDate.parse(dnPai,formato),false,null,paipai,maepai);
        Pessoa filho = new Pessoa("Joao","Correia",LocalDate.parse(dnFilho,formato),false,null,pai,mae);

        //System.out.println(paimae);
        //System.out.println(maemae);
        //System.out.println(maepai);
        //System.out.println(paipai);
        //System.out.println(mae);
        //System.out.println(pai);
        System.out.println(filho.mostraDescendencia(0));
        //System.out.println(filho.getIdade());
    }
}