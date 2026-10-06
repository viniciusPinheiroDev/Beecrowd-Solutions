package iniciante.java;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1013 {
 
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int n1 = t.nextInt(), n2 = t.nextInt(), n3 = t.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " eh o maior");
        } else if (n1 > n2 || n1 > n3) {
            if (n3 > n1) {
                System.out.println(n3 + " eh o maior");
            } else {
                System.out.println(n2 + " eh o maior");
            }
        } else if (n2 > n3) {
            System.out.println(n2 + " eh o maior");
        } else {
            System.out.println(n3 + " eh o maior");
        }
        t.close();
    }
 
}