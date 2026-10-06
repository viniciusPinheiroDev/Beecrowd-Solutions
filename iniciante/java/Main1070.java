package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1070 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int x = t.nextInt();

        for (int c = x, s = 1; s <= 6; c++) {
            if (c % 2 == 1) {
                System.out.println(c);
                s++;
            }
        }
        
        t.close();
    }
}