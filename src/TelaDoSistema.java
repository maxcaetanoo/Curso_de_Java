import java.awt.*;

public class TelaDoSistema {
    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension tamanho = tela.getScreenSize();
        System.out.print("A resolução da tela é: ");
        System.out.println(tamanho.width + " X " + tamanho.height);
    }
}
