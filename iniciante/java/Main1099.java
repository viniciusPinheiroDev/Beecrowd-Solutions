package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1099 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int n = t.nextInt();
        int x[] = new int[n], y[] = new int[n];
        
        for (int c = 0; c < n; c++) {
            x[c] = t.nextInt();
            y[c] = t.nextInt();
        }

        for (int c = 0; c < n; c++) {
            int somaImp = 0;
            if (x[c] < y[c]) {
                for (int cSoma = x[c] + 1; cSoma < y[c]; cSoma++) {
                    if (cSoma % 2 != 0) {
                        somaImp += cSoma;
                    }
                }
                
            } else if (x[c] > y[c]) {
                for (int cSoma = y[c] + 1; cSoma < x[c]; cSoma++) {
                    if (cSoma % 2 != 0) {
                        somaImp += cSoma;
                    }
                }
            }
            System.out.println(somaImp);
        }

        t.close();
    }
}