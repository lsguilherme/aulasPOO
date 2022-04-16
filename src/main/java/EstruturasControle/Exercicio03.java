package EstruturasControle;

/**
 * Considerando que os trechos de código abaixo estão escritos dentro de um método main, diga para cada trecho de código se o código compila ou não. Caso ele compile, informe o que seria impresso no console após a execução do referido código; caso ele não compile, informe por quê o código está incorreto.
 * Dizer se compila(Sim ou Não)
 * Se sim, o que será impresso?
 * Se não, por quê não compila?
 */
public class Exercicio03 {
    public static void main(String[] args){

        /* int x = 5;
        int y = 0;
        while (x > 0) {
        x = x - 1;
        y = y + 1;
        }
        System.out.println(y); */
    
        /**
         * Compila.
         * Retorna: 5. 
         * O "x" funciona como um contador para "y", toda vez que "x" diminuir 1 o "y" irá aumentar em 1
         */

        /* int a = 2;
        long b = 2;
        double c = 2.5;
        float f = (a + b + c);
        System.out.println(f); */

        /**
         * Não compila.
         * Não é possível converter double em float.
         */

        /* int i = 1;
        boolean b = i;
        System.out.println(b); */
        
        /**
         * Não compila.
         * Não é possível converter int em boolean.
         */

        /* for (int k = 0; k < 5; k++) {
 
            if (k == 3) {
              continue;
            }
            System.out.println("k = " + k);
        } */

        /**
         * Compila.
         * Retorna: k=0, k=1, k=2, k=4.
         * Quando chega no 3 o continue entende para continuar, porém não adicionar o 3. Começa do 0 e como é menor que 5 finaliza no 4.
         */

        /* int a = 1;
        int b = 1;
        b = a++;
        System.out.println("a = " + a + ", b = " + b); */

        /**
         * Compila.
         * Retorna: a = 2, b = 1;
         * Ele está autoincrementando em "a" + 1 com o "++".
         */

        /* int x = 15;
        int y = 3;
            
        while (x >= 0) {
        x = x - 1;
        y = y + 1;
        }
            
        System.out.println(y); */

        /**
         * Compila.
         * Retorna: 19.
         * O "x" novamente funciona como um contador, toda vez que ele diminuir 1 acrescente 1 em "y". Dessa forma enquanto ele for maior ou igual a 0 ele acrescenta 1 no "y". Como fala menor ou igual ele tira de 0 à 15, são 16 números então 16 + 3 = 19.
         */

         
        /* long x;
        x = 1;
        String y = x;
        System.out.println(y); */

        /**
         * Não compila.
         * Não é possível converter long em String.
         */

        /* for (int i = 0; i < 5; i++) {
 
            if (i == 1 || i == 3) {
               continue;
            }
          
            System.out.println("i = " + i);
        } */
        
        /**
         * Compila.
         * Retorna i=0, i=2, i=4.
         * Segue o mesmo padrão do continue e for anterior. Além da mesma lógica de iniciar em 0 e finalizar em 4, pois é menor que 5.
         */

        /* long x = 5;
        long y = 5;
        y = x++;
        System.out.println("x = " + x + ", y = " + y); */

        /**
         * Compila.
         * Retorna: x = 6, y = 5
         * Mesmo padrão do autoincremento anterior.
         */

    }
}
