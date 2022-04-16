package SintaxesJava;
/** Adicione ao código abaixo:

* Na linha 01 do código abaixo, adicione um comentário do tipo Javadoc com o texto “O código abaixo foi desenvolvido para treinarmos como fazer comentários em Java”;

* Na linha 11 do código abaixo, adicione um comentário em bloco explicando os códigos das linhas 15, 16 e 17;

* Na linha 19 do código abaixo, adicione um comentário simples explicando o que faz o código da linha 20 e 21;
*/

/** 
  * O código abaixo foi desenvolvido para treinarmos como fazer comentários em Java
  */


public class Exercicio01 {

  public static void main(String[] args) {

   
  /* 
   * String nome = "Roberto"; Está sendo definido que a variável "nome" recebe os dados em "String", ou seja uma sequência de caracteres. E essa string recebe "Roberto" como valor. 
   * String sobrenome = "Alencar"; Está sendo definido que a variável "sobrenome" recebe os dados em "String" e essa String recebe "Alencar". 
   * int idade = 36; Está sendo definido que a variável "idade" recebe os dados em "integer(int)", ou seja valores inteiros, que nesse caso seria o valor "36".
   */

    String nome = "Roberto ";
    String sobrenome = "Alencar";
    int idade = 36;

   // O System.out.println() imprime um valor no console, dentro desse ele está passando Strings e concatenando com valores das variáveis acima. Nesse caso ele retona o seguinte valor: O professor Roberto tem 36 anos de idade.
    
   System.out.println("O professor " + nome + sobrenome + " tem " + idade + " anos de idade");
  }
}

