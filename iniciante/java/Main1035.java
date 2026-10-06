package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1035 {
    
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int a = t.nextInt(), b = t.nextInt(), c = t.nextInt(), d =  t.nextInt(), somaAB = 0, somaCD = 0; 
        if (b > c && d > a) {
            somaCD = c + d;
            somaAB = a + b;
            if (somaCD > somaAB && (somaAB > 0 && somaCD > 0)) {
                if (a % 2 == 0){
                    System.out.println("Valores aceitos");
                } else {
                    System.out.println("Valores nao aceitos");
                }
            } else {
                System.out.println("Valores nao aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }
        t.close();
    }
}