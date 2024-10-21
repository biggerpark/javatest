package com.green.day07.ch07;


/*

혼자 뻘짓 해보기

 */
public class CarTest1 {
    public static void main(String[] args) {
        Car1 c1=new Car1("제네시스","회색","3단",5);

        System.out.println(c1);

    }
}

class Car1{
    private String model;
    private String color;
    private String gear;
    private int door;

    Car1(String model,String color,String gear,int door){
        this.model=model;
        this.gear=gear;
        this.color=color;
        this.door=door;
    }

    Car1(){

    }

    void introduce(){

    }

    public String toString(){
        return "모델은\t"+model+"\t컬러는\t"+color+"\t기어는\t"+gear;
    }


}

