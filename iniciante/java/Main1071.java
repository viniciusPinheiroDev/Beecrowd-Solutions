package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1071 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);
        int x = t.nextInt(), y = t.nextInt(), tempo, soma = 0;
        if (x > y) {
            tempo = x;
            x = y;
            y = tempo;
        }

        for (int c = x + 1; c < y; c++) {
            if (c % 2 != 0) {
                soma += c;
            }
        }
        System.out.println(soma);
        
        t.close();
    }
}