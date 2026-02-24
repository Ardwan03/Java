import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=0; i<10;i++){
            int val = 0;
            int  resultat = N*(i+1);
            val += resultat;
            System.out.println(N+ " x " + "" + (i+1) + " = " + val);
        }
        bufferedReader.close();
    }
}

