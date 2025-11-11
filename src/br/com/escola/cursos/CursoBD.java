package br.com.escola.cursos;

import java.util.ArrayList;
import java.util.List;

public abstract class CursoBD {
    private static List<Curso> cursos = new ArrayList<>();
    private int qntDeCursos = 0;

    public static void adicionarCurso(Curso curso){
        cursos.add(curso);
    }

    public static void removerCurso(Curso curso){
        cursos.remove(curso);
    }


    public static List<Curso> getCursos() {
        return cursos;
    }

    public static void setCursos(List<Curso> cursos) {
        CursoBD.cursos = cursos;
    }

    public int getQntDeCursos() {
        return qntDeCursos;
    }

    public void setQntDeCursos(int qntDeCursos) {
        this.qntDeCursos = qntDeCursos;
    }
}
