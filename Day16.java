package pkg16;
public class Main {
    
    // Method Prosedur dan Fungsi
    
    // Prosedur
    public static void siswa(){
        String nama = "Nunez";
        int umur = 18;
        System.out.println(nama+" - "+umur+" tahun");
    }
    // Fungsi
    public static String siswi(){
        String nama = "Hilda";
        int umur = 17;
        return nama+" - "+umur+" tahun";
    }
    
    public static void main(String[] args) {
        siswa();
        System.out.println(siswi());
        
    }
}
