import java.util.Scanner;

public class CapturaData{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int numero, ano, mes, dia, resto;

        System.out.print("Digite a data no formato DDMMAAAA ");
        numero = teclado.nextInt();

        ano = numero % 10000;
        resto = numero / 10000;

        mes = resto % 100;
        dia = resto / 100;

        System.out.println("dia: " +dia);
        System.out.println("mes: " +mes);
        System.out.println("ano: " +ano);
    }
}