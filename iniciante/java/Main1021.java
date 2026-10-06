package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1021 {
    
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        double vM = t.nextDouble();
        vM *= 100;
        int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, m1 = 0, m05 = 0, m025 = 0, m01 = 0, m005 = 0, m001 = 0;
        while (vM >= 10000) {
            vM -= 10000;
            n100++;
        } while (vM >= 5000) {
            vM -= 5000;
            n50++;
        } while (vM >= 2000) {
            vM -= 2000;
            n20++;
        } while (vM >= 1000) {
            vM -= 1000;
            n10++;
        } while (vM >= 500) {
            vM -= 500;
            n5++;
        } while (vM >= 200) {
            vM -= 200;
            n2++;
        } while (vM >= 100) {
            vM -= 100;
            m1++;
        } while (vM >= 50) {
            vM -= 50;
            m05++;
        } while (vM >= 25) {
            vM -= 25;
            m025++;
        } while (vM >= 10) {
            vM -= 10;
            m01++;
        } while (vM >= 5) {
            vM -= 5;
            m005++;
        } while (vM >= 1) {
            vM -= 1;
            m001++;
        } 
        System.out.printf("NOTAS:%n%d nota(s) de R$ 100.00%n%d nota(s) de R$ 50.00%n%d nota(s) de R$ 20.00%n"
            + "%d nota(s) de R$ 10.00%n%d nota(s) de R$ 5.00%n%d nota(s) de R$ 2.00%n"
            + "MOEDAS:%n%d moeda(s) de R$ 1.00%n%d moeda(s) de R$ 0.50%n%d moeda(s) de R$ 0.25%n"
            + "%d moeda(s) de R$ 0.10%n%d moeda(s) de R$ 0.05%n%d moeda(s) de R$ 0.01%n",
            n100, n50, n20, n10, n5, n2, m1, m05, m025, m01, m005, m001
        );
        t.close();
          
    }
}