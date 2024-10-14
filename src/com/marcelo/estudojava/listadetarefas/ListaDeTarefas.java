package com.marcelo.estudojava.listadetarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    private ArrayList<String> tarefas;
    private Scanner scan;

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
        scan = new Scanner(System.in);

    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\n--- Lista de Tarefas---");
            System.out.println("Escolha uma opção.");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Ver tarefa");
            System.out.println("3. Excluir tarefa");
            System.out.println("4. Sair");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    verTarefa();
                    break;
                case 3:
                    excluirTarefa();
                    break;
                case 4:
                    System.out.print("Saindo...");
                    break;

                default:
                System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);
    }

    private void adicionarTarefa() {
        System.out.println("Digite uma tarefa.");
        String tarefa = scan.nextLine();
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada.");

    }

    private void verTarefa() {
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa adicionada.");
        } else {
            System.out.println("Tarefas:");
            for(int i = 0; i < tarefas.size(); i++){
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    private void excluirTarefa() {
        verTarefa();
        if(!tarefas.isEmpty()) {
            System.out.println("Digite o número da tarefa a ser excluída:");
            int indice = scan.nextInt() - 1;
            if(indice >= 0 && indice < tarefas.size()) {
                tarefas.remove(indice);
                System.out.println("Tarefa removida.");
            } else {
                System.out.println("Número inválido.");
            }
        }
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        listaDeTarefas.exibirMenu();
    }

}

