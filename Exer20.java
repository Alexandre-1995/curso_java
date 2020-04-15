import java.util.Scanner;

public class Exer20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String sexo;
        float H, peso_ideal;

        System.out.println("Digite M para Masculino e F para Feminino");
        sexo = teclado.nextLine();

        System.out.println("Digite a altura");
        H = teclado.nextFloat();

        if(sexo.equals ("M")){
            peso_ideal= 72.7f * H - 58;
        }
        else{
            peso_ideal= 62.1f * H - 44.7f;     
        }
        System.out.println("Seu peso ideal seria: " +peso_ideal);
    }
}