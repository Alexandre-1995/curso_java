import java.util.Scanner;

public class URI1177{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n, vetor[];
        int i=0;

        vetor = new int[1000];
        n = teclado.nextInt();

        for(int pos=0; pos < 1000 ; pos++ ){

            vetor[pos] = i;
            System.out.printf("N[%d] = %d\n", pos, vetor[pos]);

            if(i < n-1 ){
                i=i+1;
            }
            else{
                i=0;
            }

        }
    }
}