package com.green.day02.ch05;

public class MissionIf2 {
    public static void main(String[] args) {
        //int score = (int) (Math.random() * 101.0); //0~100사이의 랜덤값 나올 수 있도록 세팅
        // System.out.printf("score: %d\n",score);

        /*
        score값이 90이상이면 A 출력
        80이상이면 B
        70이상이면 C
        나머지는 D 출력
         */
        int score;
        int sum=0;

        while(true){
            score=(int) (Math.random() * 101.0);
            if(score==100){
                break;
            }
            sum+=1;
            System.out.println(score);
        }
        System.out.println(score);
        System.out.println(sum);


//        for (int i = 0; ; i++) {
//            score = (int) (Math.random() * 201.0);
//            if (score == 200) {
//                break;
//            }
//            System.out.println(score);
//        }
//        System.out.println(score);
    }
}







