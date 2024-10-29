package com.green.day15.ch21;

//Generic 이 없던 시절의 코드2

public class FruitAndBox2 {
    public static void main(String[] args) {
        FruitBox appleBox=new FruitBox(new Apple());
        FruitBox orangeBox=new FruitBox(new Orange());
        Apple apple=(Apple) appleBox.getFruit();
        Orange orange=(Orange) orangeBox.getFruit();

        FruitBox orangeBox2=new FruitBox("오렌지");
        Orange orange2=(Orange)orangeBox2.getFruit();


        System.out.println("---끝---");

    }




}

class FruitBox{
    private Object fruit;

    FruitBox(Object object){
        this.fruit=object;
    }

    Object getFruit(){
        return fruit;
    }



}