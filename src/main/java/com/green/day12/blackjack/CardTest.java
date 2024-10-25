package com.green.day12.blackjack;

import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cardDeck=new CardDeck();// 52개의 마구잡이로 섞인 카드뭉치 객체를 생성하고 주소값 부여
        System.out.println("-------------1-------------");
        Card c=cardDeck.draw(); // 카드뭉치의 첫번째 카드를 null 로 바꾸고 Card 타입의 변수에 주는 draw() 메소드
        System.out.println("-------------2-------------");
        System.out.println(c); // 첫번째 카드는 null 로 되어있음(첫번째 카드로 무엇을 주었는지 확인하기)
        System.out.println("-------------3-------------");
        cardDeck.checkCard();
        System.out.println("-------------4-------------");
        Card c2=cardDeck.draw();
        cardDeck.checkCard();
        System.out.println("--------------5------------");
        System.out.println(c2);

//        System.out.println(cardDeck.getDenomination(1));
//        System.out.println(cardDeck.getDenomination(2));
//        System.out.println(cardDeck.getDenomination(3));
//        System.out.println(cardDeck.getDenomination(10));
//        System.out.println(cardDeck.getDenomination(11));
//        System.out.println(cardDeck.getDenomination(12));
//        System.out.println(cardDeck.getDenomination(13));
//        System.out.println(cardDeck.getDenomination(14));


    }
}
class CardTest2{
    public static void main(String[] args) {
        CardDeck cd=new CardDeck();
        System.out.println("----------");
        Card c1=cd.draw();
        Gamer gamer=new Gamer();
        gamer.receiveCard(c1);       //카드를 저장한다.
        gamer.receiveCard(cd.draw());//카드를 저장한다.
        gamer.receiveCard(cd.draw());//카드를 저장한다.
        gamer.receiveCard(cd.draw());//카드를 저장한다.
        gamer.receiveCard(cd.draw());//카드를 저장한다.

        gamer.showYourCards(); //무슨 카드 들고있는지 출력
        System.out.println(gamer.getPoint());
        List<Card> list=gamer.openCards();
        System.out.println(list);


    }
}
class CardTest3{
    public static void main(String[] args) {
        CardDeck cd=new CardDeck();
        Dealer dealer=new Dealer();
        Gamer gamer=new Gamer();
        Rule rule=new Rule();
        System.out.println("---------------");

        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());

        List<Card> list=dealer.openCards();
        System.out.println(list);
        dealer.showYourCards();
        System.out.println(dealer.getPoint());
        dealer.needMoreCard(cd);
        System.out.println("---------------");

        System.out.println("딜러의 점수:"+dealer.getPoint());

        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());

        System.out.println("게이머의 점수:"+gamer.getPoint());

        rule.getWinner(dealer,gamer);




    }
}
