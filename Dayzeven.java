package dayzeven;
import java.util.Arrays;
import java.util.Collections;
public class Main{
    public static void main(String[] args) {
        
      Integer [] a = {74,67,85,42,98,100,41,23,45,52,9,2,68};
      int maks = Collections.max(Arrays.asList(a));
      int min = Collections.min(Arrays.asList(a));
      System.out.print("Deret angka : ");
        
        for(int i=0; i < a.length; i++){
            System.out.print(a[i]+", ");
            
        }
        System.out.println(""+"\n");
        System.out.println("Angka Maksimal : "+maks);
        System.out.print("Angka Minimal  : "+min);
    }
}
