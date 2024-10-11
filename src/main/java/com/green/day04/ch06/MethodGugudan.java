package com.green.day04.ch06;

public class MethodGugudan {
    public static void main(String[] args) {
        gugudan(4); // 4단 출력
        gugudan(6); // 6단 출력
        gugudanFromTo(3,9); // 3~9단 까지 출력
        gugudanFromTo(2,8);//2~8단 까지 출력
    }
    static void gugudan(int i){
        for(int n=1;n<10;n++){
            System.out.printf("%d X %d = %d\n",i,n,(i*n));
        }
        System.out.println("----------");
    }

    static void gugudanFromTo(int i,int k){
        for(int j=i;j<=k;j++){
            /*for(int n=1;n<10;n++){
                System.out.printf("%d x %d = %d\n",j,n,(j*n));
            }*/
            gugudan(j); //메소드 호출을 통해 중복된 코드를 메소드로 처리할 수 있다.

        }
        System.out.println("-------");
    }


}
