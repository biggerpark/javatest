package com.green.day12.blackjack;

public class Rule {
    private int dealerPoint;
    private int gamerPoint;
    private final int MAX_POINT = 21; // 상수로 최대 점수를 설정

    public void getWinner(Dealer dealer, Gamer gamer) {
        //미션1)
        //1. 각 게이머(게이머, 딜러)의 점수를 얻을 수 있어야한다.
        //2. 값 비교해서 누가 이겼는지 출력
        //3. 경우의수는 비겼다 or 누가 이겼다
        //4. 비겼는 경우: 둘의 값이 같을 경우 or 둘다 21을 넘어선 경우
        //5. 이겼는 경우: 둘의 값 비교해서 더 큰 경우
        this.dealerPoint = dealer.getPoint();
        this.gamerPoint = gamer.getPoint();


//       if(dealerPoint<21&&gamerPoint<21){
//           if(dealerPoint>gamerPoint){
//               System.out.println("딜러가 이겼습니다");
//           } else if (dealerPoint<gamerPoint) {
//               System.out.println("게이머가 이겼습니다");
//           } else if (dealerPoint==gamerPoint) {
//               System.out.println("비겼습니다");
//           }
//       } else if (dealerPoint>21||gamerPoint>21) {
//           if(dealerPoint>21){
//               System.out.println("게이머가 이겼습니다");
//           } else if (gamerPoint>21) {
//               System.out.println("딜러가 이겼습니다");
//           }
//       } else if (dealerPoint>21&&gamerPoint>21) {
//           System.out.println("비겼습니다");
//       } else if (dealerPoint==21&&gamerPoint==21) {
//           System.out.println("비겼습니다");
//
//       }

        if ((dealerPoint == gamerPoint) || (dealerPoint > MAX_POINT && gamerPoint > MAX_POINT)) {
            System.out.println("비겼습니다.");
        } else if ((dealerPoint <= MAX_POINT && dealerPoint > gamerPoint) || gamerPoint > MAX_POINT) { //딜러가 이기는 경우
            System.out.println("딜러 승");
        } else {
            System.out.println("게이머 승");
        }
        System.out.println("------------");
    }
}


//        if((dealerPoint == gamerPoint) || (dealerPoint > MAX_POINT && gamerPoint > MAX_POINT)) {
//            System.out.println("비겼습니다.");
//        } else if( (dealerPoint <= MAX_POINT) && (gamerPoint <= MAX_POINT) ) {
//            if(dealerPoint > gamerPoint) {
//                System.out.println("딜러 승");
//            } else {
//                System.out.println("게이머 승");
//            }
//        } else if(dealerPoint > MAX_POINT) {
//            System.out.println("게이머 승");
//        } else {
//            System.out.println("딜러 승");
//        }
//    }




