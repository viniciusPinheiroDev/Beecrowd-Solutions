package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1094 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int casos = t.nextInt(), total = 0, totalC = 0, totalR = 0, totalS = 0;

        for (int c = 1; c <= casos; c++) {
            int quant = t.nextInt();
            String tipo = t.next();
            total += quant;
            if (tipo.equals("C")) {
                totalC += quant;
            } else if (tipo.equals("R")) {
                totalR += quant;
            } else if (tipo.equals("S")) {
                totalS += quant;
            }
        }

        double perC = ((double) totalC / total) * 100, perR = ((double) totalR / total) * 100, perS = ((double) totalS / total) * 100;
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + totalC );
        System.out.println("Total de ratos: " + totalR );
        System.out.println("Total de sapos: " + totalS );
        System.out.printf("Percentual de coelhos: %.2f %%%n", perC);  
        System.out.printf("Percentual de ratos: %.2f %%%n", perR);     
        System.out.printf("Percentual de sapos: %.2f %%%n", perS);  
        
        t.close();

    }
}