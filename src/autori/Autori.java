package autori;

import java.util.Scanner;

public class Autori {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().replaceAll("[a-z]","").replaceAll("-", "");
        System.out.println(text);
    }
    
}
