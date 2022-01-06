package com.example.HighCard.Service;

import com.example.HighCard.Models.Deck;
import org.springframework.stereotype.Service;

@Service
public class DeckService {

    public Deck createDeck() {
        String deckString = "AH AC AD AS JH JC JD JS QH QC QD QS KH KC KD KS";
        for (int i=2; i<=10;i++) {
           deckString += " " + i +"H";
           deckString += " " + i +"C";
           deckString += " " + i +"D";
           deckString += " " + i +"S";
        }
        var deck = new Deck(deckString);
        return deck;
    }
}
