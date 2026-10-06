package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1095 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int i = 1;
        for (int j = 60; j >= 0; j -= 5) {
            System.out.format("I=%d J=%d%n", i, j);
            i += 3;
        }

        t.close();
    }
}