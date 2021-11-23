package br.edu.infnet.dominio;

public class Professor extends Pessoa{

    private Integer classe;

    public Professor(Integer id, String nome, int idade, Integer classe) {
        super(id, nome, idade);
        this.classe = classe;
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) {
        this.classe = classe;
    }
}
