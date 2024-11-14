/*Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:

se x é par, x = x / 2
se x é impar, x = 3 * x + 1
imprime x
O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13, a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1 */

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) throws Exception {
        int Num = 0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Digite um numero");
            Num = teclado.nextInt(); 
        }while(Num <= 0);

        while (Num != 1){
            if (Num % 2 == 0) {
                Num /= 2;   
            }else{
                Num = (3 * Num) + 1;
            }
            System.out.println(Num);
        }
    teclado.nextLine();
}

        
    }
