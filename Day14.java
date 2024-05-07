package pkg14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double mtk, ddp, bing, ipa, jmlh, rata, kkm;
       
        System.out.print("MTK  \t\t: ");
          mtk = input.nextDouble();
        System.out.print("DDP  \t\t: ");
          ddp = input.nextDouble();
        System.out.print("BING \t\t: ");
          bing = input.nextDouble();
        System.out.print("IPA  \t\t: ");
          ipa = input.nextDouble();
        
        kkm = 75;
          jmlh = mtk + ddp + bing + ipa;
         
        rata = jmlh / 4;
            System.out.println("Rata rata nilai : "+ rata);
        if(rata >= kkm){
            System.out.println("Tuntas");
        } else {
            System.out.println("Tidak tuntas");
        }
        
    }  
}
