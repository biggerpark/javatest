package com.green.day12.blackjack;

public class Card {
    private final String pattern; // 무늬
    private final String denomination; // A, 2~10, J,Q,K 값 저장



    public Card(final String pattern, final String denomination){ //생성자를 붙이면 멤버필드가 final 이라도 값이 들어올때까지 기다려준다.
        this.pattern=pattern;
        this.denomination=denomination;
    }



    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }



    @Override
    public String toString(){ //toString() 메소드를 오버라이딩 해줘서 원하는 값이 나오게 해주는것.
        return String.format("%s(%s)",this.pattern,this.denomination);
    }
}
