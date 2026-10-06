package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1048 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        double sal = t.nextDouble(), reaG, nSal,  perR = 0.01;
        sal = Math.floor(sal * 100) / 100;

        if (sal >= 0 && sal <= 400) {
            perR *= 15;
        } else if (sal > 400 && sal <= 800) {
            perR *= 12;
        } else if (sal > 800 && sal <= 1200) {
            perR *= 10;
        } else if (sal > 1200 && sal <= 2000) {
            perR *= 7;
        } else if (sal > 2000) {
            perR *= 4;
        }
        reaG = sal * perR;
        nSal = sal + reaG;
        int per = (int) (perR * 100); 
        System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%n", nSal, reaG);
        System.out.println("Em percentual: " + per + " %");
        t.close();
    }
}