package br.edu.infnet.test;

import br.edu.infnet.model.ControleAcademico;

import java.util.Scanner;

import static br.edu.infnet.helper.Constante.QTDE_MAX;

public class Main {
    public static void main(String[] args) {

        int qtde = 0;
        int opcao = 0;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Controle Acadêmico Java5");
            System.out.println("[1] Registrar notas de um novo aluno");
            System.out.println("[2] Consultar boletim de um aluno");
            System.out.println("[3] Consultar notas da turma");
            System.out.println("[4] Sair");
            System.out.print("Entre com a opção desejada: ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    if (qtde < QTDE_MAX) {
                        //TODO metodo para inserir um novo aluno
                    } else {
                        System.out.println("Impossível realizar o cadastramento, número máximo de alunos atingido.");
                    }
                    break;
                case 2:
                    System.out.print("Informe a matrícula do aluno: ");
                    int matricula = in.nextInt();

                    if (matricula >= 0 && matricula < qtde) {
                        //TODO metodo para acessar dados do aluno
                    } else {
                        System.out.println("Matrícula" + matricula + "inválida.");
                    }
                    break;
                case 3:
                    //metodo para imprimir lista
                    break;
                case 4:
                    System.out.println("sair");
                    break;
                default:
                    System.out.println("opção inválida.");
            }
        } while (opcao != 4);

        in.close();
        System.out.println("Encerrando aplicação...");

    }
}
