package br.com.escola.cursos;

public class Curso {

    private String nome;
    private int quantidadeDeAlunos;
    private int duracaoEmDias;
    private float avaliacao;

    public Curso(float avaliacao, int duracaoEmDias, String nome, int quantidadeDeAlunos) {
        this.avaliacao = avaliacao;
        this.duracaoEmDias = duracaoEmDias;
        this.nome = nome;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public static Curso instanciarCurso(String nome, int duracaoEmDias){
        return new Curso(0.0F,duracaoEmDias,nome,0);
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        if (avaliacao > 10.0F) {
            System.out.println("ERRO: A nota máxima é 10,0!");
        }
        this.avaliacao = avaliacao;
    }

    public float getDuracao() {
        return duracaoEmDias;
    }

    public void setDuracao(float duracao) {
        if (duracao > 365.0F) {
            System.out.println("ERRO: A duração maxima de um curso pode ser apenas 1 ano.");
        }
        this.duracaoEmDias = duracaoEmDias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        if (quantidadeDeAlunos > 60) {
            System.out.println("ERRO: A turma está cheia");
        }
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }



}
