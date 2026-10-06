package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1131 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        int inter = 0, gremio = 0, vitorInter = 0, vitorGremio = 0, empate = 0, grenais = 0;

        int resp = 0;
        do {
            inter = t.nextInt();
            gremio = t.nextInt();

            if (inter > gremio) {
                vitorInter++;
            } else if (gremio > inter) {
                vitorGremio++;
            } else {
                empate++;
            }
            do {
                System.out.println("Novo grenal (1-sim 2-nao)");
                resp = t.nextInt();
            } while (resp != 1 && resp != 2);
            grenais++;
        } while(resp != 2);

        System.out.printf("%d grenais%nInter:%d%nGremio:%d%nEmpates:%d%n", grenais, vitorInter, vitorGremio, empate);
        if(vitorGremio > vitorInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Inter venceu mais");
        }

        t.close();
    }
}