public class Televisao{
    // atributos
    String  marca;
    int     tamanho;
    int     voltagem;
    String  resolucao;
    boolean ligada;
    int     canal;
    int     volume;

    // metodos
    void ligar() {
        ligada = true;
        System.out.println("Agora a TV " + marca +" esta ligada");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV " + marca + " esta desligada");
    }

    void aumentarVolume(){

    }
    void diminurVolume(){

    }
    void avancarCanal(){

    }
    void voltarCanal(){
        
    }


}