package com.green.day05.ch06;

public class StackStudy {
    public static void main(String[] args) {
        System.out.println("--main [start]--");
        methodA(); //메인 메소드가 끝나기 전에 methodA 가 쌓인다. 그럼 메인 메소드가 끝나지 않고 methodA가 호출된다.
        System.out.println("--main [end]--");
    }

    static void methodA(){
        System.out.println("--methodA [start]--");
        methodB(); // methodB가 호출되서 사용된다. methodB가 다 실행되어야 다음 코드가 실행된다.
        System.out.println("--methodA [end]--");
    }
    static void methodB(){
        System.out.println("--methodB [start]--");
        System.out.println("--methodB [end]--"); // 마지막으로 이 코드가 끝나면 return 키워드를 만나 methodA 에서 호출된 methodB로 돌아간다.
    }
}
