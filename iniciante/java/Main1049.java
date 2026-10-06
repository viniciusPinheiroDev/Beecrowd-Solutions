package iniciante.java;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1049 {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.US);

        String pal1 = t.nextLine().trim(), pal2 = t.nextLine().trim(), pal3 = t.nextLine().trim();
        String palavra = pal1 + "_" + pal2 + "_" + pal3;
        
        String animal = switch (palavra) {
            case "vertebrado_ave_carnivoro" -> "aguia";
            case "vertebrado_ave_onivoro" -> "pomba";
            case "vertebrado_mamifero_onivoro" -> "homem";
            case "vertebrado_mamifero_herbivoro" -> "vaca";
            case "invertebrado_inseto_hematofago" -> "pulga";
            case "invertebrado_inseto_herbivoro" -> "lagarta";
            case "invertebrado_anelideo_hematofago" -> "sanguessuga";
            case "invertebrado_anelideo_onivoro" -> "minhoca";
            default -> "";
        };
        System.out.println(animal);

        t.close();
    }
}