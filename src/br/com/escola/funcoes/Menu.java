package br.com.escola.funcoes;

import br.com.escola.cursos.Curso;
import br.com.escola.cursos.CursosDisponiveis;
import br.com.escola.cursos.CursosIniciados;

import java.util.Scanner;

public class Menu {


    public static void exibirMenu() {
        System.out.println("=-=-=-=-=-=-=-=- GRAN MUSICAS =-=-=-=-=-=-=-=-");
        System.out.println("-> Menu (Informe a opção desejada!)");
        System.out.println("");
        System.out.println("1 -> Cadastrar em Curso ;");
        System.out.println("2 -> Meus Cursos ;");
        System.out.println("0 -> Encerrar ;");
        System.out.println("");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void exibirMenuADM() {
        System.out.println("=-=-=-=-=-=-=-=- A  D  M =-=-=-=-=-=-=-=-");
        System.out.println("-> Menu (Informe a opção desejada!)");
        System.out.println("");
        System.out.println("1 -> Adicionar Curso;");
        System.out.println("2 -> Remover Curso;");
        System.out.println("3 -> Encerrar ;");
        System.out.println("");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void escolhaMenuADM(int escolha) {

        Scanner scannerADM = new Scanner(System.in);
        String inscricao;
        int cursoDesejado;
        int ADM = 0;


        switch (escolha){

            case 1:

                String nome;
                int qntEmdias;

                System.out.println("=-=-=-=-=-=-=-=- Adicionar Curso =-=-=-=-=-=-=-=-");
                System.out.println("Informe o nome do curso:");
                nome = scannerADM.nextLine();
                System.out.println("Informe a duração do curso em dias:");
                qntEmdias = scannerADM.nextInt();
                Curso novoCurso = Curso.instanciarCurso(nome,qntEmdias);
                CursosDisponiveis.getCursos().add(novoCurso);
                System.out.println("Curso Adicionado Com Sucesso!");
                break;

            case 2:
                int index;
                System.out.println("=-=-=-=-=-=-=-=- Remover Curso =-=-=-=-=-=-=-=-");
                System.out.println("-> Cursos Disponiveis:");
                CursosDisponiveis.exibirCursos();
                System.out.println("Qual curso deseja remover?");
                index = scannerADM.nextInt();
                CursosDisponiveis.removerCurso(CursosDisponiveis.getCursos().remove(index));
                System.out.println("Curso removido com Sucesso!");
                break;

            case 3:
                break;
        }
    }

    public static void escolhaMenu(int escolha) {

        Scanner scanner = new Scanner(System.in);

        int cursoDesejado, opcao;
        String inscricao;

       switch (escolha) {
           case 1:
               System.out.println("=-=-=-=-=-=-=-=- Cursos Disponiveis =-=-=-=-=-=-=-=-");
               CursosDisponiveis.exibirCursos();
               System.out.println("Informe qual curso deseja iniciar: ");
               cursoDesejado = scanner.nextInt();
               CursosIniciados.adicionarCurso(CursosDisponiveis.getCursos().get(cursoDesejado));
               System.out.println("Curso iniciado com Sucesso!");
               break;

           case 2:
               System.out.println("=-=-=-=-=-=-=-=- Cursos Iniciados =-=-=-=-=-=-=-=-");
               CursosIniciados.exibirCursos();
               System.out.println("-> Deseja se desincrever de algum curso? ( Y / N )");
               inscricao = scanner.nextLine();
               if (inscricao.equals("Y".toLowerCase())){
                   System.out.println("Informe o numero do curso para ser removido: ");
                   cursoDesejado = scanner.nextInt();
                   CursosIniciados.removerCurso(CursosIniciados.getCursos().remove(cursoDesejado));
                   System.out.println("Curso removido com sucesso!");
                   break;
               }
               break;

           case 0:
               System.out.println("Encerrando programa...");
               System.exit(0);
               break;

           case 67:
               exibirMenuADM();
               opcao = scanner.nextInt();
               escolhaMenuADM(opcao);
               break;
       }
    }
}
