package iniciante.java;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main1101 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 
        
        ArrayList<Integer> m = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        int casos = 0;

        for (int c = 0;; c++) {
            int x = t.nextInt();
            int y = t.nextInt();
            if (x > 0 && y > 0) {
                m.add(x);
                n.add(y);
            } else {
                casos = c;
                break;
            }
        }
        for (int c = 0; c < casos; c++) {
            int soma = 0;
            if (m.get(c) > n.get(c)) {
                for (int nm = n.get(c); nm <= m.get(c); nm++) {
                    System.out.print(nm + " ");
                    soma += nm;
                }
                System.out.println("Sum=" + soma);
            } else if (m.get(c) < n.get(c)) {
                for (int mn = m.get(c); mn <= n.get(c); mn++) {
                    System.out.print(mn + " ");
                    soma += mn;
                }
                System.out.println("Sum=" + soma);
            }
        }
        t.close();
    }
}