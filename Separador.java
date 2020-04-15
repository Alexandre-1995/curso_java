
import java.util.Scanner;

public class Separador{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int numero, un, de, ce, resto;

        System.out.print("Digite um numero com 3 digitos");
        numero = teclado.nextInt();

        ce=numero / 100;
        resto = numero % 100;

        de = resto / 10;
        un = resto % 10;

        System.out.println("centena" +ce);
        System.out.println("dezena"  +de);
        System.out.println("unidade" +un);
    }
}