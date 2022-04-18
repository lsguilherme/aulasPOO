package ClassesObjetos;
import java.util.Scanner;

public class TesteVenda {
    // Método-1 (A) para construtor default

    /* public static void main(String[] args){
        Venda venda = new Venda();
        venda.nomeCliente = "Guilherme";
        venda.valorTotal = 50.0;
        System.out.println("Cliente: " + venda.nomeCliente + ", Valor total da venda: " + venda.valorTotal);
    } */
    
    // Método-2 (B) para construtor não default

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Venda venda = new Venda(teclado.nextLine(), teclado.nextDouble());
        System.out.println("Cliente: " + venda.nomeCliente + ", Valor total da venda: " + venda.valorTotal);
    }
}
