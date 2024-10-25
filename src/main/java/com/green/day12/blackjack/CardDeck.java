package com.green.day12.blackjack;

public class CardDeck {
    //Card 객체 주소값 52개 저장할 수 있어야 한다.
    private final Card[] cards;
    //Card 타입의 주소값 저장할 수 있는 배열변수 선언
    //final 을 붙임으로써 다른 객체의 주소값을 받을 수 없는 배열변수 멤버필드를 생성
    private int selectedIdx=0;//외부에 줘야할 카드의 idx 값(방번호)

    private final String[] patterns;

    //지역변수는 처음에 초기화를 해줘야한다. 전역변수는 초기화가 안되어있어도 객체화가 되면 default 값을 가진다.

    public CardDeck() {
        cards = new Card[52]; //Card 객체 주소값을 저장할 수 있는 방 52개 생성
        patterns = new String[]{"◆", "❤", "Clova", "Spade"};//패턴 배열을 선언해주면서 초기화



        //미션1:  "", "" 값을 가지고 있는 Card 객체를 52개 만들어주시고 cards 배열에 하나씩 넣어라


//        for(int i=0;i<cards.length;i++) {
//           cards[i]=new Card("A","B"); // A(B)
//        }

        //미션4) getDenomination 메소드와 patterns 배열을 이용하여 모두 각기 다른 값들이 나오도록 출력해보자.
        int idx = 0; // ❗❗52번의 반복을 기록해줄수 있는 변수 설정❗❗
        for (int i = 0; i < patterns.length; i++) {
            String str = patterns[i];
            for (int z = 1; z <= 13; z++) {
                String str2 = getDenomination(z);
                cards[idx++] = new Card(str, str2); // 각 방에 생성자를 통해 객체 주소값 초기화
            }
        }


        //미션5) 섞어주세요
//        for(int n=1;n<cards.length;n++){
//            int rIdx=(int)(Math.random()* cards.length);
//
//            Card temp=cards[n];
//            cards[n]=cards[rIdx];
//            cards[rIdx]=temp;
//        }
        shuffle(); // 메소드를 활용한것.




        //미션2) enhanced-for 문으로 card 객체 주소값 전부 출력
        for (Card card : cards) {
            System.out.println(card);
        }
    }


    //미션3) getDenomination 메소드를 들어오는 값에 따라 다른 숫자가 나오도록 메소드를 만들어보자
    public String getDenomination(int n) {
//        if (n > 1 && n < 11) {
//            return String.valueOf(n);
//        } else {
//            switch (n) {
//                case 1:
//                    return "A";
//                case 11:
//                    return "J";
//                case 12:
//                    return "Q";
//                case 13:
//                    return "K";
//                default:
//                    return " ";

        if (n < 1 || n > 13) {
            return ""; // 빈문자열을 따옴표 안에 스페이스도 하면 안된다.
        }
        switch (n) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default: //default 값으로 하면 다른 값들은 다 밑의 값으로 출력이 된다.
                return String.valueOf(n);

        }
    }
    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int rIdx = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }
    }

    //미션6) Card deck 에서 카드를 빼주고, 그 값을 null 로 바꿔주는 메소드를 만들어주세요
    public Card draw() {
        Card c =cards[selectedIdx];//지우기 전에 c라는 객체 주소값 변수에 옮겨두는것(c는 나중에 return 시켜야함, swapping 개념 들어간것)
        cards[selectedIdx]=null;// 카드를 뽑아서 주고 나면 그 카드는 카드덱에서 없어지므로 null 로 표현
        selectedIdx++;
        return c; //리턴타임은 Card 타입의 객체 주소값
    }

    public void checkCard(){
        for (Card card : cards) {
            System.out.println(card);
        }
    }


}

