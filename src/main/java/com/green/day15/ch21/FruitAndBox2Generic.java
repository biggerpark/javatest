package com.green.day15.ch21;

public class FruitAndBox2Generic {
    public static void main(String[] args) {
        BoxGeneric<Apple> appleBox=new BoxGeneric<>(new Apple());
        Apple apple=appleBox.getBox();

        BoxGeneric<Orange> orangeBox=new BoxGeneric<>(new Orange());
        Orange orange=orangeBox.getBox();

//        FruitBoxGeneric<Orange> orangeBox2=new FruitBoxGeneric<>(new String());
//        Orange orange2=orangeBox2.getFruit();

        //new 부분에 <>를 생략하면 객체는 타입이 Object 가 된다.


    }
}
class BoxGeneric<T>{
    // 아직까지 type 이 정해지지 않았다. 객체화가 될때 <>안에 넣은 type 으로 type 을 정하겠다. 만약 생략하면 T 부분에 Object 가 들어간다.
    private T fruit;

    BoxGeneric(T fruit){
        this.fruit=fruit;
    }

    T getBox(){
        return this.fruit;
    }
}
