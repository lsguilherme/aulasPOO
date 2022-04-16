package EstruturasControle;

//Utilizando a estrutura de repetição FOR, complete o programa abaixo para imprimir todos os números de 261 a 381 e sempre que o número impresso for par, imprima ao lado do número o texto “é par”. Exemplo: 302 é par. Caso o número seja ímpar, só é necessário imprimir apenas o número. Exemplo: 301.

// FOR para imprimir números de 261 a 381.
// SE o número for par, imprime o numero e um texto dizendo que é par. (Ex: 302 é par)
// SE o número for ímpar, imprime só o número. (Ex: 301)

public class Exercicio01 {
    public static void main(String[] args){
        for(int numero = 261; numero <= 381; numero++){
            if(numero % 2 == 0){
                System.out.println(numero + " é par.");    
            }else{
                System.out.println(numero);
            }
        }


    }
}
