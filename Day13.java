package pkg13;
import java.util.Scanner;
public class Main{
      public static void main(String[] args) {
          
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = input.nextInt();
          
        if (N % 2 == 0) {
            System.out.println("N adalah bilangan genap, ubah keganjil.");
        }else{
        System.out.println("Deret bilangan ganjil dari 1 hingga " + N + " adalah : ");
        for (int i = 1; i <= N; i += 2) {
            System.out.print(i + " ");
            }
        }
    }
}
