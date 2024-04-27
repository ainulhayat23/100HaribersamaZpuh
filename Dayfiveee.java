package dayfive;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan pilihan 1/2 : ");
        int pil = masuk.nextInt();
        switch(pil){
            case 1:
              System.out.println("Laki laki");
              break;
            
            case 2:
              System.out.println("Perempuan");
              break;
            
            default:
              System.out.println("Penyimpangan");
              break;
        }
    }  
}
