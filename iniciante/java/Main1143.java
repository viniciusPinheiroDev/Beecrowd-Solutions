package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

class Main1143 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int n = t.nextInt();
        int x = 1, y = x, z = y;
        for (int c = 1; c <= n; c++) {
            y = (int) Math.pow(x, 2);
            z = (int) Math.pow(x, 3);
            System.out.printf("%d %d %d\n", x, y, z);
            x++;
        }
        t.close();
    }
    
}