public abstract class Kendaraan {
    protected int hargaPerHari;
    protected int lamaSewa;
    

    public Kendaraan(int hargaPerHari, int lamaSewa) {
        this.hargaPerHari = hargaPerHari;
        this.lamaSewa = lamaSewa;
    }

   
    public int getLamaSewa() {
        return lamaSewa;
    }
    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }


    public abstract double totalHargaSewa();
    public abstract double totalDeposito();
    
    public abstract void printReceipt();
}
