package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1018 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int n = t.nextInt(), c100 = 0, c50 = 0, c20 = 0, c10 = 0, c5 = 0, c2 = 0, c1 = 0;
        System.out.println(n);
        while (n >= 100) {
            n = n - 100;
            c100++;
        } while (n >= 50) {
            n -= 50;
            c50++;
        } while (n >= 20) {
            n -= 20;
            c20++;
        } while (n >= 10) {
            n -= 10;
            c10++;
        } while (n >= 5) {
            n -= 5;
            c5++;
        } while (n >= 2) {
            n -= 2;
            c2++;
        } while (n >= 1) {
            n -= 1;
            c1++;
        }
        System.out.format("%d nota(s) de R$ 100,00%n%d nota(s) de R$ 50,00%n%d nota(s) de R$ 20,00%n%d nota(s) de R$ 10,00%n%d nota(s) de R$ 5,00%n%d nota(s) de R$ 2,00%n%d nota(s) de R$ 1,00%n", c100, c50, c20, c10, c5, c2, c1);
        t.close();
    }
 
}