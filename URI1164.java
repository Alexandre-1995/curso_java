import java.util.Scanner;

public class URI1164{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, n, soma; 
        x = teclado.nextInt();

        for(int k=0; k<x ; k++ ){
        n = teclado.nextInt();
        soma=0;

        for(int i=n-1 ; i > 0 ; i--){

            if((n % i) == 0){
                soma = soma + i;
            }

        }

        if( soma == n ){
            System.out.printf("%d eh perfeito\n", n);
        }
        else{
           System.out.printf("%d nao eh perfeito\n", n);            
        }
        }
    }
}