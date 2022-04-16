package SintaxesJava;

// Ao executar o programa abaixo, quais valores serão impressos na tela?

public class Exercicio04 {
    public class ExercicioOperadores {

        public static void main(String[] args) {
    
            int a, b, c;
    
            a = 5;
            b = 2;
            c = b-- + ++a;
            System.out.println(c); // Será impresso na tela: 8. 
            /** 
             * Perguntar ao professor porque.
             * Entendi que o a++ e a-- não trazem o valor de imediato, porém não entendi o porque.
            */
    
            a = 2;
            b = 3;
            c = 4;
            c -= a + 5;
            System.out.println(c); // Retorna: -3.
            /**
             * Seria c = c - (a + 5)
             * c = 4 - (2 + 5)
             * c = 4 - 7
             * c = -3
             */
            
            a = 6;
            b = 8;
            c = a >= b ? 15 : 10;
            System.out.println(c); // Retorna 10.
            /**
             * Se a for maior ou igual a b. Retorna 15, se não for retorna 10.
             * 6 < 8, então retorna 10.
             */
            
            String x = "5";
            String y = "5";
            String z = x + y;
            System.out.println(z); // Retorna 55.
            /**
             * Está acontecendo uma concatenação de string.
             */
        }
    }
    
}
