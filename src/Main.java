import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);


        
        
        
        //no1-4
        boolean banSerep;
        int sewa;
        boolean supir;
        boolean antar;
        boolean lanjut=true;
        int totalSemuaPilihanSewa=0;
        while (lanjut) {
            System.out.println();
            System.out.println("=================");
            System.out.println("welcome to rental");
            System.out.println("=================");
            System.out.println("Mobil yang tersedia \n1.Mustibisha (@3000) \n2.Toyomba (@4500)(BanSerep)(Supir) \n3.Lempergember (@5000)(Banserep)(Supir)(Antar)");
            System.out.println("input angka");
            int choice=scan.nextInt();
            scan.nextLine();
            
        
        switch (choice) {
            case 1:
                System.out.println("pakai ban serep? t/f ");
                banSerep=scan.nextBoolean();
                System.out.println("sewa berapa hari");
                sewa=scan.nextInt();

                Mustibisha mustibisha1= new Mustibisha(3000, sewa, banSerep);
                mustibisha1.printReceipt();
                totalSemuaPilihanSewa+=mustibisha1.totalHargaSewa();
                break;
                
                case 2:
                System.out.println("pakai ban serep? t/f ");
                banSerep=scan.nextBoolean();
                System.out.println("sewa berapa hari");
                sewa=scan.nextInt();
                System.out.println("pakai supir? t/f");
                supir=scan.nextBoolean();
                Toyomba toyomba1=new Toyomba(4500, sewa, banSerep, supir);
                toyomba1.printReceipt();
                totalSemuaPilihanSewa+=toyomba1.totalHargaSewa();
                break;
                
                case 3:
                System.out.println("pakai ban serep? t/f ");
                banSerep=scan.nextBoolean();
                System.out.println("sewa berapa hari");
                sewa=scan.nextInt();
                System.out.println("pakai supir? t/f");
                supir=scan.nextBoolean();
                System.out.println("mau di antar? t/f");
                antar=scan.nextBoolean();
                
                LemperGember lemperGember1=new LemperGember(5000, sewa, supir, antar);
                lemperGember1.printReceipt();
                totalSemuaPilihanSewa+=lemperGember1.totalHargaSewa();
                break;
        
            default:
            System.out.println("input error");
                break;
        }
       

        
        System.out.println();
        System.out.println("ingin lanjut sewa? t/f");
        lanjut=scan.nextBoolean();
        System.out.println();
    }

    //no 5
    boolean countAll;
  System.out.println("Ingin menghitung biaya total keseluruhan beberapa paket sekaligus? t/f");
    countAll= scan.nextBoolean();
    if (countAll){
        System.out.println("total keseluruhan : "+ totalSemuaPilihanSewa);
    }else{
        System.out.println("terima kasih sudah menyewa");
    }
    }
}
