public class Questao8 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(j*i);
            }
            System.out.println("");    
        }
    }
}