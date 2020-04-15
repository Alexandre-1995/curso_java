import java.util.Scanner;

public class URI1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario, imposto ;

        imposto=0;

        salario = teclado.nextInt();

        if((salario <= 2000.00f)){
            imposto = 0;
        }
        else if(salario > 2000.00f && salario <= 3000.00f ){

            imposto = (salario-2000.00f) * 0.08f;

        }
        else if(salario > 3000.00f && salario <= 4500.00f ){

            imposto = (salario-3000.00f) *  0.18f + 3000.00f *  0.08f;

        }
        else if(salario > 4500.00f){

            imposto = (salario-4500.00f) * 0.28f + (4500.00f-3000.00f) * 0.18f + 3000.00f *  0.08f;

        }
        System.out.printf("R$ %.2f\n ", imposto);

    }
}