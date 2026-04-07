package br.com.escola.cursos;

import br.com.escola.interfaces.IGestaoCursos;

public class CursoBateria extends Curso implements IGestaoCursos {

    public CursoBateria(float avaliacao, int duracaoEmDias, String nome, int quantidadeDeAlunos) {
        super(avaliacao, duracaoEmDias, nome, quantidadeDeAlunos);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }

    @Override
    public void avaliacao() {
        System.out.println("Média >= 5");
        System.out.println("Divisão de notas:");
        System.out.println("1 -> Apresentação: 4 pts;");
        System.out.println("1 -> Pesquisa: 2 pts;");
        System.out.println("1 -> Prova: 2 pts;");
        System.out.println("1 -> Atividades: 2 pts;");
    }
}
