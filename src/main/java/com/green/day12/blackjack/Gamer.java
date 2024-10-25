package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card 객체 주소값 여러개 저장할 수 있어야한다
    //ArrayList 사용할거임
    //멤버필드 선언, 변수명은 cards
    private List<Card> cards; // Card 객체의 주소값만 저장할 수 있는 배열 변수 선언
    protected int point;


    public Gamer(){
        cards=new ArrayList();
    }

    public void receiveCard(Card card){ //우리가 안배운 switch lamda 식 사용
        int point=switch(card.getDenomination()){
            case "A"->1;
            case "J","Q","K"->10;
            default -> Integer.parseInt(card.getDenomination()); //String 에 들어있는 정수값을 int 타입으로 바꿔줌.
        };
       this.point+=point; // 카드가 들어올때마다 계산해줌
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
    }

    public List<Card> openCards(){
        return cards;
    }

    public int getPoint(){
        return point;
    }



}
