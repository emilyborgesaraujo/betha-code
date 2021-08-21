package Aula1408.HandsOn01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        List<Cliente> lista = new ArrayList<Cliente>();

        Cliente cli1 = new Cliente(1,"Emily","09284923","324234");
        Cliente cli2 = new Cliente(1,"Mateus","903480293","3434534");
        Cliente cli3 = new Cliente(1,"Maria","8784394892","2423423");

        lista.add(cli1);
        lista.add(cli2);
        lista.add(cli3);

        List<Cliente> lista2 = lista.stream().filter(l -> l.getNome().equals("Maria")).collect(Collectors.toList());
        System.out.println(lista2);
        System.out.println("-----------------");

        List<String> listaCpf = lista.stream().map(l -> l.getCpf()).collect(Collectors.toList());
        System.out.println(listaCpf);
        System.out.println("-----------------");

        lista.stream().forEach(l -> {
            System.out.println("Nome: "+l.getNome()+" Cpf: "+l.getCpf());
        });
    }

}
