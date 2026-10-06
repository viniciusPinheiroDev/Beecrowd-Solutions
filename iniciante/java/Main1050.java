package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1050 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int ddd = t.nextInt();
        String cidade = switch (ddd) {
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 11 -> "Sao Paulo";
            case 21 -> "Rio de Janeiro";
            case 32 -> "Juiz de Fora";
            case 19 -> "Campinas";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte"; 
            default -> "DDD nao cadastrado";
        };
        System.out.println(cidade);

        t.close();
    }
}