package autori;

import java.util.Scanner;

public class Autori {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine().replaceAll("[a-z]","").replaceAll("-", ""));
        scan.close();
    } 
    
}
