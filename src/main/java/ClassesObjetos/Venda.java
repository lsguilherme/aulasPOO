package ClassesObjetos;

import javax.xml.validation.Validator;

/**
 * 1- Escreva o código de duas classes em java:
 * A) A primeira classe é a classe Venda. Esta classe será utilizada para construir objetos do tipo Venda e deve possuir os seguintes elementos:
 * Atributos: nome do cliente e valor total (escolha o tipo mais adequado de cada atributo de acordo com a informação que ele vai armazenar);
 * Um construtor default (construtor vazio que não recebe parâmetros);
 * Um construtor que inicialize todos    os atributos através de seus parâmetros;
 * Um método que imprime o nome do cliente e o valor total da venda da seguinte forma:
    System.out.println(“Cliente: ” + nomeCliente + “, Valor total da venda: “ + valorTotal);
 */

/**
 * B) A segunda classe será a classe utilizada para executar a aplicação, o código está parcialmente escrito e você deve continuar a partir da linha 9. 
 * O código a ser escrito, deverá instanciar dois objetos do tipo Venda, um objeto será criado através do construtor default e outro através do construtor que inicializa os atributos. 
 * Em ambos os objetos criados, atribua valores aos atributos da classe Venda a partir de dados recebidos do usuário via teclado.
 * Exemplo de um código para recebimento de um número digitado pelo usuário através da classe Scanner:
    Scanner teclado = new Scanner(System.in);
    int numero = teclado.nextInt();
 */


public class Venda {
   
    // Atributos
    String nomeCliente;
    double valorTotal;

    // Construtor default
    public Venda(){}

    // Construtor não default
    public Venda(String nomeCliente, double valorTotal){
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
    }
}
