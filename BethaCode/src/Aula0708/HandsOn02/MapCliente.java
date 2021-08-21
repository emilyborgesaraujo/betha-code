package Aula0708.HandsOn02;

import java.util.*;

public class MapCliente {
    public static void main(String[] args) {
        Map<String,Cliente> clientes = new TreeMap<String,Cliente>();
        Cliente clienteA = new Cliente(1,"Emily","1003498903","348023");
        Cliente clienteB = new Cliente(2,"Mateus","934834923","324234");
        Cliente clienteC = new Cliente(3,"Maria","49040938590","565444");

        clientes.put("Emily",clienteA);
        clientes.put("Mateus",clienteB);
        clientes.put("Maria",clienteC);

        System.out.println(clientes.get("Emily"));

        Collection<Cliente> clientes1 = clientes.values();
        for(Cliente c: clientes1) {
            System.out.println(c);
        }
    }
}
