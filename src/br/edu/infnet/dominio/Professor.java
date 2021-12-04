package br.edu.infnet.dominio;

import br.edu.infnet.exceptions.NomeInvalidadoException;
import br.edu.infnet.exceptions.QuantidadeInvalidaExceptions;

public class Professor extends Pessoa {

    private Integer classe;
    private Float salario;

    public Professor() throws QuantidadeInvalidaExceptions {
    }

    @Override
    public String ObterSituacao() {
        return getSalario().toString();
    }

    @Override
    public void Impressao() {
        System.out.println("--- Relatório professor ---");
        System.out.println(super.toString());
        System.out.println(this.toString());
    }

    public void cadastroEfetivado(){
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        return "Classe: " + getClasse() +
               "Situação salarial: " + ObterSituacao();
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) {
        this.classe = classe;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
