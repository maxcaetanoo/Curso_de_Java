import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale lingua = Locale.getDefault();
        System.out.print("O idioma do sistema é: ");
        System.out.println(lingua.getDisplayLanguage());
    }
}
