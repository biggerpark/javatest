package com.green.day05.ch06;

public class InfRecul {
    public static void main(String[] args) {
        showHi(3);
    }
    public static void showHi(int cnt){
        System.out.println("hi");
        if(cnt==1){
            return;
        }
        showHi(cnt--);//cnt 가 뒤에 --가 붙으므로 읽기->쓰기로 진행되므로 계속 cnt가 3인 showHi 메소드가 무한 반복된다.
    }
}
