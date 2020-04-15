import java.util.Scanner;

public class URI1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hora_st, minuto_st, hora_end, minuto_end;
        int dur_hora, dur_minuto;

        hora_st = teclado.nextInt();
        minuto_st = teclado.nextInt();
        hora_end = teclado.nextInt();
        minuto_end = teclado.nextInt();

        if(hora_end >= hora_st){
            dur_hora = hora_end - hora_st;
        }
            else{
                dur_hora = hora_end - hora_st + 24;
            }

        if(dur_hora == 0){
            if(minuto_end <= minuto_st){
                dur_hora = 24;
            }
        }
        
        if(minuto_end >= minuto_st){
            dur_minuto = minuto_end - minuto_st;
        }
        else{
            dur_minuto = minuto_end - minuto_st + 60;   
            dur_hora = dur_hora - 1;         
        }

        System.out.println("O JOGO DUROU " +dur_hora +" HORA(S) E " +dur_minuto + " MINUTO(S)");

    }
}