public class Empregado{

    private String nome;
    private Double salario;

    public Empregado(String nome, Double salario){
        this.nome=nome;
        this.salario=salario;
    }

    public void Imprimir(){
        System.out.println("Nome: "+nome+ "salario: "+salario);
    }

    public void AumentarSalario(Double percentual){
        salario = salario + salario * percentual/100;
        System.out.println(nome +"novo salario: " +salario);

    }
}