package Desafio06.repository;

public class ProdutoRepository implements Buscavel{

    @Override
    public void findById() {
        System.out.println("Listando por ID");
    }

    @Override
    public void findAll() {
        System.out.println("Listando");
    }

}
