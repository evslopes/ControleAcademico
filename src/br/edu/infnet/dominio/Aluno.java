package br.edu.infnet.dominio;

public class Aluno extends Pessoa {

    private Integer classe;
    private Float n1, n2;

    public Aluno() {
    }

    private float calcularMedia() {
        return (getN1() + getN2()) / 2;
    }

    @Override
    public String ObterSituacao() {

        float media = calcularMedia();

        if (media <= 4) {
            return "Reprovado" ;
        } else if (media >= 7) {
            return "Aprovado";
        } else return "Prova Final";

    }

    @Override
    public void Impressao() {
        System.out.println("--- Relatório aluno ---");
        System.out.println(super.toString());
        System.out.println(this.toString());
        System.out.println(ObterSituacao() + " Média final: " + calcularMedia());
    }

    public void cadastroEfetivado(){
        System.out.println(super.toString());
    }
    @Override
    public String toString() {
        return "Classe: " + getClasse() +
                ", Nota 1: " + getN1() +
                ", Nota 2: " + getN2();
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
