
import java.util.Scanner;
public class Salario{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        float salario, imposto, sal_liq;

        /* entrada */
        System.out.print("Por favor, digite o salario: ");
        salario = teclado.nextFloat();

        /* processamento */
        imposto = salario * 15 / 100;
        sal_liq = salario - imposto;

        /* saida */
        System.out.printf("Salario Bruto     R$ %10.2f \n",salario);
        System.out.printf("Imposto           R$ %10.2f \n",imposto);
        System.out.printf("Salario Liquido   R$ %10.2f \n",sal_liq);

    }
}