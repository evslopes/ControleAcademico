package br.edu.infnet.dominio;

public class Pessoa {
    private Integer id;
    private String nome;
    private int idade;

    private static int posicao;

    public Pessoa(Integer id, String nome, int idade) {
        this.setId(posicao++);
        this.nome = nome;
        this.idade = idade;
    }

    public static int getPosicao() {
        return posicao;
    }

    public static void setPosicao(int posicao) {
        Pessoa.posicao = posicao;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
