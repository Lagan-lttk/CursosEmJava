package br.com.escola.main;

import br.com.escola.cursos.*;
import br.com.escola.funcoes.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicializando sistema
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        //Inicializando Cursos Base
        Curso cursoBateria = new CursoBateria(8.5F,250,"Bateria Eloy",80);
        Curso cursoGuitarra = new CursoGuitarra(6.45F, 60, "Guia Slasher Guitarrista", 30);
        Curso cursoPiano = new CursoPiano(7.0F, 120, "Guia Mozzart Pianista", 120);

        //Adicionando cursos disponiveis
        CursosDisponiveis.adicionarCurso(cursoBateria);
        CursosDisponiveis.adicionarCurso(cursoGuitarra);
        CursosDisponiveis.adicionarCurso(cursoPiano);
        try {
        while (true) {
            Menu.exibirMenu();
            opcao = scanner.nextInt();
            if (opcao == 3){
                cursoPiano.exibirInfo();
                cursoPiano.avaliacao();
                cursoBateria.exibirInfo();
                cursoBateria.avaliacao();
                cursoGuitarra.exibirInfo();
                cursoGuitarra.avaliacao();
                System.out.println("Pressione qualquer tecla para encerrar:");
                scanner.next();

            }
            Menu.escolhaMenu(opcao);
        }
        } catch ( InputMismatchException e){
            System.out.println("\n=-=-=-=-=-=-=-=- 002 =-=-=-=-=-=-=-=-");
            System.out.println("ERRO 002: Informe o dado conforme solicitado!");
            System.out.println("=-=-=-=-=-=-=-=- --- =-=-=-=-=-=-=-=-\n");
        }
    }
}