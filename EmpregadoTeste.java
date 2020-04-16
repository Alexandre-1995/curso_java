public class EmpregadoTeste{
    public static void main(String args[]){

        Empregado E1;
        E1 = new Empregado("Fulano", 2000.00);

        Empregado E2;
        E2 = new Empregado("Ciclano", 1500.00);

        E1.Imprimir();
        E1.AumentarSalario(-10.0);

        E2.Imprimir();
        E2.AumentarSalario(15.0);
    }
}