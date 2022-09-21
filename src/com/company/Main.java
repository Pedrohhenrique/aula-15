package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cliente> clienteList = new ArrayList<>();

    public static void main(String[] args) {
        int contador = 0;
        MEL:
        while (true) {
            contador++;
            System.out.println("Quantas vezes você entrou no loop?" + contador);
            System.out.println("Você deseja continuar ou sair do loop?");
            System.out.println("Se você deseja sair do loop digite 1");
            System.out.println("Se deseja criar uma entidade cliente, digite 2");
            System.out.println("se deseja remover o cliente digite 3");
            System.out.println("se deseja buscar um cliente específico digite 4");
            System.out.println("se deseja ver todos os clientes digite 5");
            System.out.println("se deseja atualizar a idade de um cliente específico digite 6");

            Scanner scanner = new Scanner(System.in);
            int opcaoEscolhida = scanner.nextInt();
            if (opcaoEscolhida == 1) {
                System.out.println("você entrou" + contador + "vezes no Loop");
                System.out.println("Você esta saindo do loop.... ");
                break MEL;
            }
            if (opcaoEscolhida == 2) {
                Cliente cliente = new Cliente();
                System.out.println("Digite o nome do clinte e a idade");
                Scanner atributosDoClinte = new Scanner(System.in);
                cliente.nome = atributosDoClinte.nextLine();
                cliente.idade = Integer.valueOf(atributosDoClinte.nextLine());
                if(cliente.idade>65){
                    cliente.aposentadoria = 2000;
                    System.out.println("Você tem o volor de atributo de 2000R$");

                }
                else {
                    System.out.println("Você não tem o atributo de 2000 R$ devido sua idade ser menor que 65 anos.");
                }
                System.out.println("nome do Cliente :" + cliente.nome);
                System.out.println("Idade do Cliente :" + cliente.idade);
                clienteList.add(cliente);
            }
            if (opcaoEscolhida == 3) {
                for (int i = 0; i < clienteList.size(); i++) {
                    System.out.println("Digite o nome do usuario que você deseja remover");
                    Scanner nomeremu = new Scanner(System.in);
                    String mm = nomeremu.nextLine();
                    if (mm.equals(clienteList.get(i).nome)) ;
                    clienteList.remove(i);
                }


            }
            if (opcaoEscolhida == 4) {
                System.out.println("Digite o nome do cliente");
                Scanner dg = new Scanner(System.in);
                String nm = dg.nextLine();
                for (Cliente x : clienteList) {
                    if (nm.equals(x.nome)) {

                        System.out.println("o Nome é:" + x.nome + "e a idade é:" + x.idade+x.aposentadoria);

                    }


                }
            }
            if(opcaoEscolhida==5){
                for (Cliente x: clienteList) {
                    System.out.println("o Nome é:" + x.nome + "e a idade é: " + x.idade+x.aposentadoria);
                }


            }
            if(opcaoEscolhida==6){
                for(int l=0; l<= clienteList.size();l++){
                    Scanner dg = new Scanner(System.in);
                    String nm = dg.nextLine();
                    if(nm.equals(clienteList.get(l).idade));
                    {
                        System.out.println("DIgite a nova idade do seu cliente");
                        Scanner nmNova = new Scanner(System.in);
                        int idnew = nmNova.nextInt();
                        clienteList.get(l).idade =idnew;
                    }
                }
            }


        }
    }
}


