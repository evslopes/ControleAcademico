package br.edu.infnet;

import java.util.Scanner;

import static br.edu.infnet.auxiliar.Constante.QTDE_MAX;

public class ControleAcademico {

    private static String[] alunos;
    private static float[] av1, av2;
    private static int qtde = 0;

    private static float calcularMedia(int index) {
        return (av1[index] + av2[index]) / 2;
    }

    private static String obterSituacao(float media) {

        if (media <= 4) {
            return "Reprovado";
        } else if (media >= 7) {
            return "Aprovado";
        } else return "Prova Final";

    }

    private static void impressao() {
        System.out.println("--- Relatório de Alunos ---");
        for (int j = 0; j < qtde; j++) {
            impressao(j);
        }
        System.out.println("---------------------------");

    }

    private static void impressao(int index) {
        float mediaAluno = calcularMedia(index);
        String situação = obterSituacao(mediaAluno);

        System.out.println(
                index + " - " +
                        alunos[index] + " - " +
                        av1[index] + " - " +
                        av2[index] + " - " +
                        mediaAluno + " - " +
                        situação
        );

    }

    public static void main(String[] args) {

        alunos = new String[QTDE_MAX];
        av1 = new float[QTDE_MAX];
        av2 = new float[QTDE_MAX];

        int opcao = 0;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Controle Acadêmico Java");
            System.out.println("[1] Registrar notas de um novo aluno");
            System.out.println("[2] Consultar boletim de um aluno");
            System.out.println("[3] Consultar notas da turma");
            System.out.println("[4] Sair");
            System.out.print("Entre com a opção desejada: ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    if (qtde < QTDE_MAX) {
                        System.out.print("Informe o nome do aluno: ");
                        alunos[qtde] = in.next();

                        System.out.print("informe a nota 1: ");
                        av1[qtde] = in.nextFloat();

                        System.out.print("informe a nota 2: ");
                        av2[qtde] = in.nextFloat();

                        impressao(qtde);
                        qtde++;

                    } else {
                        System.out.println("Impossível realizar o cadastramento, número máximo de alunos atingido.");
                    }
                    break;
                case 2:
                    System.out.print("Informe a matrícula do aluno: ");
                    int matricula = in.nextInt();

                    if (matricula >= 0 && matricula < qtde) {
                        impressao(matricula);
                    } else {
                        System.out.println("Matrícula" + matricula + "inválida.");
                    }
                    break;
                case 3:
                    impressao();
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
