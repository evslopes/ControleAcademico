package br.edu.infnet.model;

import java.util.Arrays;

public class ControleAcademico {
    String[] Alunos;
    Float[] AV1, AV2;

    public String[] getAlunos() {
        return Alunos;
    }

    public void setAlunos(String[] alunos) {
        Alunos = alunos;
    }

    public Float[] getAV1() {
        return AV1;
    }

    public void setAV1(Float[] AV1) {
        this.AV1 = AV1;
    }

    public Float[] getAV2() {
        return AV2;
    }

    public void setAV2(Float[] AV2) {
        this.AV2 = AV2;
    }

    @Override
    public String toString() {
        return "ControleAcademico{" +
                "Alunos=" + Arrays.toString(Alunos) +
                ", AV1=" + Arrays.toString(AV1) +
                ", AV2=" + Arrays.toString(AV2) +
                '}';
    }

}
