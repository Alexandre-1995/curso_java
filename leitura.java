/*
este programa eh um exemplo de como se fazer uma leitura de dados
 vinda do teclado

*/
import java .util.Scanner;

public class leitura{
    public static void main(String args[]){

            Scanner teclado;
            teclado = new Scanner(System.in);

            /* entrada de dados*/
            int valor;
            System.out.print("por favor, digite um valor");
            valor = teclado.nextInt();

            /* processamento*/
            valor=valor*100;

            System.out.print("O valor sera," +valor);

    }
}