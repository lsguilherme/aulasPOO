package EstruturasControle;
// Utilizando uma estrutura de repetição, complete o programa abaixo para imprimir todos os números de 80 a 340 e sempre que o número impresso for ímpar, imprima ao lado do número o texto “é ímpar”. Exemplo: 81 é ímpar. Caso o número seja par, só é necessário imprimir apenas o número. Exemplo: 82.

// REPETIR valores entre 80 e 340.
// SE for ímpar imprime o número dizendo que é ímpar. (Ex: 81 é ímpar)
// SE for par só precisa imprimir o número. (Ex: 80)

public class Exercicio02 {
    public static void main(String[] args){

            int numero = 80; 
            // Utilizei while para diferenciar do anterior que foi obrigado a utilização do FOR.
            while (numero <= 340)   {
                if (numero % 2 == 1){
                    System.out.println(numero + " é ímpar.");
                } else {
                    System.out.println(numero);
                }
                numero++;
            } 

        }
}