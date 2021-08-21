package Aula0708.HandsOn02;

import java.util.ArrayList;
import java.util.List;

public class ListCliente {

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        Cliente clienteA = new Cliente(1,"Emily","1003498903","348023");
        Cliente clienteB = new Cliente(2,"Mateus","934834923","324234");
        Cliente clienteC = new Cliente(3,"Maria","49040938590","565444");

        clientes.add(clienteA);
        clientes.add(clienteB);
        clientes.add(clienteC);

        System.out.println(clientes);
    }
}
