import java.util.Scanner;

public class LemperGember extends Kendaraan{
Scanner scan= new Scanner(System.in);
static int choice=0;

    private boolean antar;
    private boolean supir;


    
    public LemperGember(int hargaPerHari, int lamaSewa, boolean supir, boolean antar) {
        super(5000, lamaSewa);
        this.supir = supir;
        this.antar=antar;
    }

    public boolean isSupir() {
        return supir;
    }

    public void setSupir(boolean supir) {
        this.supir = supir;
    }

   

    public String kategoriSupir(){
        String tipeSupir="Tidak pakai supir";
        if (supir){
            System.out.println("Kategori supir : \n1.Biasa \n2.Profesional \npilih nomor input");
            choice=scan.nextInt();
            if(choice==1){
                tipeSupir="Biasa";
            }else if(choice==2){
                tipeSupir="Profesional";
            }else{
                tipeSupir="salah input";
            }
            return tipeSupir;
        }else{
            return tipeSupir;
        }
    }
    
    public int hargaOngkir(){
        int hargaOngkir=0;
        if (lamaSewa<5){
           return hargaOngkir=3000;
        }else{
            return hargaOngkir;
        }
    }
   
    @Override
    public double totalDeposito(){
        return hargaPerHari*7;

    }

    @Override
    public double totalHargaSewa(){
        
        double total = (lamaSewa*hargaPerHari);
      
        if (supir){
            if (choice==1) {
                total+=total*0.07;
            }else if(choice==2){
                total+=total*0.1;
            }
        }

        if(antar){
            if (lamaSewa<=5){
                total+=300;
            }
        }

        return total;
    }

    @Override
    public void printReceipt(){
        System.out.println(
        "Jenis Kendaraan : LemperGember \nLama Sewa : "+ lamaSewa 
        + "\nHarga Per Hari : "+hargaPerHari 
        + "\nSupir : "+supir 
        + "\nTipe supir : "+kategoriSupir()
        +"\nTotal deposito "+totalDeposito() 
        +"\nTotal Harga Sewa : "+totalHargaSewa());
    }




}