package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

class Main1142 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int n = t.nextInt();
        int x = 1, y = 0, z = 0;
        for (int c = 1; c <= n; c++) {
            y = x + 1;
            z = y + 1;
            System.out.printf("%d %d %d PUM\n", x, y, z);
            x = z + 2;
        }
        t.close();
    }
    
}