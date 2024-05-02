package daynine;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     
        Scanner masuk = new Scanner(System.in);
         String menu = null;
          int pilihan, harga = 0, porsi;
           System.out.println("----Menu Makanan----");
            System.out.println("1. Bakso\n2. Mie Ayam\n3. Nasi Goreng");
             System.out.print("Pilihan      : ");
        
        pilihan = masuk.nextInt();
        if(pilihan == 1){
            menu = "Bakso";
              harga = 10000;
        }else if(pilihan == 2){
            menu = "Mie Ayam";
              harga = 12000;
        }else if(pilihan == 3){
            menu = "Nasi Goreng";
              harga = 13000;
        }if(menu == null){
            System.out.println("Pilihan Salah");
        }else{
            System.out.print("Jumlah porsi : ");
              porsi = masuk.nextInt();
            
        System.out.println("=====================");
         System.out.println("Menu dipesan : ");
          System.out.println(menu + " Rp. "+ harga +"/porsi");
           harga = harga * porsi;
            System.out.println("Total keseluruhan Rp. : "+harga);
        }        
    }  
}
