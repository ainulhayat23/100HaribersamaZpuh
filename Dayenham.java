package dayenham;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
             System.out.print("Masukkan total belanja : ");
        
        double total = masuk.nextDouble();
             System.out.print("Total belanja anda = Rp."+total);
        
        if(total >= 500000){
          System.out.println("Dapat diskon 20% ");
             double diskon = 20 * total / 100;
                total -= diskon;
            
        } else if(total >= 250000){
            System.out.println("Dapat diskon 15% ");
              double diskon = 15 * total / 100;
                total -= diskon;
            
        } else if(total >= 100000){
            System.out.println("Dapat diskon 10% ");
              double diskon = 10 * total / 100;
                total -= diskon;
            
        } else {
           System.out.println("Tidak dapat diskon");
            
        } System.out.println("Jadi total keseluruhan = Rp."+total);
        
    }
}
