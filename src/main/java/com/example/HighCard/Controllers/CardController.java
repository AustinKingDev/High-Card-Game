package com.example.HighCard.Controllers;

import com.example.HighCard.Service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;

@Controller
public class CardController {

    @Autowired
    private DeckService deckService;

    @GetMapping
    String getCard(Model model) {
        var deck = deckService.createDeck();
        model.addAttribute("DeckCount", deck.nextCardCircular().toString() );
        return "DeckCount";
    }
}
