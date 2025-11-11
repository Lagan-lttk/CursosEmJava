package br.com.escola.cursos;

import br.com.escola.interfaces.IGestaoCursos;

public class CursoBateria extends Curso implements IGestaoCursos {

    public CursoBateria(float avaliacao, int duracaoEmDias, String nome, int quantidadeDeAlunos) {
        super(avaliacao, duracaoEmDias, nome, quantidadeDeAlunos);
    }

    @Override
    public void iniciarCurso() {
        System.out.println();
    }

    @Override
    public void encerrarCurso() {
        System.out.println();
    }
}
