package blackJack;

import cardManager.Card;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack();
        Card dealerCard = blackJack.extractCard();
        blackJack.setDealerPoints(dealerCard.getValue());
        System.out.println("Prima carta dealer: " + dealerCard.getValue() + " di " + dealerCard.getSeed());
        Card playerCard = blackJack.extractCard();
        playerCard.setCardOfDealer(false);
        blackJack.setPlayerPoints(playerCard.getValue());
        System.out.println("Prima carta giocatore: " + playerCard.getValue() + " di " + playerCard.getSeed());
        do {
            System.out.println("\nPescare un'altra carta?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("s")) {
                Card playerCard2 = blackJack.extractCard();
                playerCard2.setCardOfDealer(false);
                System.out.println("Punti dealer: " + blackJack.getDealerPoints() + "\n");
                System.out.println("Punti giocatore prima dell'estrazione: " + blackJack.getPlayerPoints());
                System.out.println("Carta estratta giocatore: " + playerCard2.getValue() + " di " + playerCard2.getSeed());
                blackJack.setPlayerPoints(blackJack.getPlayerPoints() + playerCard2.getValue());
                System.out.println("Punti giocatore: " + blackJack.getPlayerPoints());
                if(blackJack.getPlayerPoints() > 21){
                    System.out.println("Il giocatore ha perso!");
                    return;
                }
            }
            else if(answer.equalsIgnoreCase("a"))
                blackJack.setAssoToEleven();
            else break;
        } while (blackJack.getPlayerPoints() < 21);

        do {
            if(blackJack.getDealerPoints() < 17) {
                Card dealerCard2 = blackJack.extractCard();
                System.out.println("\nPunti giocatore: " + blackJack.getPlayerPoints() + "\n");
                System.out.println("Punti dealer prima dell'estrazione: " + blackJack.getDealerPoints());
                System.out.println("Punti carta estratta dal dealer: " + dealerCard2.getValue() + " di " + dealerCard2.getSeed());
                blackJack.setDealerPoints((blackJack.getDealerPoints() + dealerCard2.getValue()));
                System.out.println("Punti dealer: " + blackJack.getDealerPoints());
                if(blackJack.getDealerPoints() > 21){
                    System.out.println("Il dealer ha perso!");
                    return;
                }
            }
        } while (blackJack.getDealerPoints() < 21);
        System.out.println("\n\n Punti giocatore: " + blackJack.getPlayerPoints() + " Punti dealer: " + blackJack.getDealerPoints());
        if(blackJack.getDealerPoints() > blackJack.getPlayerPoints())
            System.out.println("\nHa vinto il dealer");
        else
            System.out.println("\nHa vinto il giocatore");
    }
}
