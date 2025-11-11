package br.com.escola.funcoes;

import br.com.escola.cursos.Curso;
import br.com.escola.cursos.CursosDisponiveis;
import br.com.escola.cursos.CursosIniciados;

import java.util.Scanner;

public class Menu {

    public static void exibirMenu() {
        System.out.println("=-=-=-=-=-=-=-=- GRAN MUSICAS =-=-=-=-=-=-=-=-\n");
        System.out.println("-> Menu (Informe a opção desejada!)\n");
        System.out.println("1 -> Cadastrar em Curso ;");
        System.out.println("2 -> Meus Cursos ;");
        System.out.println("0 -> Encerrar ;\n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void exibirMenuADM() {
        System.out.println("=-=-=-=-=-=-=-=- A  D  M =-=-=-=-=-=-=-=-\n");
        System.out.println("-> Menu (Informe a opção desejada!)\n");
        System.out.println("1 -> Adicionar Curso;");
        System.out.println("2 -> Remover Curso;");
        System.out.println("9 -> Encerrar ;\n");
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
                try{
                System.out.println("=-=-=-=-=-=-=-=- Adicionar Curso =-=-=-=-=-=-=-=-");
                System.out.println("Informe o nome do curso:");
                nome = scannerADM.nextLine();
                System.out.println("Informe a duração do curso em dias:");
                qntEmdias = scannerADM.nextInt();
                Curso novoCurso = Curso.instanciarCurso(nome,qntEmdias);
                CursosDisponiveis.getCursos().add(novoCurso);
                System.out.println("Curso Adicionado Com Sucesso!");
                break;
                } catch (Exception e){
                    System.out.println("\n=-=-=-=-=-=-=-=- 003 =-=-=-=-=-=-=-=-");
                    System.out.println("ERRO 003: Numero informado Invalido !");
                    System.out.println("=-=-=-=-=-=-=-=- --- =-=-=-=-=-=-=-=-\n");
                } break;

            case 2:
                int index;
                System.out.println("=-=-=-=-=-=-=-=- Remover Curso =-=-=-=-=-=-=-=-");
                System.out.println("-> Cursos Disponiveis:");
                CursosDisponiveis.exibirCursos();
                System.out.println("\nQual curso deseja remover?");
                index = scannerADM.nextInt();
                CursosDisponiveis.adicionarCurso(CursosDisponiveis.getCursos().remove(index));
                System.out.println("Curso removido com Sucesso!");
                break;

            case 3:
                break;
        }
    }

    public static void escolhaMenu(int escolha) {

        Scanner scanner = new Scanner(System.in);

        int cursoDesejado, opcao;
        boolean isIniciado;
        String inscricao;

       switch (escolha) {
           case 1:
               System.out.println("\n=-=-=-=-=-=-=-=- Cursos Disponiveis =-=-=-=-=-=-=-=-\n");
               CursosDisponiveis.exibirCursos();
               System.out.println("\nInforme qual curso deseja iniciar: ");
               try{
               cursoDesejado = scanner.nextInt();
               CursosIniciados.adicionarCurso(CursosDisponiveis.getCursos().get(cursoDesejado));
               System.out.println("Curso iniciado com Sucesso!");
               } catch ( IndexOutOfBoundsException e){
                   System.out.println();
                   System.out.println("\n=-=-=-=-=-=-=-=- 001 =-=-=-=-=-=-=-=-");
                   System.out.println("ERRO 001: Numero informado Invalido !");
                   System.out.println("=-=-=-=-=-=-=-=- --- =-=-=-=-=-=-=-=-\n");
               }
               break;

           case 2:
               if (CursosIniciados.getCursos().isEmpty()){
                   System.out.println("\nNenhum Curso foi iniciado!\n");
               } else {
                   System.out.println("=-=-=-=-=-=-=-=- Cursos Iniciados =-=-=-=-=-=-=-=-");
                   CursosIniciados.exibirCursos();
                   System.out.println("-> Deseja se desincrever de algum curso? ( Y / N )");
                   inscricao = scanner.nextLine();
                   if (inscricao.equals("Y".toLowerCase())) {
                       System.out.println("Informe o numero do curso para ser removido: ");
                       try {
                           cursoDesejado = scanner.nextInt();
                           CursosIniciados.removerCurso(CursosIniciados.getCursos().remove(cursoDesejado));
                           System.out.println("Curso removido com sucesso!");
                       } catch ( IndexOutOfBoundsException e){
                           System.out.println();
                           System.out.println("\n=-=-=-=-=-=-=-=- 001 =-=-=-=-=-=-=-=-");
                           System.out.println("ERRO 001: Numero informado Invalido !");
                           System.out.println("=-=-=-=-=-=-=-=- --- =-=-=-=-=-=-=-=-\n");
                       }
                       break;
                   }
               }
               break;

           case 0:
               System.out.println("Encerrando programa...");
               System.exit(0);
               break;

           case 67:
               while (true){
               exibirMenuADM();
               opcao = scanner.nextInt();
               escolhaMenuADM(opcao);
               if (opcao == 9) {
                   break;
               }
               } break;
       }
    }
}
