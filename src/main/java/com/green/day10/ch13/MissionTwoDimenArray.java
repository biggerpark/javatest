package com.green.day10.ch13;

import java.util.Arrays;

//깃허브에 올라온것과 내가 한것 비교하기

public class MissionTwoDimenArray {
    public static void main(String[] args) {
        int[][] score = {
                //국어,영어,수학 점수
                {100, 90, 80},//영수
                {90, 90, 80},//상철
                {80, 70, 60},//광수
                {12,67,100}//명수
        };

        System.out.println(score.length);

        /*
        영수: 합계점수, 평균점수
        상철: 합계점수, 평균점수
        광수: 합계점수, 평균점수
        국어: 합계점수, 평균점수
        영어: 합계점수, 평균점수
        수학: 합계점수, 평균점수
        학급: 합계점수, 평균점수
         */


        String[] name={"영수","상철","광수","명수"};



        int[] totalSum = new int[score.length];
        int sum1=0;
        for (int i = 0; i < score.length; i++) {
            for (int n = 0; n < score[i].length; n++) {
                sum1+=score[i][n];
            }
            totalSum[i]=sum1;
            System.out.printf("%s- 합계점수:%d, 평균점수:%d\n",name[i],totalSum[i],totalSum[i]/score[i].length);
            sum1=0;
        }

        System.out.println("---------------");


        int subjectSum=0;
        int[] sum3=new int[score.length];

        for(int n=0;n<score.length;n++){
            for(int i=0;i<score.length;i++){
                subjectSum+=score[i][n];
            }
            sum3[n]=subjectSum;
            subjectSum=0;
        }





        int total=0;
        for(int i=0;i<totalSum.length;i++){
            total+=totalSum[i];
        }






//        System.out.printf("영수: %d, %d\n", totalSum[0],totalSum[0]/totalSum.length);
//        System.out.printf("상철: %d, %d\n", totalSum[1],totalSum[1]/totalSum.length);
//        System.out.printf("광수: %d, %d\n", totalSum[2],totalSum[2]/totalSum.length);
//        System.out.printf("국어: %d, %d\n", sum3[0],sum3[0]/sum3.length);
//        System.out.printf("영어: %d, %d\n", sum3[1],sum3[1]/sum3.length);
//        System.out.printf("수학: %d, %d\n", sum3[2],sum3[2]/sum3.length);
//        System.out.printf("합계: %d, %d\n", total, total/ score.length);
//



    }

}
