package br.com.escola.cursos;

import br.com.escola.interfaces.IGestaoCursos;

public class CursoPiano extends Curso implements IGestaoCursos {

    public CursoPiano(float avaliacao, int duracaoEmDias, String nome, int quantidadeDeAlunos) {
        super(avaliacao, duracaoEmDias, nome, quantidadeDeAlunos);
    }

    @Override
    public void iniciarCurso() {

    }

    @Override
    public void encerrarCurso() {

    }
}
