import java.util.Scanner;

public class URI1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tipo, N_alcool, N_gasolina, N_diesel;
        N_alcool=0;
        N_gasolina=0;
        N_diesel=0;


        do{
            tipo = teclado.nextInt();
            if(tipo == 1){
                N_alcool++;
            }
            else if(tipo == 2){
                N_gasolina++;
            }
            else if(tipo == 3){
                N_diesel++;
            }
        }while(tipo != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+N_alcool);
        System.out.println("Gasolina: "+N_gasolina);
        System.out.println("Diesel: "+N_diesel);
    }
}