package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1051 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        double sal = t.nextDouble();

        if (sal >= 0 && sal <= 2000) {
            System.out.println("Isento");
        } else if (sal > 2000 && sal <= 3000) {
            sal = (sal - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", sal);
        } else if (sal > 3000 && sal <= 4500) {
            sal = (sal - 3000) * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f%n", sal);
        } else if (sal > 4500) {
            sal = (sal - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f%n", sal);
        }

        t.close();
    }
}