//No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos, até 20, 30, 40. 
//Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas completamente erradas 
//Por quê? Mude de int para long para ver alguma mudança

// RESPOSTA: DEVIDO A FAIXA DE MEMORIA QUE A VARIAVEL INT COMPORTA SER MENOR QUE A LONG SENDO A ASSIM O TIPO LONG COMPORTA MAIS NUMEROS QUE O TIPO INTEIRO 

public class Questao5 {
    public static void main(String[] args) throws Exception {
        long fatorial = 1;
            
        for (int i = 1; i <= 40; i++) {
            fatorial = -i*(i-(i+fatorial));
                System.out.println(fatorial);

}

        
    }
}
