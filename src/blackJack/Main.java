package blackJack;

import cardManager.Card;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack();
        Card dealerCard = blackJack.extractCard();
        blackJack.setDealerPonts(dealerCard.getValue());
        System.out.println("Punti dealer: " + blackJack.getDealerPonts());
        Card playerCard = blackJack.extractCard();
        blackJack.setPlayerPoints(playerCard.getValue());
        System.out.println("Punti giocatore: " + blackJack.getPlayerPoints());
        do {
            System.out.println("\nPescare un'altra carta?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("s")) {
                Card playerCard2 = blackJack.extractCard();
                System.out.println("Punti dealer: " + blackJack.getDealerPonts() + "\n");
                System.out.println("Punti giocatore prima dell'estrazione: " + blackJack.getPlayerPoints());
                System.out.println("Punti carta estratta giocatore: " + playerCard2.getValue());
                blackJack.setPlayerPoints(blackJack.getPlayerPoints() + playerCard2.getValue());
                System.out.println("Punti giocatore: " + blackJack.getPlayerPoints());
                if(blackJack.getPlayerPoints() > 21){
                    System.out.println("Il giocatore ha perso!");
                    return;
                }
            }
            else break;
        } while (blackJack.getPlayerPoints() < 21);

        do {
            if(blackJack.getDealerPonts() < 17) {
                Card dealerCard2 = blackJack.extractCard();
                System.out.println("\nPunti giocatore: " + blackJack.getPlayerPoints() + "\n");
                System.out.println("Punti dealer prima dell'estrazione: " + blackJack.getDealerPonts());
                System.out.println("Punti carta estratta dal dealer: " + dealerCard2.getValue());
                blackJack.setDealerPonts((blackJack.getDealerPonts() + dealerCard2.getValue()));
                System.out.println("Punti dealer: " + blackJack.getDealerPonts());
                if(blackJack.getDealerPonts() > 21){
                    System.out.println("Il dealer ha perso!");
                    return;
                }
            }
        } while (blackJack.getDealerPonts() < 21);
        System.out.println("\n\n Punti giocatore: " + blackJack.getPlayerPoints() + " Punti dealer: " + blackJack.getDealerPonts());
        if(blackJack.getDealerPonts() > blackJack.getPlayerPoints())
            System.out.println("\nHa vinto il dealer");
        else
            System.out.println("\nHa vinto il giocatore");
    }
}
