package memory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Memory memory = new Memory(4, 4);
        int row, column, row2, column2;
        boolean intoGrid;
        do {
            System.out.println("\n" + "Punti: " + memory.getPoint() + "\n");
            System.out.println(memory.toString());
            System.out.println("Quale carta vuoi scoprire?");
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Inserisci la riga in cui è presente la carta");
                row = scanner.nextInt();
                System.out.println("Inserisci la riga in cui è presente la carta");
                column = scanner.nextInt();
                if (memory.intoFieldController(row, column)) {
                    memory.uncoverCard(row, column);
                    System.out.println(memory.toString());
                    intoGrid = true;
                }
                else {
                    System.out.println("Non ci sono carte nelle coordinate selezionate\n");
                    System.out.println(memory.toString());
                    intoGrid = false;
                }
            }while (!intoGrid);
            do {
                System.out.println("Inserisci la riga in cui è presente l'altra carta");
                row2 = scanner.nextInt();
                System.out.println("Inserisci la riga in cui è presente l'altra carta");
                column2 = scanner.nextInt();
                if (memory.intoFieldController(row2, column2)) {
                    memory.uncoverCard(row2, column2);
                    System.out.println(memory.toString());
                    intoGrid = true;
                }
                else {
                    System.out.println("Non ci sono carte nelle coordinate selezionate\n");
                    System.out.println(memory.toString());
                    intoGrid = false;
                }
            }while (!intoGrid);
            System.out.println(memory.toString());
            if(memory.isCardEqual(memory.gridOfCards[row][column], memory.gridOfCards[row2][column2]))
                System.out.println("Carte uguali, hai vinto un punto!");
            else System.out.println("Carte diverse, riprova");
        } while(!memory.isWin());
    }
}
