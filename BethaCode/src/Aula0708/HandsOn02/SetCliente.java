package Aula0708.HandsOn02;

import java.util.HashSet;
import java.util.Set;

public class SetCliente {

    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet<Cliente>();
        Cliente clienteA = new Cliente(1,"Emily","1003498903","348023");
        Cliente clienteB = new Cliente(2,"Mateus","934834923","324234");
        Cliente clienteC = new Cliente(3,"Maria","49040938590","565444");

        clientes.add(clienteA);
        clientes.add(clienteB);
        clientes.add(clienteC);

        System.out.println(clientes);
    }
}
