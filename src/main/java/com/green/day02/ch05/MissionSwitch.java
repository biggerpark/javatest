package com.green.day02.ch05;

import java.util.Scanner;

public class MissionSwitch {
    public static void main(String[] args) {
        //남성은 172cm, 여성은 159cm 평균
        Scanner scan = new Scanner(System.in);
        System.out.println("성별을 입력해주세요. (w/m)");
        String gender = scan.next();
        System.out.println("키를 정수값으로 입력해주세요. (cm)");
        int height = scan.nextInt();

        //당신은 평균입니다
        //당신은 평균보다 큽니다
        //당신은 평균보다 작습니다.

        if ((height < 172) && (height > 159)) {
            switch (gender) {
                case ("m"):
                    System.out.println("당신은 평균보다 작습니다");
                    break;
                case ("w"):
                    System.out.println("당신은 평균보다 큽니다");
                    break;
            }
        } else if ((height > 172)) {
            switch (gender) {
                case ("m"):
                    System.out.println("당신은 평균보다 큽니다");
                    break;
                case ("w"):
                    System.out.println("당신은 평균보다 큽니다");
                    break;
            }
        } else if ((height == 172) || (height == 159)) {
            switch (gender) {
                case ("m"):
                    System.out.println("당신은 평균입니다");
                    break;
                case ("w"):
                    System.out.println("당신은 평균입니다");
                    break;
            }
        }else{
            System.out.println("당신은 평균보다 작습니다.");
        }


        int a=0 ; //변수 초기화와 변수 선언의 차이?, 변수 초기화는 반드시 해야하는것인가
        /*밑에 switch 에서 gender가 m이냐 w이어야 활성화가 된다.
        만약 m,w가 아니면 활성화가 되지 않아서 밑의 코드로 넘어가는데,  a가 값이 초기화되어있지않으므로 빨간줄이 뜬다.*/

        switch (gender){
            case("m"):
                a=172;
                break;
            case("w"):
                a=159;
                break;
        }
        if(height>a){

        }
    }
}

