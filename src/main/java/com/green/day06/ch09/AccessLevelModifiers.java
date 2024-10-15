package com.green.day06.ch09;

public class AccessLevelModifiers {
    /*
    ❗❗ 접근수준지시자: private,default,protected,public ❗❗

    1) private(은닉화,캡슐화)
    -같은 class 내에서만 접근 가능
    -멤버필드 앞에는 대부분 private 이 붙는다.
    -멤버필드에서 private 을 붙이지 않아도 되는 경우가 있다 -> 상수는 오픈해도 된다(final 이 붙는 변수)
    -다른 변수에는 무조건 private 을 해야한다.
    -private 되어있는 멤버필드를 읽기/쓰기할 때 메소드를 통해서 한다 (getters/setters)

    2) default
    -아무것도 안적은 경우, private 의 경우+같은 패키지(위에 떠있는 package 경로가 같은 경우)면 접근 가능

    3) protected
    -default+상속관계면 접근 가능

    4) public
    -무조건 접근 가능, 완전 오픈
    -이 public 이 붙을 수 있는 class 는 파일 이름과 같은 이름의 class 에만 public 이 붙을 수 있다.
    -그래서 만약 public 으로 쓰고 싶은 class 가 있다면 새로운 java 파일을 클래스 이름과 동일하게 만들어야 한다.
    -1 class 당 1 파일 만들면 된다.



     */
    
}
