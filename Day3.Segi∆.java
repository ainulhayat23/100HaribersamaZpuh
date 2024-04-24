package daytiga;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        Scanner masukkan = new Scanner(System.in);
        
        double L,K,a,t,s;
        System.out.print("Masukkan nilai alas = ");
        a = masukkan.nextDouble();
        
        System.out.print("Masukkan nilai tinggi = ");
        t = masukkan.nextDouble();
        
        s = a;
        L = 0.5 * (a * t);
        K = s + s + s;
        
        System.out.println("L = 0.5 * a * t");
        System.out.println("L = "+0.5+" x "+ a * t);
        System.out.println("Jadi Luas dari segitiga ini adalah"+"\n"+ L + "\n");
        
        
        System.out.println("K = s + s + s");
        System.out.println("K = "+s+" + "+s+" + "+s);
        System.out.println("Jadi Keliling dari segitiga ini adalah"+ K);
        
    }
    
}
