import java.util.Scanner;

public class URI1180{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n, vetor[];
        int i=0;

        n = teclado.nextInt();
        vetor = new int[n];


        for(int pos=0; pos < n ; pos++ ){
            vetor[pos] = teclado.nextInt();
            if(pos > 0){
                if(vetor[pos] < vetor[pos-1]){
                    i = pos;
                }
            }
        }
        System.out.println("Menor valor: " +vetor[i]);
        System.out.println("Posicao: " +i);        

    }
}