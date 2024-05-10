package pkg17;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack <Character> stack = new Stack<>();
        Scanner y = new Scanner(System.in);
        System.out.println("Masukkan kata : ");
        String kata = y.nextLine();
        
        for (int i = 0; i < kata.length(); i++) {
            stack.push(kata.charAt(i));
        }
        System.out.println("Hasil Reversed : ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
        
    }   
}
