package com.example.HighCard.Controllers;

import com.example.HighCard.Models.Card;
import com.example.HighCard.Service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.Random;

@Controller
public class CardController {

    @Autowired
    private DeckService deckService;

    @GetMapping
    String getCard(Model model) {
        var deck = deckService.createDeck();
        var rand = new Random();
        int playerNum = rand.nextInt(52);
        int dealerNum = rand.nextInt(52);

        Card playerCard = deck.getAtIndex(playerNum);
        Card dealerCard = deck.getAtIndex(dealerNum);

        model.addAttribute("playerCard", playerCard);
        model.addAttribute("dealerCard", dealerCard);
        return "DeckCount";
    }




}
