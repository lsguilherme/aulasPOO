package SintaxesJava;

// Determine se cada uma das seguintes sentenças é (V) verdadeira ou (F) falsa.

public class Exercicio03 {

    // UM - Por convenção, os nomes de classes iniciam com uma letra maiúscula e apresentam a letra inicial de cada palavra que eles incluem em maiúscula (por exemplo, SampleClassName).
    boolean um = true; 

    // DOIS - As palavras if, else, switch, while, do e for representam comandos em Java. Entretanto, em alguns contextos, essas palavras podem ser usadas nos nomes de variáveis.
    boolean dois = false; // Falso, pois são palavras reservadas do Java.

    // TRES - #nome é um exemplo de um identificador válido
    boolean tres = false; // Falso, não é permitido utilizar caracteres especiais no início do identificador, com exceção a ($ e _)

    // QUATRO - Por convenção, identificadores de nomes de variáveis iniciam com uma letra minúscula e cada palavra no nome depois da primeira começa com uma letra maiúscula. Por exemplo, o identificador de nome da variável firstNumber inicia a sua segunda palavra, Number, com uma letra N maiúscula.
    boolean quatro = true;

    // CINCO - O compilador Java não diferencia letras maiúsculas de letras minúsculas, ou seja, o identificador Hello é interpretado da mesma forma que hello.
    boolean cinco = false; // Falso, o compilador Java diferencia sim letra maiúsculas de minúsculas.

    // SEIS - Por convenção, os nomes de classes iniciam com um carácter de ponto (.) seguido por uma letra maiúscula e apresentam a letra inicial de cada palavra que eles incluem em minúscula (por exemplo: .Contabancaria).
    boolean seis = false; // A classe costuma ter o mesmo nome do arquivo.

    // SETE - As palavras if, else, switch, while, do e for representam comandos em Java. Essas palavras NÃO podem ser usadas nos nomes de variáveis.
    boolean sete = true;

    // OITO - O Javadoc Comentário especial utilizado para gerar a documentação da classe automaticamente. Exemplo de um comentário do tipo JavaDoc:
        // Exemplo de comentário
    boolean oito = false; // Falso, o comentário do exemplo são para comentários simples. Segue abaixo um comentário do tipo Javadoc:
        /**
         * Comentário especial do Javadoc seria dessa forma.
         */

    // NOVE - De acordo com a ordem de precedência de operadores, o operador != (não igual) é executado posteriormente ao operador && (e lógico)
    boolean nove = false; // Falso, o != vem antes do &&.

     
}
