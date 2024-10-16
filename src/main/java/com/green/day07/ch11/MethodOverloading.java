package com.green.day07.ch11;

public class MethodOverloading {
    /*
    ❗❗❗-오버로딩은 메소드에만 적용된다.❗❗❗

    -오버로딩은 같은 이름의 메소드를 여러개 정의할 수 있는 기법이다.

    -❗❗오로지 매개변수의 종류 및 순서, 종류가 같더라도 타입의 갯수가 다르다면(같은 이름의 다른 메소드와 매개변수 구분이 된다면) 가능하다.❗❗

    -생성자도 메소드의 한 종류이기 때문에 오버로딩이 된다.

     */
    public void sum(int n1){}
    public void sum(int n1,int n2){}
    //public void sum(int n2,int n1){} 은 안된다. 매개변수의 타입이 달라야한다.
    //public String sum(int n1,int n2){return "String"} 도 안된다. 매개변수가의 타입과 갯수가 같기 때문이다.

    public void sum(int n1,String n2){} // 타입이 다르기 때문에 밑에처럼 순서가 달라져도 구분이 가능해지기 때문에 오버로딩이 된다.
    public void sum(String n2,int n1){}

    public MethodOverloading(){}
    public MethodOverloading(int n1){}
    public MethodOverloading(int n1,int n2){}
    public MethodOverloading(long n1, int n2){}

}
