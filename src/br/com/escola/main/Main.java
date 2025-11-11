package br.com.escola.main;

import br.com.escola.cursos.*;
import br.com.escola.funcoes.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicializando sistema
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        //Inicializando Cursos
        Curso cursoBateria = new CursoBateria(8.5f,250,"Bateria Eloy",80);
        Curso cursoGuitarra = new CursoGuitarra(6.45F, 60, "Guia Slasher Guitarrista", 30);
        Curso cursoPiano = new CursoPiano(7.0F, 120, "Guia Mozzart Pianista", 120);

        //Inicializando cursos disponiveis
        CursosDisponiveis.adicionarCurso(cursoBateria);
        CursosDisponiveis.adicionarCurso(cursoGuitarra);
        CursosDisponiveis.adicionarCurso(cursoPiano);

        while (true) {
            Menu.exibirMenu();
            opcao = scanner.nextInt();
            Menu.escolhaMenu(opcao);
        }
    }
}