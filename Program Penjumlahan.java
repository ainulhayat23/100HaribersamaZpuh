package dayone;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nilai akhir : ");
        int nilaiAkhir = masuk.nextInt();
        
        int total = 0;
        for(int i = 1; i <= nilaiAkhir; i++){
            System.out.print(i);
               total += i;
            
        if(i < nilaiAkhir){
            System.out.print(" + ");
       }
     }
            System.out.println(" = " + total);
   }
}
