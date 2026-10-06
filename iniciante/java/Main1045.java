package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1045 {

    
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        double n1 = t.nextDouble(), n2 = t.nextDouble(), n3 = t.nextDouble(), a = 0, b = 0, c = 0, aa = 0, ab = 0, ac = 0;
        
        if (n1 >= n2 && n1 >= n3) {
            a = n1;
            if (n2 >= n3) {
                b = n2;
                c = n3;
            } else {
                b = n3;
                c = n2;
            }
        } else if (n2 >= n1 && n2 >= n3) {
            a = n2;
            if (n1 >= n3) {
                b = n1;
                c = n3;
            } else {
                b = n3;
                c = n1;
            }
        } else if (n3 >= n2 && n3 >= n1) {
            a = n3;
            if (n1 >= n2) {
                b = n1;
                c = n2;
            } else {
                b = n2;
                c = n1;
            }
        } 

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            aa = a * a;
            ab = b * b;
            ac = c * c;

            if (aa > (ab + ac)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (aa < (ab + ac)) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else {
                System.out.println("TRIANGULO RETANGULO");
            }

            if ( a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || c == a) {
                System.out.println("TRIANGULO ISOSCELES");
            } 
        }
        t.close();
    }
}