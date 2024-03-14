
package calculavalorcompra;
import java.util.Scanner;

public class CalculaValorCompra {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] precos = {4.00, 4.50, 5.00, 2.00, 1.50};
            String[] produtos = {"Cachorro Quente", "X-Salada", "X-Bacon", "Torrada Simples", "Refrigerante"};
            
            System.out.println("Códigos dos produtos:");
            for (int i = 0; i < produtos.length; i++) {
                System.out.println((i + 1) + ". " + produtos[i]);
            }
            
            double valorTotal = 0.0;
            
            while (true) {
                System.out.print("Digite o código do produto (ou 0 para encerrar): ");
                int codigo = scanner.nextInt();
                
                if (codigo == 0) {
                    break;
                }
                
                if (codigo < 1 || codigo > produtos.length) {
                    System.out.println("Código inválido. Tente novamente.");
                    continue;
                }
                
                valorTotal += precos[codigo - 1];
            }
            
            System.out.println("Valor total da compra: R$" + valorTotal);
        }
    }
}
