package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1040 {
    
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        double not1 = t.nextDouble(), not2 = t.nextDouble(), not3 = t.nextDouble(), not4 = t.nextDouble(), med = 0.0;
        med = (not1 * 2 + not2 * 3 + not3 * 4 + not4 * 1) / 10.0;
        med = Math.floor(med * 10) / 10.0;
        if (med >= 7) {
            System.out.printf("Media: %.1f%nAluno aprovado.%n", med);
        } else if (med < 5) {
            System.out.printf("Media: %.1f%nAluno reprovado.%n", med);
        } else  {
            System.out.printf("Media: %.1f%n", med);
            System.out.println("Aluno em exame.");
            double notE = t.nextDouble();
            System.out.println("Nota do exame: " + notE);
            med = (med + notE) / 2;
            if (med >= 5) {
                System.out.printf("Aluno aprovado.%nMedia final: %.1f%n", med);
            } else {
                 System.out.printf("Aluno reprovado.%nMedia final: %.1f%n", med);
            }
        }
        t.close();

    }
}