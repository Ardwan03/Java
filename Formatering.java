import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("================================");
    for(int i = 0; i < 3; i++){
        String s1 = sc.next();
        int x = sc.nextInt();
        
        
        // %-15s => Sträng, vänsterjusterad, tar upp minst 15 tecken
        // %03d  => Heltal, fyll ut med nollor så det blir 3 siffror totalt
        // %n    => Radbrytning
        System.out.printf("%-15s%03d%n", s1, x);
    }
    System.out.println("================================");
}
}
