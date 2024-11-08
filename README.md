public class Mustibisha extends Kendaraan {
    private boolean banSerep;

    public Mustibisha(int lamaSewa, boolean banSerep) {
        super(3000, lamaSewa); // Harga per hari diatur di sini
        this.banSerep = banSerep;
    }

    public boolean isBanSerep() {
        return banSerep;
    }

    public void setBanSerep(boolean banSerep) {
        this.banSerep = banSerep;
    }

    @Override
    public double totalDeposito() {
        // Misalnya, deposito tetap untuk Mustibisha adalah 500
        return 500;
    }

    @Override
    public double totalHargaSewa() {
        return hargaPerHari * lamaSewa;
    }

    @Override
    public void printReceipt() {
        System.out.println("Receipt for Mustibisha Rental");
        System.out.println("Harga per Hari: " + hargaPerHari);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Total Harga Sewa: " + totalHargaSewa());
        System.out.println("Total Deposito: " + totalDeposito());
        System.out.println("Ban Serep: " + (banSerep ? "Tersedia" : "Tidak Tersedia"));
    }
}
