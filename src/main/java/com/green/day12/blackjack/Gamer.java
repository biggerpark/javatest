package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card 객체 주소값 여러개 저장할 수 있어야한다
    //ArrayList 사용할거임
    //멤버필드 선언, 변수명은 cards
    private List<Card> cards; // Card 객체의 주소값만 저장할 수 있는 배열 변수 선언
    private int cardPoint;


    public Gamer(){
        cards=new ArrayList();
    }

    public void receiveCard(Card card){
        int point=switch(card.getDenomination()){
            case "A"->1;
            case "J","Q","K"->10;
            default -> Integer.parseInt(card.getDenomination()); //String 에 들어있는 정수값을 int 타입으로 바꿔줌.
        };
        this.cardPoint=cardPoint+point;
//        this.cardPoint+=point;

        cards.add(card);
    }

    public void showYourCards(){
//        for(int i=0;i<cards.size();i++){
//            System.out.println(cards.get(i));
//        }
        for(Card card:cards){
            System.out.println(card);
        }
        System.out.println(cardPoint);
    }

    public List<Card> openCards(){
        return cards;
    }



}
