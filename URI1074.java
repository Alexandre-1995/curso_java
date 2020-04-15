import java.util.Scanner;

public class URI1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, entrada, caso;

        N = teclado.nextInt();
        entrada=0;
        caso=0;

        for(int i=0; i<N ; i++ ){

            entrada = teclado.nextInt();

            if(entrada == 0 ){
                System.out.println("NULL");
            }
            else if((entrada % 2) == 0){
                    if(entrada > 0){
                        System.out.println("EVEN POSITIVE");
                    }
                    else{
                        System.out.println("EVEN NEGATIVE");
                    }
            }
            else if((entrada % 2) != 0){
                    if(entrada > 0){
                        System.out.println("ODD POSITIVE");
                    }
                    else{
                        System.out.println("ODD NEGATIVE");
                    }
            }
            
        }

    }
}