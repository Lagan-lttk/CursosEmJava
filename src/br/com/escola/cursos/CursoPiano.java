package br.com.escola.cursos;

import br.com.escola.interfaces.IGestaoCursos;

public class CursoPiano extends Curso implements IGestaoCursos {

    public CursoPiano(float avaliacao, int duracaoEmDias, String nome, int quantidadeDeAlunos) {
        super(avaliacao, duracaoEmDias, nome, quantidadeDeAlunos);
    }

    @Override
    public void iniciarCurso(int Index) {
        System.out.println("Curso Iniciado com Sucesso!");
    }

    @Override
    public void encerrarCurso(int Index) {
        System.out.println("Curso Encerrado com Sucesso!");
    }
}
