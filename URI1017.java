import java.util.Scanner;

public class URI1017{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int velocidade, tempo;
        double consumo_medio, consumo;

        consumo_medio=12.0;

        System.out.print("Digite o tempo de viagem em horas e a velocidade media em Km/h seguidos de enter");
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();  

        consumo= velocidade * tempo / consumo_medio;
        System.out.printf("O Consumo foi: %.3f\n", consumo);

    }
}