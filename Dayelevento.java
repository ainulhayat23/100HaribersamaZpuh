package eleven;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka, pangkat, hasil;
        
        System.out.print("Angka    : ");
            angka = sc.nextInt();
        
        System.out.print("Pangkat  : ");
            pangkat = sc.nextInt();
        
        System.out.println("------------------");
        System.out.print("Hasil    : ");
        hasil = angka;
        
        for(int i = 1; i < pangkat; i++){
            hasil *= angka;
        }
        System.out.println(hasil);
    }
}
