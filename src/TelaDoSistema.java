import java.awt.*;

public class TelaDoSistema {
    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        System.out.println("A resolução da tela é: ");
        System.out.println(tela.getScreenSize());
    }
}
