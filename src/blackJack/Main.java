package blackJack;

import cardManager.Card;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack();
        Card dealerCard = blackJack.extractCard();
        blackJack.setDealerPonts(dealerCard.getValue());
        System.out.println("Punti dealer: " + blackJack.getDealerPonts());
        do{
            Card playerCard = blackJack.extractCard();
            blackJack.setPlayerPoints(playerCard.getValue());
            System.out.println("Punti giocatore: " + playerCard.getValue());
            System.out.println("Pescare un'altra carta?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("si")) {
                Card playerCard2 = blackJack.extractCard();
                blackJack.setPlayerPoints(playerCard2.getValue() + playerCard.getValue());
                System.out.println("Punti giocatore: " + blackJack.getPlayerPoints());
            }
            else break;
        }while (blackJack.getPlayerPoints() < 21);
        do{
            blackJack.dealerGame();
            System.out.println("Punti dealer: " + blackJack.getDealerPonts());
        }while (blackJack.getDealerPonts() < 21);
    }
}
