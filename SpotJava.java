/*Devs:
Jhimy Kenedy Souza Ferrari
Rafael Gaspar Severo */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

/**
 *
 * @author senna
 */
public class SpotJava {
    // A linkedList possui os seguintes métodos
    // pool() -> Pega o último elemento sem remover da fila
    // remove() -> Pega o último elemento removendo ele da fila
    // add(elemento) -> Adiciona um elemento no final da fila

    public static Queue<String> filaDeMusicas = new LinkedList<>();
    public static Scanner read = new Scanner(System.in);
    public static String Musica = "a";
    public static String Yellow = "\u001B[33m";
    public static String Reset = "\u001B[0m";
    public static String Green = "\u001B[32m";

    public static void main(String[] args) throws InterruptedException {
        System.out.println("____________________________________________________________________________________________________________________________");Thread.sleep(100);
        System.out.println(Green+"      .....        ......        ......        ......        .....        .......       ......        ......        ....");Thread.sleep(100);
        System.out.println(".....        ......        ......        ......        .....        .......       ......        ......        ....");Thread.sleep(100);
        System.out.println("  ....        ......        ......       .......        .....        ......        ......        ......        .....      " );Thread.sleep(100);
        System.out.println("  ....        ......        ......       .......!##########################!       ......        ......        .....       " );Thread.sleep(100);
        System.out.println("        .....        ......        .....::#######!::...        .....   .::!#######:.      ......        ......        ....");Thread.sleep(100);
        System.out.println("       .....        ......        .:######:.    ......        .....        ....:######.  ......        ......        ....");Thread.sleep(100);
        System.out.println("                                .#####!.                                            .!#####.                              ");Thread.sleep(100);
        System.out.println("  ....        ......        ..!####.     .......        .....        ......        .....:####!.  ......        .....      ");Thread.sleep(100);
        System.out.println("  ....        ......       .####..       .......        .....        ......        ......  .####.......        .....      ");Thread.sleep(100);
        System.out.println("        .....        ....:###!.    ......        ......        ...::::!#########...       ...:####.     ......        ....");Thread.sleep(100);
        System.out.println("        .....        ...!###.      ......        ...:!!!########################...       ......###!    ......        ....");Thread.sleep(100);
        System.out.println("  ....        ......  :#### ......       .......   #############################.  ......        ####:.        .....      ");Thread.sleep(100);
        System.out.println("  ....        ...... :###:  ......       .......   #############################.  ......        .:###:        .....      ");Thread.sleep(100);
        System.out.println("                    .###:                         .##################!....  :###.                  .###:                  ");Thread.sleep(100);
        System.out.println("        .....      .###!...        ......        ..####!.      .....        :###...       ......   .!###......        ....");Thread.sleep(100);
        System.out.println("        .....      .###:...        ......        ..###:        .....        :###...       ......    .###......        ....");Thread.sleep(100);
        System.out.println("  ....        ......###.    ......       .......   ###: .....        ...... .###.  ......        ...:###.      .....      ");Thread.sleep(100);
        System.out.println("  ....        ......###.    ......       .......   ###: .....        ...... .###.  ......        ...:###.      .....      ");Thread.sleep(100);
        System.out.println("        .....      .###:...        ......        ..###:        .....   :!!!#####...       ......    .###......        ....");Thread.sleep(100);
        System.out.println("        .....       !###...        ......        ..###:        ..!##############...       ......   .###!......        ....");Thread.sleep(100);
        System.out.println("  ....        ......:###!   ......       ..:::########: .....   !###############.  ......        ..!###.       .....      ");Thread.sleep(100);
        System.out.println("  ....        ...... :###!  ......     !##############: .....   !##############.   ......        .####:        .....      ");Thread.sleep(100);
        System.out.println("                      .!###.         .!###############:           !########!:                   .###!.                    ");Thread.sleep(100);
        System.out.println("        .....        ...!###!      ...:#############!..        .....        .......       .....!###!    ......        ....");Thread.sleep(100);
        System.out.println("        .....        .....####:    ......########!.....        .....        .......       ...:####      ......        ....");Thread.sleep(100);
        System.out.println("  ....        ......       .!####.       .......        .....        ......        ...... .####!.......        .....      ");Thread.sleep(100);
        System.out.println("  ....        ......        ...!###!:    .......        .....        ......        ....:!###!.   ......        .....      ");Thread.sleep(100);
        System.out.println("        .....        ......       #####!.        ......        .....        ........!#####......        ......        ....");Thread.sleep(100);
        System.out.println("        .....        ......        ..:!#####:.   ......        .....        ..:!#####!.   ......        ......        ....");Thread.sleep(100);
        System.out.println("                                         ..########!!!.              :!!!########..                                       ");Thread.sleep(100);
        System.out.println("  ....        ......        ......       ....... .!!!##################!!!.        ......        ......        .....      ");Thread.sleep(100);
        System.out.println("  ....        ......        ......       .......        .....        ......        ......        ......        .....      ");
        System.out.println("        .....        ......        ......        ......        .....        .......       ......        ......        ...."+ Reset);Thread.sleep(100);
        System.out.println("____________________________________________________________________________________________________________________________");Thread.sleep(100);

  
      
        int opcaoDoUsuario = 0;
        
        do {

            if(filaDeMusicas.size()==0){
                Musica="Fila Vazia";
            }
            else{
                Musica= String.format("%-10s", filaDeMusicas.element());

            }
            mostraMenu();
            System.out.print("Escolha a operação:");
            opcaoDoUsuario =read.nextInt();
           
      Thread.sleep(170);
      System.out.println("\n");
            
            switch(opcaoDoUsuario) {
                case 0: 
                    System.out.println("Saindo do programa");
                    break;
                case 1:
                    adicionaMusica();

                    break;
                case 2:
                    passaParaProximaMusica();
                    break;
                case 3:
                    mostraFilaDeMusicas();
                    break;
                case 4:
                    limpaFilaDeMusicas();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
           
            
        } while (opcaoDoUsuario != 0);
    }

    public static void mostraMenu() throws InterruptedException {
        // Mostra o menu do player de música
        System.out.println("+----------------------------------+" + Green + ".......................................|");
        Thread.sleep(170);
        System.out.println(
                Reset + "| SpotFire Pre-Alfa-Beta 1980      |" + Green + "...........|||||||||||||||||...........|");
        Thread.sleep(170);
        System.out.println(
                Reset + "+----------------------------------+" + Green + ".......|||||||||||||||||||||||||.......|");
        Thread.sleep(170);
        System.out.println(Reset + "|Musicas na fila:                " + filaDeMusicas.size() + " |" + Green
                + ".....|||||||||||||||||||||||||||||.....|");
        Thread.sleep(170);
        System.out.println(
                Reset + "+----------------------------------+" + Green + "...||||......................|||||||...|");
        Thread.sleep(170);
        System.out.println(Reset + "|Musicas atual: " + Musica + "         |" + Green
                + "..|||||||||||||||||||||||||.....|||||..|");
        Thread.sleep(170);
        System.out.println(
                Reset + "+----------------------------------+" + Green + "..|||||||..................||||||||||..|");
        Thread.sleep(170);
        System.out.println(
                Reset + "|[1] Adicionar Musica              |" + Green + "..|||||||||||||||||||||||||...|||||||..|");
        Thread.sleep(170);
        System.out.println(
                Reset + "|[2] Proxima Musica                |" + Green + "...||||||.....||||||.......|||||||||...|");
        Thread.sleep(170);
        System.out.println(
                Reset + "|[3] Mostrar fila de musica        |" + Green + ".....|||||||||||||||||||||||||||||.....|");
        Thread.sleep(170);
        System.out.println(
                Reset + "|[4] Limpar fila de musica         |" + Green + ".......|||||||||||||||||||||||||.......|");
        Thread.sleep(170);
        System.out.println(
                Reset + "|[0] Sair                          |" + Green + "...........|||||||||||||||||...........|");
        Thread.sleep(170);
        System.out.println(Reset + "+----------------------------------+" + Green
                + ".......................................|" + Reset);
        Thread.sleep(170);

    }

    public static void adicionaMusica() throws InterruptedException {

        System.out.print("Informe o nome da musica:");
        read.nextLine();
        String NomeMusica = read.nextLine();
        filaDeMusicas.add(NomeMusica);
        // Pergunta o nome da música para o usuário

        // le o nome da musica

        // Adiciona ela na fila
        System.out.println("\n\n");
        Thread.sleep(170);

    }

    public static void passaParaProximaMusica() throws InterruptedException {

        String proximaMusica = filaDeMusicas.remove();

        System.out.println("Reproduzindo: " + proximaMusica + "\n\n");
        Thread.sleep(170);

    }

    public static void mostraFilaDeMusicas() throws InterruptedException {
        // Mostra a fila de músicas
        System.out.println("Fila de Musicas:");
        for (String Musica : filaDeMusicas) {
            System.out.println(Musica);
            Thread.sleep(170);

        }
    }

    public static void limpaFilaDeMusicas() {
        // Tirar todas as musicas da fila
        System.out.println("Limpando Fila de Musicas \n\n");
        filaDeMusicas.clear();

    }

}