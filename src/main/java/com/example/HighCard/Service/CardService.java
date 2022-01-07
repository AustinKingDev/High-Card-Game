package com.example.HighCard.Service;

import com.example.HighCard.Models.Card;
import com.example.HighCard.Models.Deck;

public class CardService {

    public static String getOutcome(Deck deck, Card playerCard, Card dealerCard) {
        String outcome = "";

        if (playerCard.compareTo(dealerCard) > 0) {
            outcome = "You Win!";
        }
        else if (playerCard.compareTo(dealerCard) < 0) {
            outcome = "You Lose :(";
        }
        else
            outcome = "Draw";

    return outcome;
    }
}
