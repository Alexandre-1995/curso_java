import java.util.Scanner;

public class URI1006{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float A, B, C, somanotas, media;
        int peso1, peso2, peso3, pesototal;
        
        peso1 = 2;
        peso2 = 3;
        peso3 = 5;

        pesototal = peso1 + peso2 + peso3;

        System.out.print("Digite 3 notas, seguidas de enter");
        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();
        somanotas= A+ B + C;

        media=((A*peso1)+(B*peso2)+(C*peso3)) / pesototal;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}