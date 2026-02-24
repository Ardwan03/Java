import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int siffra = 1;
        while (scan.hasNext()) {
            String rad = scan.nextLine();
            System.out.println(siffra + " " + rad);
            siffra++;
        }

        scan.close();
    }
}
