import java.util.Scanner;

public class URI1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X, cont;
        cont=0;

        X = teclado.nextInt();

        for( int i=0  ; i < X ; i++){
            for(int k=0; k<3 ; k++){
                cont++;
                System.out.print(cont+" ");
            }
            System.out.println("PUM");
            cont++;
        }

    }
}