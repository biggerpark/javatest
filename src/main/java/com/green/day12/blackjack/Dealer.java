package com.green.day12.blackjack;

public class Dealer extends Gamer {

    public void needMoreCard(CardDeck cd) {
        //본인이 16점 이하면 한장 더 받는다
        if (this.point <= 16) {
            receiveCard(cd.draw());
        }
    }


}

