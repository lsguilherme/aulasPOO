package SintaxesJava;

// Declare variáveis em java com os respectivos tipos para cada tipo de informação abaixo: 

public class Exercicio02 {
    
    // Quantidade de alunos matriculados no IFPE;   (exemplo)
     int qtdAlunos;   // (exemplo)

     // Salário de um funcionário de uma empresa;
     double salario; // double serve para flutuante em 64bit(mais espaço para arquivo), alem da vantagem de não precisar passar f no final igual o float

     // Nome de uma disciplina do curso de IPI do IFPE Jaboatão;
     String disciplinaIPI; // String serve para receber valores de texto(numero tambem vale).

     // Indicação se um livro está disponível ou não na biblioteca;
     boolean livroDisponivel; // boolean serve para receber True ou False. Nesse caso poderia retornar um valor em String com "sim" ou "não", porém preferir utilizar do boolean para diversificar os tipos e ele funcionar bem. Sim=True, Não=False.

     // Quantidade de livros no acervo da biblioteca do IFPE;
     int quantidadeLivros; // int serve para valores inteiros(1,2,3...).

     // Altura de uma pessoa;
     float altura; // utilizei do float pois como altura é um valor quebrado (ex: 1.80) ele cai bem, além de querer diversificar do double.

}
