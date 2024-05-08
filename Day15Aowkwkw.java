package hariyangberat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Pola persegi menggunakan Looping
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int jml = input.nextInt();
        for(int i = 1; i <= jml; i++){
            for(int j = 1; j < jml; j++){
                System.out.print("o  ");
            }
            System.out.println("o  ");
        }
        System.out.println("");
    }    
}
        
