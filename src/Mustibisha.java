public class Mustibisha extends Kendaraan{
    private boolean banSerep;

 


    public Mustibisha(int hargaPerHari, int lamaSewa, boolean banSerep) {
      super(3000, lamaSewa);
        this.banSerep = banSerep;
    }

    public boolean isBanSerep() {
        return banSerep;
    }

    public void setBanSerep(boolean banSerep) {
        this.banSerep = banSerep;
    }

    @Override
    public double totalDeposito(){
        return hargaPerHari*7;

    }

    @Override
    public double totalHargaSewa(){
        double total = (lamaSewa*hargaPerHari);
        if (banSerep){
            total+=total*0.05;
        }
        return total;
    }

    @Override
    public void printReceipt(){
        System.out.println("Jenis Kendaraan : Mitsubishi \nLama Sewa : "+ lamaSewa + "\nHarga Per Hari : "+hargaPerHari+"\nBan Serep : "+banSerep+"\nTotal deposito "+totalDeposito() +"\nTotal Harga Sewa : "+totalHargaSewa());
    }

}
