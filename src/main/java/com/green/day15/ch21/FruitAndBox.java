package com.green.day15.ch21;

//Generic 이 없던 시절의 코드

public class FruitAndBox {
    public static void main(String[] args) {
        Apple apple=new Apple();
        Orange orange=new Orange();

        AppleBox appleBox=new AppleBox(apple);//사과 객체를 담을 수 있는 사과박스 만들었고
        OrangeBox orangeBox=new OrangeBox(orange);// 오렌지 객체를 담을 수 잇는 오렌지 박스를 만들었따

        //제네릭을 알게 되면 이런 박스들을 여러개 만들 필요가 없어진다.



    }
}

class Apple{

    @Override
    public String toString(){
        return "사과";
    }
}

class Orange{

    @Override
    public String toString(){
        return "오렌지";
    }
}

class AppleBox{
    private Apple ap; // 1) 사과 객체의 주소값 하나만 넣을 수 있는 멤버필드 선언

    AppleBox(Apple ap){
        this.ap=ap;
    }

    //메소드를 통해 ap 값을 외부로 리턴시키자
    public Apple getAp(){ // getter 는 멤버필드 이름을 따르도록 명칭하자.
        return this.ap;
    }
}

class OrangeBox{
    private Orange orange;

    OrangeBox(Orange orange){
        this.orange=orange;
    }

    public Orange getOrange(){
        return this.orange;
    }
}