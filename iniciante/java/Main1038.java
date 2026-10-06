package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1038 {
    
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US); 

        int cod = t.nextInt(), quant = t.nextInt();
        double valor = 0.0;
        switch (cod) {
            case 1:
                valor = quant * 4;
            break;
            case 2:
                valor = quant * 4.50;
            break;
            case 3:
                valor = quant * 5;
            break;
            case 4:
                valor = quant * 2;
            break;
            case 5: 
                valor = quant * 1.5;
            break;
            default:
            break;
        }
        System.out.printf("Total: R$ %.2f%n", valor);
        t.close();

    }
}