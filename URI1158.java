import java.util.Scanner;

public class URI1158{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, y, n, soma; 
        n = teclado.nextInt();

        for(int k=0; k<n ; k++ ){

            x = teclado.nextInt();
            y = teclado.nextInt();

            soma=0;
            int i=0;
            while( i < y ){
                if((x % 2) != 0){
                    soma=soma+x;
                    i=i+1;
                }
                x=x+1;
            }
            System.out.println(soma);
        }
    }
}