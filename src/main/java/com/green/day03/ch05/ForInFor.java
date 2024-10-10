package com.green.day03.ch05;

public class ForInFor {
    public static void main(String[] args) {
        /*반복문 안의 반복문
        제일 앞의 for문은 생각하지 말자.
        첫번째 for 문 안의 for 문이 5번 반복
        or
        시간과 분으로 생각.
        첫번째 for 문이 시
        두번째 for 문이 분
        세번째 for 문이 초

        초가 다 끝나야 분이 올라가고, 분이 다 올라가야 시가 올라간다.
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("---------");
            for (int z = 0; z < 5; z++) {  // 이 반복문이 끝나야 위의 반복문으로 돌아간다.
                System.out.printf("[%d,%d]", i, z);
            }
            for (int z = 0; z < 5; z++) {  // 이 반복문이 끝나야 위의 반복문으로 돌아간다.
                System.out.printf("[%d,%d]", i, z);
                System.out.println();
            }
        }
    }
}

