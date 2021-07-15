package Desafio04;

public class ClasseTest {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1,"Maria","Endereco","99568478","48896574589","4545","F",100.0,15.0);
        System.out.println(cliente.getDocumentoPrincipal());
        cliente.aumentarLimite(50.0);
        System.out.println("Novo Limite de crédito: "+cliente.getLimiteCrediario());
        cliente.diminuirLimite(25.0);
        System.out.println("Novo Limite de crédito: "+cliente.getLimiteCrediario());

        Funcionario funcionario = new Funcionario(1,"João","Endereco","99658745","45689674589","784","M",1500.0,1250.0);
        System.out.println(funcionario.getDocumentoPrincipal());
        funcionario.aplicarDissiodio(5.0);
        System.out.println("Novo salário: "+ funcionario.getSalarioBruto());

        Fornecedor fornecedor = new Fornecedor(1,"Joana","Endereco","99587485","5554886594857","4545","4546","Responsável","Obs");
        System.out.println(fornecedor.getDocumentoPrincipal());
    }
}
