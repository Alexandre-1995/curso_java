import java.util.Scanner;

public class URI1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int entrada;

        entrada = teclado.nextInt();

        while(X != 0 && Y != 0 ){

            if(X > 0){
                if(Y > 0){
                    System.out.println("primeiro");
                }
                else{
                    System.out.println("quarto");
                }
            }
            else{
                if(Y > 0){
                    System.out.println("segundo");
                }
                else{
                    System.out.println("terceiro");                  
                }
            }
        X = teclado.nextInt();
        Y = teclado.nextInt();
        }

    }
}