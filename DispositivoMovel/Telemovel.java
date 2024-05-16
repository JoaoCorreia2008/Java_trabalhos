 class Telemovel extends DispositivoMovel {
    public Telemovel(){
        this.tipo = "Telemovel";

    }

    public String getSerialNumber(){
        return this.serialNumber;
    }
    public void setSerialNumber(String txt){
        this.serialNumber = txt;
    }    
}
