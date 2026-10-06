package iniciante.java;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main1113 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        ArrayList<String> x = new ArrayList<>();
        int n1 = 0, n2 = 0;

        do {
            n1 = t.nextInt();
            n2 = t.nextInt();

            if (n1 > n2) {
                x.add("Decrescente");
            } else if (n2 > n1) {
                x.add("Crescente");
            }
        } while (n1 != n2);
        for (int c = 0; c < x.size(); c++) {
            System.out.println(x.get(c));
        }
        t.close();
    }
}