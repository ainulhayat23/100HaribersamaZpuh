package daytwo;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        
        String predikat =
        nilai < 0 ? "Nilai salah":
        nilai > 100 ? "Nilai salah ":
        nilai >= 85 ? "Sangat baik ":
        nilai >= 70 ? "Baik ":
        nilai >= 55 ? "Cukup ":
        nilai >= 40 ? "Kurang ":
        "error";
        
        System.out.println("Nilai yang Anda dapatkan " + predikat);
        
        if(nilai >= 40 && nilai < 55){
            System.out.println("Harus mengulang tahun depan");
        }
    }
  }
