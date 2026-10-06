package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1114 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int resposta = 0;
        do {
            resposta = t.nextInt();
            if (resposta == 2002) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }

        } while (resposta != 2002);
        t.close();
    }
}