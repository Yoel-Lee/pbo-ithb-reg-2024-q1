public class Toyomba extends Kendaraan{
   
        private boolean banSerep;
        private boolean supir;
    
        
        public Toyomba(int hargaPerHari, int lamaSewa, boolean banSerep,boolean supir) {
            super(4500, lamaSewa);
            this.banSerep = banSerep;
            this.supir=supir;
        }
        public boolean isSupir() {
            return supir;
        }

        public void setSupir(boolean supir) {
            this.supir = supir;
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
                total+=total*0.03;
            }
            if (supir){
                total+=total*0.08;
            }
            if (lamaSewa>5){
                total-=total*0.07;
            }
            return total;
        }
    
        @Override
        public void printReceipt(){
            System.out.println("Jenis Kendaraan : Toyomba \nLama Sewa : "+ lamaSewa + "\nHarga Per Hari : "+hargaPerHari+"\nBan Serep : "+banSerep+ "\nSupir : "+supir +"\nTotal deposito "+totalDeposito() +"\nTotal Harga Sewa : "+totalHargaSewa());
        }
    
    }
    

