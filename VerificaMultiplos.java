
package verificamultiplos;
import java.util.Scanner;

public class VerificaMultiplos {
    public static void main(String[] args) {
        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
                System.out.println("Os números são múltiplos um do outro.");
            } else {
                System.out.println("Os números não são múltiplos um do outro.");
            }
        }
    }
}
