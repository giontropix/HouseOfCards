package memory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Memory memory = new Memory(4, 4);
        do {
            System.out.println("\n" + "Punti: " + memory.getPoint() + "\n");
            System.out.println(memory.toString());
            System.out.println("Quale carta vuoi scoprire?");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci la riga in cui è presente la carta");
            int row = scanner.nextInt();
            System.out.println("Inserisci la riga in cui è presente la carta");
            int column = scanner.nextInt();
            memory.uncoverCard(row, column);
            System.out.println(memory.toString());
            System.out.println("Inserisci la riga in cui è presente l'altra carta");
            int row2 = scanner.nextInt();
            System.out.println("Inserisci la riga in cui è presente l'altra carta");
            int column2 = scanner.nextInt();
            memory.uncoverCard(row2, column2);
            System.out.println(memory.toString());
            if(memory.areCardsEqual(memory.gridOfCards[row][column], memory.gridOfCards[row2][column2]))
                System.out.println("Carte uguali, hai vinto un punto!");
            else System.out.println("Carte diverse, riprova");
        } while(!memory.isWin());
    }
}
