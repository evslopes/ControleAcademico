package br.edu.infnet;

import br.edu.infnet.dominio.Aluno;
import br.edu.infnet.dominio.Pessoa;
import br.edu.infnet.dominio.Professor;

import java.util.Scanner;

import static br.edu.infnet.auxiliar.Constante.QTDE_MAX;

public class ControleAcademico {

    private static Pessoa[] pessoas = new Pessoa[QTDE_MAX];
    private static int qtde = 0;

    public static void main(String[] args) {
        int opcao = 0;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Controle Acadêmico Java");
            System.out.println("[1] Cadastrar Professor");
            System.out.println("[2] Cadastrar Aluno");
            System.out.println("[3] Consultar situação de um docente/discente");
            System.out.println("[4] Sair");
            System.out.print("Entre com a opção desejada: ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    if (qtde < QTDE_MAX) {

                        Professor professor = new Professor();
                        professor.setId(qtde);

                        System.out.print("Informe o nome do professor: ");
                        professor.setNome(in.next());
                        System.out.print("Informe a idade professor: ");
                        professor.setIdade(in.nextInt());
                        System.out.print("Informe a classe do professor: ");
                        professor.setClasse(in.nextInt());
                        System.out.print("Informe o salário do professor: ");
                        professor.setSalario(in.nextFloat());

                        pessoas[qtde] = professor;
                        professor.cadastroEfetivado();
                        qtde++;

                    } else {
                        System.out.println("Impossível realizar o cadastramento, número máximo de registros atingido.");
                    }
                    break;
                case 2:
                    if (qtde < QTDE_MAX) {

                        Aluno aluno = new Aluno();
                        aluno.setId(qtde);

                        System.out.print("Informe o nome do aluno: ");
                        aluno.setNome(in.next());
                        System.out.print("Informe a idade do aluno: ");
                        aluno.setIdade(in.nextInt());
                        System.out.print("Informe a classe do aluno: ");
                        aluno.setClasse(in.nextInt());
                        System.out.print("informe a nota 1: ");
                        aluno.setN1(in.nextFloat());
                        System.out.print("informe a nota 2: ");
                        aluno.setN2(in.nextFloat());

                        pessoas[qtde] = aluno;
                        aluno.cadastroEfetivado();
                        qtde++;

                    } else {
                        System.out.println("Impossível realizar o cadastramento, número máximo de alunos atingido.");
                    }
                    break;
                case 3:
                    System.out.print("Informe a matrícula a verificar: ");
                    int matricula = in.nextInt();

                    if (matricula >= 0 && matricula < qtde) {
                        pessoas[matricula].Impressao();
                    } else {
                        System.out.println("Matrícula" + matricula + "inválida.");
                    }
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
