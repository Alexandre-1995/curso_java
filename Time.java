public class Time{
    int hora;
    int minuto;
    int segundo;

    public void SetTime(int h, int m, int s){
        hora = h;
        minuto = m;
        segundo = s;
    }

    public void ExibirHoraUniversal(){
        System.out.println(" Hora Universal: " +hora +":"+minuto+":"+segundo);
    }

    public void ExibirHoraPadrao(){
        String sufixo;
        int hora_mostrar;
            if(hora > 12){
                hora_mostrar = hora - 12;
                sufixo = "PM";
                System.out.println(" Hora Padrão: " +hora_mostrar +":"+minuto+":"+segundo+" PM");
            }
            else{
                sufixo = "AM";
                System.out.println(" Hora Padrão: " +hora +":"+minuto+":"+segundo+" AM");
            }
    }
}