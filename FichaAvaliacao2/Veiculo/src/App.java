import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String mtcarro1 = "02/10/2001";
        String mtcarro2 = "13/02/2008";
        String mtMota1 = "20/05/2010";
        String mtMota2 = "04/04/2004";
        
        Carro carro1 = new Carro("MX-P8-08",LocalDate.parse(mtcarro1,formato),"Mercedes","Class S",0,0,"Carro","Gasolina",0,false,0);
        carro1.setClassico(true);
        System.out.println(carro1);

        Carro carro2 = new Carro("MX-P8-08",LocalDate.parse(mtcarro2,formato),"Mercedes","Class S",0,0,"Carro","Gasolina",0,false,0);
        carro1.setNumerodeLugares(4);
        System.out.println(carro2);

        Mota mota1 = new Mota("MX-P8-08",LocalDate.parse(mtMota1,formato),"Mercedes","Class S",0,0,"Mota","Gazolina",0,false,"Suporte Lateral");
        mota1.setSuporteMalas("Suporte Lateral");
        System.out.println(mota1);
    }
}
