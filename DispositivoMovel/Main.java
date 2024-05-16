public class Main {
    public static void main(String[] args) {

        DispositivoMovel dp = new DispositivoMovel();
        System.out.println("Tipo do Dispositivo #1 :" + dp.getTipo());

        Telemovel tlm1  = new Telemovel();
        System.out.println("Tipo do Tlm #1 : " + tlm1.getTipo());
        tlm1.setSerialNumber("asdasd-dasd as");
        System.out.println("Serial do Tlm #1 : " + tlm1.getSerialNumber());

        Portatil ptl1  = new Portatil();
        System.out.println("Tipo do ptl #1 : " + ptl1.getTipo());

        Tablet tbl1  = new Tablet();
        System.out.println("Tipo do ptl #1 : " + tbl1.getTipo());
    }
}
