package br.edu.infnet.dominio;

public class Aluno extends Pessoa{

    private Integer classe;
    private Float n1, n2;

    public Aluno(Integer id, String nome, int idade) {
        super(id, nome, idade);
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) {
        this.classe = classe;
    }

    public Float getN1() {
        return n1;
    }

    public void setN1(Float n1) {
        this.n1 = n1;
    }

    public Float getN2() {
        return n2;
    }

    public void setN2(Float n2) {
        this.n2 = n2;
    }
}
