import java.util.Scanner;

public class Exer21{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade");
        idade = teclado.nextInt();

        if(idade < 16 ){
            System.out.println("Nao eleitor");
        }
        else{
            if(((idade >= 16) && (idade <= 18)) || (idade > 65)){
                System.out.println("facultativo");                
            }
            else{
                System.out.println("Obrigatorio");             
            }
        }
    }
}