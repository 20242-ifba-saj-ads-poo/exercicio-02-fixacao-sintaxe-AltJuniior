public class Questao6 {
    public static void main(String[] args) throws Exception {
        
        int NumAtual = 1;
        int NumAnterior = 0;
        
        System.out.printf("%d \n%d\n",NumAnterior,NumAtual);

        for (int NumProximo = NumAnterior + NumAtual; NumProximo <= 100; NumProximo = NumAnterior + NumAtual) {
            System.out.println(NumProximo);
            NumAnterior = NumAtual;
            NumAtual = NumProximo;

}

        
    }
}