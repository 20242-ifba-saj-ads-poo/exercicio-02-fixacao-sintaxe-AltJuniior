//Imprima os fatoriais de 1 a 10

public class Questao4 {
    public static void main(String[] args) throws Exception {
        int fatorial = 1;
            
        for (int i = 1; i <= 10; i++) {
            fatorial = -i*(i-(i+fatorial));
                System.out.println(fatorial);

}

        
    }
}
