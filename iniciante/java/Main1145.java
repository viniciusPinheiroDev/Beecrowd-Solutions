package iniciante.java;

import java.util.Locale;
import java.util.Scanner;

public class Main1145 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int x = t.nextInt(), y = t.nextInt();
        int n = 0;
        while (n != y) {
            for (int cc = 1; cc <= x; cc++) {
                n++;
                if (cc != x) {
                    System.out.print(n + " ");
                } else if (cc == x) {
                    System.out.println(n);
                }
            }
        }
        t.close();
    }
}
