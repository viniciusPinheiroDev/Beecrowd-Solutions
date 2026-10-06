package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

class Main1144 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int n = t.nextInt();
        int x = 1, y = x, z = y; 
        for (int c = 1; c <= n; c++) {
            for (int cc = 1; cc <= 2; cc++) {
                if (cc == 1) {
                    y = x * x;
                    z = y * x;
                } else if (cc == 2) {
                    y++;
                    z++;
                }
                System.out.printf("%d %d %d\n", x, y, z);
            }
            x++;
        }
        t.close();
    }
    
}