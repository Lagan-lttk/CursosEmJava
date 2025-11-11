package br.com.escola.cursos;

import br.com.escola.interfaces.IGestaoCursos;

import java.util.ArrayList;
import java.util.List;

public class CursosIniciados implements IGestaoCursos {
    private static List<Curso> cursos = new ArrayList<>();
    private int qntDeCursos = 0;

    public CursosIniciados( int qntDeCursos) {
        this.cursos = cursos;
        this.qntDeCursos = qntDeCursos;
    }

    public static void adicionarCurso(Curso curso){
        cursos.add(curso);
    }

    public static void removerCurso(Curso curso){
        cursos.remove(curso);
    }

    public static void exibirCursos() {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(i+" -> "+cursos.get(i).getNome());
        }
    }

    public static List<Curso> getCursos() {
        return cursos;
    }

    public static void setCursos(List<Curso> cursos) {
        CursosIniciados.cursos = cursos;
    }

    public int getQntDeCursos() {
        return qntDeCursos;
    }

    public void setQntDeCursos(int qntDeCursos) {
        this.qntDeCursos = qntDeCursos;
    }

    @Override
    public void iniciarCurso(int Index) {
        getCursos().get(Index).setIniciado(true);
    }

    @Override
    public void encerrarCurso(int Index) {
        getCursos().get(Index).setIniciado(false);
    }
}
