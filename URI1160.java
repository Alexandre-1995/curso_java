import java.util.Scanner;

public class URI1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int PA, PB, n, anos; 
        float GA, GB;

        n = teclado.nextInt();

        for(int k=0; k<n ; k++ ){

            PA = teclado.nextInt();
            PB = teclado.nextInt();
            GA = teclado.nextFloat();
            GB = teclado.nextFloat();

            anos = 0;

            while( PA <= PB ){
                PA = (int) (PA + PA*GA/100);
                PB = (int) (PB + PB*GB/100);
                anos = anos + 1;
                if( anos > 100){
                    break;
                }
            }
            if( anos > 100){
                System.out.println("Mais de um seculo");
            }
            else{
                System.out.printf("%d anos.", anos);
            }
        }
    }
}