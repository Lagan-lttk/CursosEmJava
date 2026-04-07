package br.com.escola.cursos;
import java.util.ArrayList;
import java.util.List;

public class CursosDisponiveis extends CursoBD {

    private static List<Curso> cursos = new ArrayList<>();
    private int qntDeCursos = 0;

    public CursosDisponiveis() {
        this.cursos = cursos;
        this.qntDeCursos = qntDeCursos;
    }

    public static void adicionarCurso(Curso curso){
        cursos.add(curso);
    }

    public static void encerrarCurso(Curso curso){
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
        CursosDisponiveis.cursos = cursos;
    }

    public int getQntDeCursos() {
        return qntDeCursos;
    }

    public void setQntDeCursos(int qntDeCursos) {
        this.qntDeCursos = qntDeCursos;
    }

}
