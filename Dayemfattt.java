package dayemfattt;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        final double phi = 3.14;
        double L, K, r, d;
        System.out.print("Masukkan r = ");
        r = input.nextDouble();
        d = 2 * r;
        
        L = phi * r * r;
        K = phi * d;
        
        //Narasi Luas Lingkaran
        System.out.println("L = 3.14 x r²");
        System.out.println("L = "+phi+" x "+ r * r);
        System.out.println("L = "+ L + "Cm²\n");
        
        
        //Narasi Keliling Lingkaran
        System.out.println("K = 3.14 x d");
        System.out.println("K = "+phi+" x "+d);
        System.out.println("K = "+ K + "Cm²\n");
    }
}
